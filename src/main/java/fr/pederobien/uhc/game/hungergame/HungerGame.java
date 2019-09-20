package fr.pederobien.uhc.game.hungergame;

import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

import fr.pederobien.uhc.conf.configurations.HungerGameConfiguration;

public class HungerGame implements IHungerGame {
	private IHungerGameState initiate;
	private IHungerGameState start;
	private IHungerGameState playerRevive;
	private IHungerGameState playerDontRevive;
	private IHungerGameState hungerGame;
	private IHungerGameState pause;
	private IHungerGameState stop;
	private IHungerGameState current;
	private HungerGameConfiguration configuration;
	
	public HungerGame(HungerGameConfiguration configuration) {
		this.configuration = configuration;
		
		initiate = new InitialState(this);
		start = new StartState(this);
		playerRevive = new PlayerReviveState(this);
		playerDontRevive = new PlayerDontReviveState(this);
		hungerGame = new HungerGameState(this);
		pause = new PauseState(this);
		stop = new StopState(this);
		current = initiate;		
	}
	
	@Override
	public IHungerGameState getCurrentState() {
		return current;
	}

	@Override
	public IHungerGameState setCurrentState(IHungerGameState current) {
		return this.current = current;
	}

	@Override
	public IHungerGameState getInitiate() {
		return initiate;
	}

	@Override
	public IHungerGameState getStart() {
		return start;
	}

	@Override
	public IHungerGameState getPlayerRevive() {
		return playerRevive;
	}

	@Override
	public IHungerGameState getPlayerDontRevive() {
		return playerDontRevive;
	}

	@Override
	public IHungerGameState getHungerGame() {
		return hungerGame;
	}

	@Override
	public IHungerGameState getPause() {
		return pause;
	}

	@Override
	public IHungerGameState getStop() {
		return stop;
	}

	@Override
	public void initiate() {
		current.initiate();
	}

	@Override
	public void start() {
		current.start();
	}

	@Override
	public void pause() {
		current.pause(current);
	}

	@Override
	public void relaunch() {
		current.relaunch();
	}

	@Override
	public void stop() {
		current.stop();
	}

	@Override
	public void onPlayerDie(PlayerDeathEvent event) {//verify there is no need to update the scoreboard in this method
		current.onPlayerDie(event);
	}

	@Override
	public void onPlayerJoin(PlayerJoinEvent event) {//verify there is no need to update the scoreboard in this method
		current.onPlayerJoin(event);
	}

	@Override
	public void onPlayerMove(PlayerMoveEvent event) {
		current.onPlayerMove(event);
	}

	@Override
	public void onPlayerQuit(PlayerQuitEvent event) {//verify there is no need to update the scoreboard in this method
		current.onPlayerQuit(event);
	}

	@Override
	public void onPlayerRespawn(PlayerRespawnEvent event) {//verify there is no need to update the scoreboard in this method
		current.onPlayerRespawn(event);
	}

	@Override
	public void time() {
		current.time();
	}

	@Override
	public HungerGameConfiguration getConfiguration() {
		return configuration;
	}
}
