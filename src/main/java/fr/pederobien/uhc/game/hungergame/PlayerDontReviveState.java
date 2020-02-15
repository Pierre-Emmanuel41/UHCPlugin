package fr.pederobien.uhc.game.hungergame;

import java.time.LocalTime;

import org.bukkit.GameMode;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

import fr.pederobien.uhc.dictionary.dictionaries.MessageCode;
import fr.pederobien.uhc.managers.EColor;
import fr.pederobien.uhc.managers.PlayerManager;
import fr.pederobien.uhc.managers.WorldManager;

public class PlayerDontReviveState extends AbstractHungerGameState {

	public PlayerDontReviveState(IHungerGame game) {
		super(game);
	}

	@Override
	public void pause() {
		onPause();
	}

	@Override
	public void relaunch() {
		onRelaunched();
	}

	@Override
	public void stop() {
		game.setCurrentState(game.getStop()).stop();
	}

	@Override
	public void time(LocalTime time) {
		if (time.equals(getConfiguration().getPvpTime()))
			authorizedPvp();
		if (time.equals(getAbsoluteWarningTime()))
			warnPlayers();
		if (time.equals(getConfiguration().getGameTime()))
			changeFromDontReviveToHungerGame();
	}

	@Override
	public void onPlayerDie(PlayerDeathEvent event) {
		PlayerManager.setGameModeOfPlayer(event.getEntity(), GameMode.SPECTATOR);
		shouldStopGame();
	}

	@Override
	public void onPlayerRespawn(PlayerRespawnEvent event) {
		event.setRespawnLocation(WorldManager.getSpawnOnJoin());
	}

	private void changeFromDontReviveToHungerGame() {
		sendTitle(EColor.DARK_RED, MessageCode.MOVING_BORDER);
		WorldManager.moveBorder(getConfiguration().getFinalBorderDiameter(),
				getConfiguration().getInitialBorderDiameter().longValue() / getConfiguration().getBorderSpeed().longValue());
		PlayerManager.killPlayersInWorlds(WorldManager.END_WORLD, WorldManager.NETHER_WORLD);
		game.setCurrentState(game.getHungerGame());
	}
}
