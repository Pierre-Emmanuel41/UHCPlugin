package fr.pederobien.uhc.commands.configuration.edit.editions.configurations.hungergame;

import fr.pederobien.uhc.commands.configuration.edit.editions.configurations.AbstractConfEdition;
import fr.pederobien.uhc.dictionary.dictionaries.MessageCode;
import fr.pederobien.uhc.interfaces.IHungerGameConfiguration;

public class CurrentHungerGame extends AbstractConfEdition<IHungerGameConfiguration> {

	public CurrentHungerGame() {
		super("current", MessageCode.CURRENT_HUNGER_GAME_EXPLANATION);
	}

	@Override
	public void edit(String[] args) {
		sendMessage(MessageCode.CURRENT_HUNGER_GAME_MESSAGE, get().toString());
	}
}
