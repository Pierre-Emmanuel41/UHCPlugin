package fr.pederobien.uhc.commands.configuration.edit.editions.blockedexgame;

import fr.pederobien.uhc.commands.configuration.edit.editions.enumerations.BDEditions;
import fr.pederobien.uhc.conf.configurations.interfaces.IBlockedexConfiguration;
import fr.pederobien.uhc.conf.persistence.IPersistence;

public class Save extends AbstractBDEdition {

	public Save(IPersistence<IBlockedexConfiguration> persistence) {
		super(persistence, BDEditions.SAVE);
	}

	@Override
	public String edit(String[] args) {
		getPersistence().save();
		return "Style " + getConf().getName() + " saved";
	}
}
