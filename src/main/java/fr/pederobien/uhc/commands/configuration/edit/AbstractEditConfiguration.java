package fr.pederobien.uhc.commands.configuration.edit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import fr.pederobien.uhc.commands.configuration.edit.editions.AbstractEdition;
import fr.pederobien.uhc.dictionary.dictionaries.MessageCode;
import fr.pederobien.uhc.interfaces.IEditConfiguration;
import fr.pederobien.uhc.interfaces.IHelper;
import fr.pederobien.uhc.interfaces.IMapEdition;
import fr.pederobien.uhc.interfaces.IPersistence;
import fr.pederobien.uhc.interfaces.IUnmodifiableName;
import fr.pederobien.uhc.observers.IObsMessageSender;

public class AbstractEditConfiguration<T extends IUnmodifiableName> extends AbstractEdition
		implements IEditConfiguration<T> {
	private IPersistence<T> persistence;
	private IHelper<T> helper;
	private List<IObsMessageSender> observers;
	private HashMap<String, IMapEdition<T>> editions;
	private boolean available;

	public AbstractEditConfiguration(IPersistence<T> persistence, String label, MessageCode explanation) {
		super(label, explanation);
		this.persistence = persistence;
		this.persistence.addObserver(this);
		available = true;

		editions = new HashMap<String, IMapEdition<T>>();
		observers = new ArrayList<IObsMessageSender>();
		
		setHelper(new Helper<T>(this));
	}

	@Override
	public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
		if (!isAvailable())
			return emptyList();
		else {
			try {
				IMapEdition<T> edition = editions.get(args[0]);
				
				if (edition != null && edition.isAvailable())
					return edition.onTabComplete(sender, command, alias, Arrays.copyOfRange(args, 1, args.length));
				
				List<String> labels = editions.keySet().stream().filter(l -> editions.get(l).isAvailable()).collect(Collectors.toList());
				labels.add(helper.getLabel());
				return filter(labels, args[0]);
			} catch (IndexOutOfBoundsException e) {
				return emptyList();
			}
		}
	}

	@Override
	public IPersistence<T> getPersistence() {
		return persistence;
	}

	@Override
	public T get() {
		return persistence.get();
	}

	@Override
	public boolean isAvailable() {
		return available;
	}

	@Override
	public IEditConfiguration<T> setAvailable(boolean available) {
		this.available = available;
		return this;
	}

	@Override
	public IEditConfiguration<T> addEdition(IMapEdition<T> edition) {
		edition.setAvailable(false);
		edition.setParent(this);
		editions.put(edition.getLabel(), edition);
		return this;
	}

	@Override
	public IEditConfiguration<T> removeEdition(IMapEdition<T> elt) {
		editions.remove(elt.getLabel());
		return this;
	}

	@Override
	public Map<String, IMapEdition<T>> getChildren() {
		return Collections.unmodifiableMap(editions);
	}

	@Override
	public IEditConfiguration<T> addObserver(IObsMessageSender obs) {
		observers.add(obs);
		return this;
	}

	@Override
	public IEditConfiguration<T> removeObserver(IObsMessageSender obs) {
		observers.remove(obs);
		return this;
	}

	@Override
	public void onCurrentChange(T newElt) {
		setAllAvailable(newElt != null);
	}

	@Override
	public void edit(CommandSender sender, String[] args) {
		String label = "";
		try {
			label = args[0];
			if (label.equals(helper.getLabel()))
				sender.sendMessage(helper.edit(sender, args));
			else if (editions.get(label).isAvailable())
				sendMessage(sender, editions.get(label).edit(Arrays.copyOfRange(args, 1, args.length)));
			else
				sendMessage(sender, MessageCode.COMMAND_NOT_AVAILABLE.withArgs(label));
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			sendMessage(sender, MessageCode.CANNOT_RUN_COMMAND.withArgs(getLabel()));
			return;
		} catch (NullPointerException e) {
			e.printStackTrace();
			sendMessage(sender, MessageCode.ARGUMENT_NOT_VALID.withArgs(label));
		}
	}
	
	@Override
	public IEditConfiguration<T> setHelper(IHelper<T> helper) {
		this.helper = helper;
		return this;
	}

	private void sendMessage(CommandSender sender, MessageCode code) {
		for (IObsMessageSender obs : observers)
			obs.sendMessage(sender, code);
	}

	private void setAllAvailable(boolean available) {
		for (IMapEdition<T> edition : getChildren().values())
			edition.setAvailable(available);
	}
}
