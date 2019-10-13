package fr.pederobien.uhc.commands.configuration.edit.editions.configurations.hungergame;

import fr.pederobien.uhc.commands.configuration.edit.editions.CommonSave;
import fr.pederobien.uhc.conf.configurations.interfaces.IHungerGameConfiguration;
import fr.pederobien.uhc.conf.persistence.IPersistence;

public class SaveHungerGame extends CommonSave<IHungerGameConfiguration> {

	public SaveHungerGame(IPersistence<IHungerGameConfiguration> persistence) {
		super(persistence, "to save the current hunger game style");
	}

	@Override
	protected String onSave() {
		return "Hunger game style " + get().getName() + " saved";
	}
}
