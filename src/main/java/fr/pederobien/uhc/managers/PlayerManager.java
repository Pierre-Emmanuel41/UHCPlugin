package fr.pederobien.uhc.managers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import fr.pederobien.uhc.BukkitManager;

public class PlayerManager {
	public static final int MAX_EFFECT_DURATION = 999999;
	public static final int MAX_EFFECT_AMPLIFIER = 99;

	public static Stream<Player> getPlayers() {
		List<Player> players = new ArrayList<>();
		for (Player player : BukkitManager.getOnlinePlayers())
			players.add(player);
		return players.stream();
	}

	public static long getNumberOfPlayer() {
		return getPlayers().count();
	}

	public static Player getPlayer(String name) {
		return BukkitManager.getPlayer(name);
	}

	public static void removeInventoryOfPlayer(Player player) {
		player.getInventory().clear();
	}

	public static void removeInventoryOfPlayers() {
		getPlayers().forEach(p -> removeInventoryOfPlayer(p));
	}

	public static void setLevelOfPlayer(Player player, int level) {
		player.giveExpLevels(-player.getTotalExperience() + level);
	}

	public static void setLevelOfPlayers(int level) {
		getPlayers().forEach(p -> setLevelOfPlayer(p, level));
	}

	public static void resetLevelOfPlayers() {
		setLevelOfPlayers(0);
	}

	public static void setFoodLevelOfPlayer(Player player, int level) {
		player.setFoodLevel(level);
	}

	public static void setFoodLevelOfPlayers(int level) {
		getPlayers().forEach(p -> setFoodLevelOfPlayer(p, level));
	}

	public static void maxFoodForPlayers() {
		setFoodLevelOfPlayers(20);
	}

	public static void setMaxHealthOfPlayer(Player player, double level) {
		player.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(level);
	}

	public static void resetMaxHealthOfPlayer(Player player) {
		setMaxHealthOfPlayer(player, 20.0);
	}

	public static void resetMaxHealthOfPlayers() {
		getPlayers().forEach(p -> resetMaxHealthOfPlayer(p));
	}

	public static void setHealthOfPlayer(Player player, double level) {
		player.setHealth(level);
	}

	public static void setHealthOfPlayers(Stream<Player> players, double level) {
		players.forEach(p -> setHealthOfPlayer(p, level));
	}

	public static void setHealthOfPlayers(double level) {
		getPlayers().forEach(p -> setHealthOfPlayer(p, level));
	}

	public static void maxLifeToPlayers() {
		setHealthOfPlayers(20);
	}

	public static Stream<Player> getPlayersOnMode(GameMode mode) {
		return getPlayers().filter(p -> p.getGameMode().equals(mode));
	}

	public static long getNumberOfPlayersOnMode(GameMode mode) {
		return getPlayersOnMode(mode).count();
	}

	public static void setGameModeOfPlayer(Player player, GameMode mode) {
		player.setGameMode(mode);
	}

	public static void setGameModeOfPlayers(Stream<Player> players, GameMode mode) {
		players.forEach(p -> setGameModeOfPlayer(p, mode));
	}

	public static void setGameModeOfPlayersOnMode(GameMode oldMode, GameMode newMode) {
		setGameModeOfPlayers(getPlayersOnMode(oldMode), newMode);
	}

	public static void setGameModeOfAllPlayers(GameMode mode) {
		setGameModeOfPlayers(getPlayers(), mode);
	}

	public static void teleporte(Player player, Location location) {
		player.teleport(location);
	}

	public static void teleporteAllPlayers(Stream<Player> players, Location location) {
		players.forEach(p -> teleporte(p, location));
	}

	public static void teleporte(Player player, Entity entity) {
		player.teleport(entity);
	}

	public static void teleporteAllPlayers(Stream<Player> players, Entity entity) {
		players.forEach(p -> teleporte(p, entity));
	}

	public static void teleporteAllPlayers(Location location) {
		getPlayers().forEach(p -> teleporte(p, location));
	}

	public static void giveEffect(Player player, PotionEffect effect) {
		player.addPotionEffect(effect);
	}

	public static void giveEffect(Stream<Player> players, PotionEffect effect) {
		players.forEach(p -> giveEffect(p, effect));
	}

	public static void giveEffectToAllPlayers(Stream<PotionEffect> effects) {
		giveEffects(getPlayers(), effects);
	}

	public static void giveEffectToAllPlayers(PotionEffectType... types) {
		giveEffects(getPlayers(), createEffect(types));
	}

	public static void giveEffects(Player player, Stream<PotionEffect> effects) {
		effects.forEach(e -> giveEffect(player, e));
	}

