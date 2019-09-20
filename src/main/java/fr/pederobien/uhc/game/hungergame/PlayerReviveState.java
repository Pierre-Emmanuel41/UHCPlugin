package fr.pederobien.uhc.game.hungergame;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

import fr.pederobien.uhc.BukkitManager;
import fr.pederobien.uhc.managers.PlayerManager;
import fr.pederobien.uhc.managers.WorldManager;

public class PlayerReviveState extends AbstractState {

	public PlayerReviveState(IHungerGame game) {
		super(game);
	}
	
	@Override
	public void pause(IHungerGameState before) {
		game.setCurrentState(game.getPause()).pause(before);
	}
	
	@Override
	public void stop() {
		game.setCurrentState(game.getStop()).stop();
	}
	
	@Override
	public void time() {
		BukkitManager.broadcastMessageAsTitle("Plus de résurrection", "red");
		game.setCurrentState(game.getPlayerDontRevive());
	}
	
	@Override
	public void onPlayerDie(PlayerDeathEvent event) {
		super.onPlayerDie(event);
		if (event.getEntity().getKiller() instanceof Player)
			event.setKeepInventory(false);
		else
			event.setKeepInventory(true);
		//verify the scoreboard state here
		//HungerGameScoreboard.update()?
	}
	
	@Override
	public void onPlayerRespawn(PlayerRespawnEvent event) {
		PlayerManager.setGameModeOfPlayer(event.getPlayer(), GameMode.SURVIVAL);
		event.setRespawnLocation(WorldManager.getRandomlyPoint().getLocation());
		
		//verify the scoreboard state here
		//HungerGameScoreboard.update()?
	}
}
