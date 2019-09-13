package fr.pederobien.uhc.game.hungergame;

import org.bukkit.GameMode;
import org.bukkit.event.player.PlayerRespawnEvent;

import fr.pederobien.uhc.BukkitManager;
import fr.pederobien.uhc.managers.PlayerManager;
import fr.pederobien.uhc.managers.WorldManager;

public class PlayerDontReviveState extends AbstractState {

	public PlayerDontReviveState(IHungerGame game) {
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
		BukkitManager.broadcastMessageAsTitle("Déplacement bordure", "red");
		WorldManager.moveBorder(game.getConfiguration().getFinalBorderDiameter(), game.getConfiguration().getInitialBorderDiameter().longValue());
		game.setCurrentState(game.getHungerGame());
	}
	
	@Override
	public void onPlayerRespawn(PlayerRespawnEvent event) {//verify there is no need to update the scoreboard in this method
		PlayerManager.setGameModeOfPlayer(event.getPlayer(), GameMode.SPECTATOR);
		event.setRespawnLocation(WorldManager.getSpawnOnJoin());
	}
}
