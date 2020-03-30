package fr.pederobien.uhc.game;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.GameMode;
import org.bukkit.GameRule;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.potion.PotionEffectType;

import fr.pederobien.uhc.BukkitManager;
import fr.pederobien.uhc.dictionary.NotificationCenter;
import fr.pederobien.uhc.dictionary.dictionaries.MessageCode;
import fr.pederobien.uhc.environment.UHCPlayer;
import fr.pederobien.uhc.event.EventFactory;
import fr.pederobien.uhc.interfaces.IMessageCode;
import fr.pederobien.uhc.interfaces.IUnmodifiableConfiguration;
import fr.pederobien.uhc.managers.EColor;
import fr.pederobien.uhc.managers.PlayerManager;
import fr.pederobien.uhc.managers.TeamsManager;
import fr.pederobien.uhc.managers.WorldManager;
import fr.pederobien.uhc.scoreboard.launcher.IScoreboardLauncher;
import fr.pederobien.uhc.task.ITaskLauncher;

public abstract class AbstractGameState<T extends IUnmodifiableConfiguration> implements IGameState {
	protected static ITaskLauncher taskLauncher;
	protected static IScoreboardLauncher scoreboardLauncher;
	protected MessageCode message;
	private T configuration;
	private Map<Player, PlayerState> playersState;

	public AbstractGameState(T configuration) {
		this.configuration = configuration;
		playersState = new HashMap<Player, PlayerState>();
	}

	@Override
	public boolean initiate() {
		throw new GameStateException(getExceptionMessage());
	}

	@Override
	public void start() {
		throw new GameStateException(getExceptionMessage());
	}

	@Override
	public void pause() {
		throw new GameStateException(getExceptionMessage());
	}

	@Override
	public void relaunch() {
		throw new GameStateException(getExceptionMessage());
	}

	@Override
	public void stop() {
		throw new GameStateException(getExceptionMessage());
	}

	@Override
	public MessageCode getMessage() {
		return message;
	}

	@Override
	public void time(LocalTime time) {

	}

	@Override
	public void onPlayerJoin(PlayerJoinEvent event) {
		UHCPlayer.register(event.getPlayer());
	}

	@Override
	public void onPlayerDie(PlayerDeathEvent event) {

	}

	@Override
	public void onPlayerQuit(PlayerQuitEvent event) {

	}

	@Override
	public void onPlayerRespawn(PlayerRespawnEvent event) {

	}

	@Override
	public void onPlayerMove(PlayerMoveEvent event) {

	}

	@Override
	public void onPlayerInteract(PlayerInteractEvent event) {

	}

	@Override
	public void onPlayerInventoryClick(InventoryClickEvent event) {

	}

	@Override
	public void onCreatureSpawn(CreatureSpawnEvent event) {
		if (WorldManager.isLocationUnderSpawn(event.getLocation()) && WorldManager.MOBS.contains(event.getEntityType()))
			event.setCancelled(true);
	}

	@Override
	public void onPlayerPortalEvent(PlayerPortalEvent event) {

	}

	protected void onStart() {
		PlayerManager.giveEffectToAllPlayers(PotionEffectType.DAMAGE_RESISTANCE, PotionEffectType.REGENERATION, PotionEffectType.SATURATION);
		PlayerManager.resetLevelOfPlayers();
		PlayerManager.maxFoodForPlayers();
		PlayerManager.resetMaxHealthOfPlayers();
		PlayerManager.maxLifeToPlayers();
		PlayerManager.removeInventoryOfPlayers();
		PlayerManager.setGameModeOfAllPlayers(GameMode.SURVIVAL);
		WorldManager.setTimeDay();
		WorldManager.setWeatherSun();
		WorldManager.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, true);
		WorldManager.setPVP(false);
		TeamsManager.createTeams(getConfiguration().getTeams());
	}

	protected void onPause() {
		sendTitle(MessageCode.GAME_SUSPENDED);
		taskLauncher.pause();
		scoreboardLauncher.pause();
		PlayerManager.getPlayersOnMode(GameMode.SURVIVAL).forEach(p -> {
			playersState.put(p, new PlayerState(p));
			PlayerManager.setGameModeOfPlayer(p, GameMode.ADVENTURE);
			PlayerManager.giveEffects(p,
					PlayerManager.createEffectMaxDurationMaxModifier(PotionEffectType.DAMAGE_RESISTANCE, PotionEffectType.REGENERATION, PotionEffectType.SATURATION));
		});
	}

	protected void onRelaunched() {
		sendTitle(MessageCode.GAME_RESUMED);
		PlayerManager.getPlayersOnMode(GameMode.ADVENTURE).forEach(p -> {
			PlayerManager.setGameModeOfPlayer(p, GameMode.SURVIVAL);
			PlayerManager.removeAllEffects(p);
			playersState.get(p).apply();
		});
		taskLauncher.relaunched();
		scoreboardLauncher.relaunched();
	}

	protected void onStop() {
		taskLauncher.cancel();
		scoreboardLauncher.cancel();
		PlayerManager.teleporteAllPlayers(WorldManager.getSpawnOnJoin());
	}

	protected void sendMessage(Player player, IMessageCode code, String... args) {
		NotificationCenter.sendMessage(EventFactory.createMessageEvent(player, code, args));
	}

	protected void sendTitle(IMessageCode code, String... args) {
		BukkitManager.sendTitleToPlayers(EventFactory.createMessageCodeEvent(code, args));
	}

	protected void sendTitle(EColor color, IMessageCode code, String... args) {
		BukkitManager.sendTitleToPlayers(EventFactory.createMessageCodeEvent(code, args), color);
	}

	protected T getConfiguration() {
		return configuration;
	}

	private class PlayerState {
		private Player player;
		private double health;
		private int food;
		private Location location;

		public PlayerState(Player player) {
			this.player = player;
			health = player.getHealth();
			food = player.getFoodLevel();
			location = player.getLocation();
		}

		public void apply() {
			player.setHealth(health);
			player.setFoodLevel(food);
			PlayerManager.teleporte(player, location);
		}
	}

	private String getExceptionMessage() {
		return "This method cannot be called by this state (" + getClass().getSimpleName() + ")";
	}
}
