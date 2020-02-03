package fr.pederobien.uhc;

import org.bukkit.GameMode;
import org.bukkit.GameRule;
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
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffectType;

import fr.pederobien.uhc.commands.AbstractCommand;
import fr.pederobien.uhc.commands.configuration.BaseConfigurationCommand;
import fr.pederobien.uhc.commands.configuration.BlockedexConfigurationCommand;
import fr.pederobien.uhc.commands.configuration.HungerGameConfigurationCommand;
import fr.pederobien.uhc.commands.configuration.SpawnConfigurationCommand;
import fr.pederobien.uhc.commands.game.PauseCommand;
import fr.pederobien.uhc.commands.game.StartCommand;
import fr.pederobien.uhc.commands.game.StopCommand;
import fr.pederobien.uhc.configurations.ConfigurationContext;
import fr.pederobien.uhc.environment.UHCPlayer;
import fr.pederobien.uhc.game.GameStateException;
import fr.pederobien.uhc.interfaces.IConfigurationContext;
import fr.pederobien.uhc.managers.PlayerManager;
import fr.pederobien.uhc.managers.WorldManager;
import fr.pederobien.uhc.observers.IObsGame;
import fr.pederobien.uhc.observers.IObsListener;
import fr.pederobien.uhc.scoreboard.ScoreboardStateException;
import fr.pederobien.uhc.world.EventListener;

public class UHCPlugin extends JavaPlugin implements IObsListener, IObsGame {
	private IConfigurationContext context;
	private EventListener listener;

	@Override
	public void onEnable() {
		getLogger().info("UHC plugin enable");

		PluginDeposit.plugin = this;
		context = new ConfigurationContext();
		listener = new EventListener();

		getServer().getPluginManager().registerEvents(listener, this);

		AbstractCommand.setConfigurationContext(context);
		AbstractCommand.setListener(listener);

		WorldManager.setTimeDay();
		WorldManager.setWeatherSun();
		WorldManager.setPVP(false);
		WorldManager.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);

		new PauseCommand(this, "pausegame");
		new StartCommand(this, "startgame");
		new StopCommand(this, "stopgame");
		new HungerGameConfigurationCommand(this, "hg");
		new SpawnConfigurationCommand(this, "spawn");
		new BlockedexConfigurationCommand(this, "bd");
		new BaseConfigurationCommand(this, "base");

		listener.addObservers(this);

		PlayerManager.getPlayers().forEach(p -> UHCPlayer.register(p));
	}

	@Override
	public void onDisable() {
		getLogger().info("UHC plugin disable");
		try {
			WorldManager.removeSpawn();
			context.stop();
		} catch (GameStateException | ScoreboardStateException | NullPointerException e) {

		}
	}

	@Override
	public void onStart() {
		PlayerManager.removeAllEffectsToAllPlayers();
		listener.removeObservers(this);
		listener.addObservers(context);
		WorldManager.setPVP(true);
	}

	@Override
	public void onStop() {
		listener.addObservers(this);
		listener.removeObservers(context);
		WorldManager.setPVP(false);
	}

	@Override
	public void onPlayerJoin(PlayerJoinEvent event) {
		UHCPlayer.register(event.getPlayer());
		PlayerManager.teleporte(event.getPlayer(), WorldManager.getSpawnOnJoin());
		movePlayer(event.getPlayer());
	}

	@Override
	public void onPlayerDie(PlayerDeathEvent event) {

	}

	@Override
	public void onPlayerQuit(PlayerQuitEvent event) {

	}

	@Override
	public void onPlayerRespawn(PlayerRespawnEvent event) {
		event.setRespawnLocation(WorldManager.getSpawnOnJoin());
		movePlayer(event.getPlayer());
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

	}

	@Override
	public void onPlayerPortalEvent(PlayerPortalEvent event) {

	}

	private void movePlayer(Player player) {
		if (BukkitManager.getOperators().contains(player))
			PlayerManager.setGameModeOfPlayer(player, GameMode.CREATIVE);
		else {
			PlayerManager.setGameModeOfPlayer(player, GameMode.ADVENTURE);
			PlayerManager.giveEffects(player,
					PlayerManager.createEffectMaxDurationMaxModifier(PotionEffectType.REGENERATION, PotionEffectType.SATURATION, PotionEffectType.DAMAGE_RESISTANCE));
		}
	}
}
