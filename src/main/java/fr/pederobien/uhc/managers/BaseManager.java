package fr.pederobien.uhc.managers;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import fr.pederobien.uhc.interfaces.IBase;
import fr.pederobien.uhc.interfaces.IPersistence;
import fr.pederobien.uhc.interfaces.IUnmodifiableBase;
import fr.pederobien.uhc.interfaces.IUnmodifiableBlockedexConfiguration;
import fr.pederobien.uhc.persistence.PersistenceFactory;

public class BaseManager {
	private static HashMap<String, IBase> allBases = new HashMap<String, IBase>();
	private static List<IBase> gameBases = new ArrayList<IBase>();
	private static boolean loaded = false;
	
	public static void loadBases() {
		if (loaded)
			return;
		IPersistence<IBase> persistence = PersistenceFactory.getInstance().getBasePersistence();
		try {
			for (String name : persistence.list())
				allBases.put(name, persistence.load(name).get());
		} catch (FileNotFoundException e) {
		}
		loaded = true;
	}
	
	public static boolean setBlockedexGameCurrentConfiguration(IUnmodifiableBlockedexConfiguration configuration) {
		if (checkBaseAvailable(configuration.getEastBase(), configuration.getTeams()))
			gameBases.add(allBases.get(configuration.getEastBase()));
		if (checkBaseAvailable(configuration.getNorthBase(), configuration.getTeams()))
			gameBases.add(allBases.get(configuration.getNorthBase()));
		if (checkBaseAvailable(configuration.getSouthBase(), configuration.getTeams()))
			gameBases.add(allBases.get(configuration.getSouthBase()));
		if (checkBaseAvailable(configuration.getWestBase(), configuration.getTeams()))
			gameBases.add(allBases.get(configuration.getWestBase()));
		return gameBases.size() == 4;
	}

	public static boolean isChestAccessible(Player player, Block block) {
		if (!block.getType().equals(Material.CHEST))
			return true;

		boolean accessible = true;
		for (IBase base : gameBases)
			accessible &= !base.isChestRestricted(block, player);
		return accessible;
	}

	public static Stream<String> availableBasesAccordingTeam(List<ETeam> teams) {
		return allBases.values().stream().filter(b -> checkBaseAvailable(b, teams)).map(b -> b.getName());
	}

	public static boolean checkBaseAvailable(String baseName, List<ETeam> teams) {
		return checkBaseAvailable(allBases.get(baseName), teams);
	}

	public static IUnmodifiableBase getBaseByName(String name) {
		return allBases.get(name);
	}

	public static boolean checkBaseAvailable(IBase base, List<ETeam> teams) {
		if (base == null)
			return false;
		if (teams.size() <= base.getChestsNumber()) {
			boolean supportTeam = true;
			for (ETeam team : teams) {
				supportTeam &= base.getChests().containsValue(team);
				if (!supportTeam)
					return false;
			}
			return true;
		}
		return false;
	}
}
