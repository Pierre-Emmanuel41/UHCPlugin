package fr.pederobien.uhc.configurations;

import fr.pederobien.uhc.interfaces.IBase;
import fr.pederobien.uhc.interfaces.IBlockedexConfiguration;
import fr.pederobien.uhc.interfaces.IConfigurationContext;
import fr.pederobien.uhc.interfaces.IHungerGameConfiguration;
import fr.pederobien.uhc.interfaces.ISpawn;
import fr.pederobien.uhc.world.blocks.Base;
import fr.pederobien.uhc.world.blocks.Spawn;

public class ConfigurationsFactory {

	public static ConfigurationsFactory getInstance() {
		return SingletonHolder.factory;
	}

	private static class SingletonHolder {
		public static final ConfigurationsFactory factory = new ConfigurationsFactory();
	}

	public IHungerGameConfiguration createHungerGameConfiguration(String name) {
		return new HungerGameConfiguration(name);
	}

	public IBlockedexConfiguration createBlockedexGameConfiguration(String name) {
		return new BlockedexConfiguration(name);
	}

	public IConfigurationContext createConfigurationContext() {
		return new ConfigurationContext();
	}

	public ISpawn createSpawn(String name) {
		return new Spawn(name);
	}

	public IBase createBase(String name) {
		return new Base(name);
	}
}
