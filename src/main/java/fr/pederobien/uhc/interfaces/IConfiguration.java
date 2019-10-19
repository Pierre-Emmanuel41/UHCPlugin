package fr.pederobien.uhc.interfaces;

import java.time.LocalTime;

import fr.pederobien.uhc.managers.ETeam;

public interface IConfiguration extends IUnmodifiableConfiguration {
	
	void setName(String name);

	boolean addTeam(ETeam team);

	void setScoreboardRefresh(Long refresh);

	void setGameTime(LocalTime gameTime);
	
	void createAssociatedTeams();
}
