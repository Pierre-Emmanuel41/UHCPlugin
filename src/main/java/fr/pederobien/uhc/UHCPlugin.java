package fr.pederobien.uhc;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

import fr.pederobien.uhc.commands.AbstractCommand;
import fr.pederobien.uhc.commands.configuration.HungerGameConfigurationCommand;
import fr.pederobien.uhc.commands.configuration.SpawnConfigurationCommand;
import fr.pederobien.uhc.commands.game.PauseCommand;
import fr.pederobien.uhc.commands.game.StartCommand;
import fr.pederobien.uhc.commands.game.StopCommand;
import fr.pederobien.uhc.commands.team.AddToRandomTeamCommand;
import fr.pederobien.uhc.commands.team.CreateTeamCommand;
import fr.pederobien.uhc.commands.team.RemoveAllTeamCommand;
import fr.pederobien.uhc.managers.PlayerManager;
import fr.pederobien.uhc.managers.TeamsManager;
import fr.pederobien.uhc.managers.WorldManager;
import fr.pederobien.uhc.observer.IObsListener;

public class UHCPlugin extends JavaPlugin implements IObsListener {

	@Override
	public void onEnable() {
		getLogger().info("UHC plugin enable");
		
		new PauseCommand(this, "pausegame");
		new StartCommand(this, "startgame");
		new StopCommand(this, "stopgame");
		new AddToRandomTeamCommand(this, "teamrandom");
		new CreateTeamCommand(this, "teamcreate");
		new RemoveAllTeamCommand(this, "teamremoveall");
		new HungerGameConfigurationCommand(this, "hg");
		new SpawnConfigurationCommand(this, "spawn");
		
		getServer().getPluginManager().registerEvents(AbstractCommand.listener, this);
		AbstractCommand.listener.addObservers(this);
		
		PluginDeposit.plugin = this;
	}

	@Override
	public void onDisable() {
		getLogger().info("UHC plugin disable");
	}

	@Override
	public void onPlayerJoin(PlayerJoinEvent event) {
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
		movePlayer(event.getPlayer());
	}

	@Override
	public void onPlayerMove(PlayerMoveEvent event) {
		
	}
	
	private void movePlayer(Player player) {
		TeamsManager.teleporte(player.getName(), WorldManager.getSpawnOnJoin());
		PlayerManager.setGameModeOfPlayer(player, GameMode.SURVIVAL);
	}
}
