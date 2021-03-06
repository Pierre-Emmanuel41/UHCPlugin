package fr.pederobien.uhc.game.hungergame;

import org.bukkit.GameMode;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

import fr.pederobien.uhc.dictionary.NotificationCenter;
import fr.pederobien.uhc.dictionary.dictionaries.MessageCode;
import fr.pederobien.uhc.event.EventFactory;
import fr.pederobien.uhc.managers.PlayerManager;
import fr.pederobien.uhc.managers.WorldManager;

public class HungerGameState extends AbstractHungerGameState {

	public HungerGameState(IHungerGame game) {
		super(game);
	}

	@Override
	public void pause() {
		onPause();
		WorldManager.stopBorder();
	}

	@Override
	public void relaunch() {
		onRelaunched();
		WorldManager.moveBorder(getConfiguration().getFinalBorderDiameter(),
				WorldManager.getCurrentDiameter().longValue() / getConfiguration().getBorderSpeed().longValue());
	}

	@Override
	public void stop() {
		game.setCurrentState(game.getStop()).stop();
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

	@Override
	public void onPlayerPortalEvent(PlayerPortalEvent event) {
		event.setCancelled(true);
		NotificationCenter.sendMessage(EventFactory.createMessageEvent(event.getPlayer(), MessageCode.PLAYER_MUST_STAY_IN_THE_OVERWORLD,
				WorldManager.getNormalizeWorldName(event.getTo().getWorld().getName())));
	}
}
