package fr.pederobien.uhc.game.blockedexgame;

import fr.pederobien.uhc.dictionary.dictionaries.MessageCode;
import fr.pederobien.uhc.managers.BaseManager;
import fr.pederobien.uhc.managers.BlockedexPlayerManager;
import fr.pederobien.uhc.scoreboard.launcher.BDScoreboardLauncher;
import fr.pederobien.uhc.task.TaskLauncher;
import fr.pederobien.uhc.task.TimeLine;

public class InitialState extends AbstractBlockedexState {

	public InitialState(IBlockedexGame game) {
		super(game);
	}

	@Override
	public boolean initiate() {
		if (!BaseManager.setBlockedexGameCurrentConfiguration(getConfiguration())) {
			message = MessageCode.BAD_BASES_CONFIGURATION;
			return false;
		}

		taskLauncher = new TaskLauncher(getConfiguration().getGameTime());
		timeLine = new TimeLine(taskLauncher.getTask());
		scoreboardLauncher = new BDScoreboardLauncher(taskLauncher.getTask(), getConfiguration());
		bdPlayerManager = new BlockedexPlayerManager(getConfiguration());

		return true;
	}

	@Override
	public void start() {
		game.setCurrentState(game.getStart()).start();
	}
}