	public static void giveEffects(Stream<Player> players, Stream<PotionEffect> effects) {
		players.forEach(p -> effects.forEach(e -> giveEffect(p, e)));
	}

	public static PotionEffect createEffect(PotionEffectType type, int duration, int amplifier, boolean ambient, boolean particles) {
		return new PotionEffect(type, duration, amplifier, ambient, particles);
	}

	public static PotionEffect createEffect(PotionEffectType type, int duration, int amplifier, boolean ambient) {
		return createEffect(type, duration, amplifier, ambient, true);
	}

	public static PotionEffect createEffect(PotionEffectType type, int duration, int amplifier) {
		return createEffect(type, duration, amplifier, true);
	}

	public static PotionEffect createEffectMaxDurationMaxModifier(PotionEffectType type) {
		return createEffect(type, MAX_EFFECT_DURATION, MAX_EFFECT_AMPLIFIER);
	}

	public static PotionEffect createEffect(PotionEffectType type) {
		return createEffect(type, 20, 1);
	}

	public static Stream<PotionEffect> createEffect(PotionEffectType... types) {
		return Stream.of(types).map(t -> createEffect(t));
	}

	public static Stream<PotionEffect> createEffectMaxDurationMaxModifier(PotionEffectType... types) {
		return Stream.of(types).map(t -> createEffectMaxDurationMaxModifier(t));
	}

	public static void giveEffectToPlayerOnMode(GameMode mode, PotionEffect effect) {
		giveEffect(getPlayersOnMode(mode), effect);
	}

	public static void giveEffectsToPlayerOnMode(GameMode mode, Stream<PotionEffect> effects) {
		giveEffects(getPlayersOnMode(mode), effects);
	}

	public static void removeEffect(Player player, PotionEffectType type) {
		player.removePotionEffect(type);
	}

	public static void removeEffect(Stream<Player> players, PotionEffectType type) {
		players.forEach(p -> removeEffect(p, type));
	}

	public static void removeEffect(Player player, Stream<PotionEffectType> types) {
		types.forEach(t -> removeEffect(player, t));
	}

	public static void removeEffect(Stream<Player> players, Stream<PotionEffectType> types) {
		players.forEach(p -> types.forEach(t -> removeEffect(p, t)));
	}

	public static void removeAllEffects(Player player) {
		player.getActivePotionEffects().stream().forEach(e -> removeEffect(player, e.getType()));
	}

	public static void removeAllEffects(Stream<Player> players) {
		players.forEach(p -> removeAllEffects(p));
	}

	public static void removeAllEffectsToAllPlayers() {
		getPlayers().forEach(p -> removeAllEffects(p));
	}

	public static void removeAllEffectsToPlayerOnMode(GameMode mode) {
		removeAllEffects(getPlayersOnMode(mode));
	}

	public static List<Player> getCloseCollegues(Player src, int distance) {
		return getClosePlayers(src, TeamsManager.getCollegues(src), distance);
	}

	public static List<Player> getClosePlayers(Player src, List<Player> players, int distance) {
		return players.stream().filter(p -> Math.abs(src.getLocation().getBlockX() - p.getLocation().getBlockX()) <= distance)
				.filter(p -> Math.abs(src.getLocation().getBlockY() - p.getLocation().getBlockY()) <= distance)
				.filter(p -> Math.abs(src.getLocation().getBlockZ() - p.getLocation().getBlockZ()) <= distance).collect(Collectors.toList());
	}

	public static void dropPlayerInventoryItemNaturally(Player player) {
		for (ItemStack item : player.getInventory())
			if (item != null)
				player.getLocation().getWorld().dropItem(player.getLocation(), item);
		player.getInventory().clear();
	}

	public static void dropPlayersInventoryItemNaturally(Stream<Player> players) {
		players.forEach(p -> dropPlayerInventoryItemNaturally(p));
	}

	public static void dropPlayersInventoryItemNaturally() {
		dropPlayersInventoryItemNaturally(getPlayers());
	}

	public static void sendMessageToPlayer(Player player, String message) {
		player.sendMessage(message);
	}

	public static void sendMessageToPlayers(Stream<Player> players, String message) {
		players.forEach(p -> sendMessageToPlayer(p, message));
	}

	public static void killPlayer(Player player) {
		setHealthOfPlayer(player, 0);
	}

	public static void killPlayers(Stream<Player> players) {
		players.forEach(p -> killPlayer(p));
	}

	public static void killPlayersInWorlds(World... worlds) {
		killPlayers(WorldManager.getPlayersInWorld(worlds));
	}
}
