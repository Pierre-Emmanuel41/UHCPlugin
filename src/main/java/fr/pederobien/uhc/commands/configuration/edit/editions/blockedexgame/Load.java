package fr.pederobien.uhc.commands.configuration.edit.editions.blockedexgame;

import java.io.FileNotFoundException;
import java.util.List;

import fr.pederobien.uhc.commands.configuration.edit.editions.enumerations.BDEditions;
import fr.pederobien.uhc.conf.persistence.BlockedexPersistence;

public class Load extends AbstractBDEdition {

	public Load(BlockedexPersistence persistence) {
		super(persistence, BDEditions.LOAD);
	}

	@Override
	public String edit(String[] args) {
		try {
			getPersistence().save();
			getPersistence().load(args[0]);
			return "Blockedex game style loaded : " + getPersistence().get().getName();
		} catch (IndexOutOfBoundsException e) {
			return "Cannot load blockedex game style, need the name";
		} catch (FileNotFoundException e) {
			return "Cannot load style " + args[0] + ", style does not exist";
		}
	}
	
	@Override
	public List<String> getArguments(String[] subArguments) {
		switch (subArguments.length) {
		case 1:
			return filter(getPersistence().list(), subArguments[0]);
		default:
			return null;
		}
	}
}
