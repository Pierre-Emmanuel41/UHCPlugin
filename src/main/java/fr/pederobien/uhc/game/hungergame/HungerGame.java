package fr.pederobien.uhc.game.hungergame;

import java.time.LocalTime;

import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

import fr.pederobien.uhc.dictionary.dictionaries.MessageCode;
import fr.pederobien.uhc.game.AbstractGame;
import fr.pederobien.uhc.interfaces.IUnmodifiableHungerGameConfiguration;

public class HungerGame extends AbstractGame implements IHungerGame {
	private IHungerGameState initiate;
	private IHungerGameState start;
	private IHungerGameState playerRevive;
	private IHungerGameState playerDontRevive;
	private IHungerGameState hungerGame;
	private IHungerGameState stop;
	private IHungerGameState current;
	private IUnmodifiableHungerGameConfiguration configuration;

	public HungerGame(IUnmodifiableHungerGameConfiguration configuration) {
		this.configuration = configuration;

		initiate = new InitialState(this);
		start = new StartState(this);
		playerRevive = new PlayerReviveState(this);
		playerDontRevive = new PlayerDontReviveState(this);
		hungerGame = new HungerGameState(this);
		stop = new StopState(this);
		current = initiate;
	}

	@Override
	public IHungerGameState getCurrentState() {
		return current;
	}

	@Override
	public IHungerGameState setCurrentState(IHungerGameState current) {
		System.out.println("Hunger game : changing state from : " + this.current.getClass().getSimpleName() + " to " + current.getClass().getSimpleName());
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
	public IHungerGameState getStop() {
		return stop;
	}

	@Override
	public boolean initiate() {
		System.out.println("Hunger game : Initiate, current state : " + current.getClass().getSimpleName());
		return current.initiate();
	}

	@Override
	public void start() {
		super.start();
		current.start();
	}

	@Override
	public void pause() {
		current.pause();
	}

	@Override
	public void relaunch() {
		current.relaunch();
	}

	@Override
	public void stop() {
		super.stop();
		current.stop();
	}

	@Override
	public MessageCode getMessage() {
		return current.getMessage();
	}

	@Override
	public void onPlayerDie(PlayerDeathEvent event) {
		super.onPlayerDie(event);
		current.onPlayerDie(event);
	}

	@Override
	public void onPlayerJoin(PlayerJoinEvent event) {
		current.onPlayerJoin(event);
	}

	@Override
	public void onPlayerMove(PlayerMoveEvent event) {
		current.onPlayerMove(event);
	}

	@Override
	public void onPlayerQuit(PlayerQuitEvent event) {
		current.onPlayerQuit(event);
	}

	@Override
	public void onPlayerRespawn(PlayerRespawnEvent event) {
		current.onPlayerRespawn(event);
	}

	@Override
	public void onPlayerInteract(PlayerInteractEvent event) {
		current.onPlayerInteract(event);
	}

	@Override
	public void onPlayerInventoryClick(InventoryClickEvent event) {
		current.onPlayerInventoryClick(event);
	}

	@Override
	public void onCreatureSpawn(CreatureSpawnEvent event) {
		current.onCreatureSpawn(event);
	}

	@Override
	public void onPlayerPortalEvent(PlayerPortalEvent event) {
		current.onPlayerPortalEvent(event);
	}

	@Override
	public void time(LocalTime time) {
		current.time(time);
	}

	@Override
	public IUnmodifiableHungerGameConfiguration getConfiguration() {
		return configuration;
	}
}
