package fr.pederobien.uhc.scoreboard.hungergame;

public class BeforeBorderMoveState extends AbstractHungerGameScoreboardState {

	public BeforeBorderMoveState(IHGScoreboard scoreboard) {
		super(scoreboard, "Game");
	}

	@Override
	protected void updateEntries() {
		addEntries(prepareTimeNoEscape(task.getTotalTime()));
		addEntries("Temps de jeu");
		addEntries(prepareTimeOneEscape(task.getDecreasingTime()));
		addEntries("Déplacement bordure dans");
	}

	@Override
	public void pause(IHGScoreboardState before) {
		scoreboard.setCurrentState(scoreboard.getPauseState()).pause(before);
	}

	@Override
	public void time() {
		scoreboard.setCurrentState(scoreboard.getAfterBorderMoveState());
	}

	@Override
	public void stop() {
		scoreboard.setCurrentState(scoreboard.getStopState()).stop();
	}
}
