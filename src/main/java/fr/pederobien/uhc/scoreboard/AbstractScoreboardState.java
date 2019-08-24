package fr.pederobien.uhc.scoreboard;

import java.util.List;

import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

public class AbstractScoreboardState implements IScoreboardState {
	protected IScoreboard scoreboard;
	private List<String> entries;
	private String title;
	
	public AbstractScoreboardState(IScoreboard scoreboard, String title) {
		this.scoreboard = scoreboard;
		this.title = title;
	}

	@Override
	public void run() {
		
	}

	@Override
	public void onPlayerJoin(PlayerJoinEvent event) {
		
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
	public List<String> getEntries() {
		return entries;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void start() {
		
	}

	@Override
	public void pause(IScoreboardState before) {
		
	}

	@Override
	public void relaunched() {
		
	}
	
	protected void addEntries(String score) {
		entries.add(score);
	}
}
