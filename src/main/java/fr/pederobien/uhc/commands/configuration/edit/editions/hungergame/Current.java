package fr.pederobien.uhc.commands.configuration.edit.editions.hungergame;

import fr.pederobien.uhc.conf.configurations.interfaces.IHungerGameConfiguration;
import fr.pederobien.uhc.conf.persistence.IPersistence;

public class Current extends AbstractHGEdition {

	public Current(IPersistence<IHungerGameConfiguration> persistence) {
		super(persistence, "current", "to know the name of the current hunger game style");
	}

	@Override
	public String edit(String[] args) {
		return "Current hunger game style " + getConf().getName();
	}
}
