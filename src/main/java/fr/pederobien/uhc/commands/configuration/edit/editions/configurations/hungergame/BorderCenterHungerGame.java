package fr.pederobien.uhc.commands.configuration.edit.editions.configurations.hungergame;

import java.util.Arrays;
import java.util.List;

import fr.pederobien.uhc.commands.configuration.edit.editions.configurations.AbstractConfEdition;
import fr.pederobien.uhc.conf.configurations.interfaces.IHungerGameConfiguration;
import fr.pederobien.uhc.conf.persistence.IPersistence;

public class BorderCenterHungerGame extends AbstractConfEdition<IHungerGameConfiguration> {

	public BorderCenterHungerGame(IPersistence<IHungerGameConfiguration> persistence) {
		super(persistence, "bordercenter", "to set the center of the world's border");
	}

	@Override
	public String edit(String[] args) {
		try {
			get().setBorderCenter(args[0], args[1]);
			return "Border center defined in : " + get().getBorderCenter().getX() + " "
					+ get().getBorderCenter().getZ();
		} catch (IndexOutOfBoundsException | NullPointerException e) {
			return "Cannot set the border center, need coordinates <X> <Z>";
		} catch (NumberFormatException e) {
			return "Cannot parse <X> or <Z> argument";
		}
	}

	@Override
	public List<String> getArguments(String[] subArguments) {
		switch (subArguments.length) {
		case 1:
			return Arrays.asList("<X> <Z>");
		case 2:
			return Arrays.asList("<Z>");
		default:
			return null;
		}
	}
}