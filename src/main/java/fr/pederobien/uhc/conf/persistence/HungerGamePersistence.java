package fr.pederobien.uhc.conf.persistence;

import java.io.FileNotFoundException;

import fr.pederobien.uhc.conf.configurations.HungerGameConfiguration;

public class HungerGamePersistence extends AbstractConfPersistence<HungerGameConfiguration> {
	private static final String HUNGER_GAME = GAME + "Hunger game";

	public HungerGamePersistence() {
		super(HungerGameConfiguration.DEFAULT);
		checkAndWriteDefault(HUNGER_GAME, get());
	}

	@Override
	public void load(String name) throws FileNotFoundException {

	}

	@Override
	public void save(HungerGameConfiguration configuration) {
		StringBuilder builder = new StringBuilder();
		builder.append(openingTag("configuration")).append(tabAttribut(1, "name", configuration.getName()))
				.append(tabAttribut(1, "spawn", configuration.getSpawn().getName())).append(openingTabTag(2, "border"))
				.append(openingTabTag(1, "border")).append(openingTabTag(2, "center"))
				.append(tabAttribut(3, "x", configuration.getBorderCenter().getX()))
				.append(tabAttribut(3, "y", configuration.getBorderCenter().getY()))
				.append(tabAttribut(3, "z", configuration.getBorderCenter().getZ())).append(closingTabTag(2, "center"))
				.append(openingTabTag(2, "size"))
				.append(tabAttribut(3, "initial", configuration.getInitialBorderSize()))
				.append(tabAttribut(3, "final", configuration.getFinalBorderSize())).append(closingTabTag(2, "size"))
				.append(closingTabTag(1, "border")).append(openingTabTag(1, "time"))
				.append(tabAttribut(3, "total", configuration.getGameTime()))
				.append(tabAttribut(3, "fraction", configuration.getFractionTime()))
				.append(tabAttribut(3, "scoreboardrefresh", configuration.getScoreboardRefresh()))
				.append(closingTabTag(1, "time")).append(closingTag("configuration"));

		write(HUNGER_GAME, builder.toString());
	}
	
	@Override
	public HungerGameConfiguration get() {
		return configuration;
	}
	
	@Override
	public void set(HungerGameConfiguration configuration) {
		this.configuration = configuration;
	}
}