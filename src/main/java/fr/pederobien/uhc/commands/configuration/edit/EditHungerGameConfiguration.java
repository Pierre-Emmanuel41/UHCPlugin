package fr.pederobien.uhc.commands.configuration.edit;

import fr.pederobien.uhc.commands.configuration.edit.editions.configurations.hungergame.HungerGameEditionsFactory;
import fr.pederobien.uhc.dictionary.dictionaries.MessageCode;
import fr.pederobien.uhc.interfaces.IConfigurationContext;
import fr.pederobien.uhc.interfaces.IHungerGameConfiguration;

public class EditHungerGameConfiguration extends AbstractEditConfiguration<IHungerGameConfiguration> {
	private static final HungerGameEditionsFactory factory = HungerGameEditionsFactory.getInstance();

	public EditHungerGameConfiguration(IConfigurationContext context) {
		super(factory.getPersistence(), "hg", MessageCode.HUNGER_GAME_EDITION_CONFIGURATION_EXPLANATION);

		addEdition(factory.createAsCurrentEdition(context)).addEdition(factory.createBorderCenterEdition()).addEdition(factory.createCurrentEdition())
				.addEdition(factory.createDeleteEdition().setModifiable(false)).addEdition(factory.createFinalBorderDiameterEdition())
				.addEdition(factory.createFractionTimeEdition()).addEdition(factory.createGameTimeEdition()).addEdition(factory.createInitialBorderDiameterEdition())
				.addEdition(factory.createListEdition().setModifiable(false)).addEdition(factory.createLoadEdition().setModifiable(false))
				.addEdition(factory.createNewEdition().setModifiable(false)).addEdition(factory.createPvpTimeEdition()).addEdition(factory.createRenameEdition())
				.addEdition(factory.createResetEdition()).addEdition(factory.createSaveEdition()).addEdition(factory.createScoreboardRefreshEdition())
				.addEdition(factory.createSpeedBorderEdition()).addEdition(factory.createTeamEdition()).addEdition(factory.createWarningTimeEdition());
	}
}
