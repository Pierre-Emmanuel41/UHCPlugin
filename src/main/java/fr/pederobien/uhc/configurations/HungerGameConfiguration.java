package fr.pederobien.uhc.configurations;

import java.time.LocalTime;

import org.bukkit.block.Block;

import fr.pederobien.uhc.game.hungergame.HungerGame;
import fr.pederobien.uhc.interfaces.IHungerGameConfiguration;
import fr.pederobien.uhc.managers.ETeam;
import fr.pederobien.uhc.managers.WorldManager;

public class HungerGameConfiguration extends AbstractConfiguration implements IHungerGameConfiguration {
	private static final Block DEFAULT_CENTER = WorldManager.getHighestBlockYAt(0, 0);
	private static final Double DEFAULT_INITIAL_BORDER_SIZE = new Double(2000);
	private static final Double DEFAULT_FINAL_BORDER_SIZE = new Double(10);
	private static final LocalTime DEFAULT_FRACTION_TIME = LocalTime.of(0, 45, 0);
	private static final LocalTime DEFAULT_WARNING_TIME = LocalTime.of(0, 5, 0);
	private static final LocalTime DEFAULT_PVP_TIME = LocalTime.of(0, 0, 0);
	private Block borderCenter;
	private Double initialBorderDiameter, finalBorderDiameter;
	private LocalTime fractionTime, warningTime, pvpTime;

	public HungerGameConfiguration(String name) {
		super(name);
		setGame(new HungerGame(this));
		
		addTeam(ETeam.DARK_AQUA.setName("chevalier"));
		addTeam(ETeam.DARK_RED.setName("barbare"));
	}

	@Override
	public Block getBorderCenter() {
		return borderCenter == null ? DEFAULT_CENTER : borderCenter;
	}

	@Override
	public void setBorderCenter(Block borderCenter) {
		this.borderCenter = borderCenter;
	}

	@Override
	public void setBorderCenter(String x, String z) {
		borderCenter = WorldManager.getBelowHighestBlockYAt(Integer.parseInt(x), Integer.parseInt(z));
	}

	@Override
	public Double getInitialBorderDiameter() {
		return initialBorderDiameter == null ? DEFAULT_INITIAL_BORDER_SIZE : initialBorderDiameter;
	}

	@Override
	public void setInitialBorderDiameter(double initialBorderDiameter) {
		this.initialBorderDiameter = initialBorderDiameter;
	}

	@Override
	public Double getFinalBorderDiameter() {
		return finalBorderDiameter == null ? DEFAULT_FINAL_BORDER_SIZE : finalBorderDiameter;
	}

	@Override
	public void setFinalBorderDiameter(double finalBorderDiameter) {
		this.finalBorderDiameter = finalBorderDiameter;
	}

	@Override
	public LocalTime getFractionTime() {
		return fractionTime == null ? DEFAULT_FRACTION_TIME : fractionTime;
	}

	@Override
	public void setFractionTime(LocalTime fractionTime) {
		this.fractionTime = fractionTime;
	}
	
	@Override
	public LocalTime getWarningTime() {
		return warningTime == null ? DEFAULT_WARNING_TIME : warningTime;
	}
	
	@Override
	public void setWarningTime(LocalTime warningTime) {
		this.warningTime = warningTime;
	}
	
	@Override
	public LocalTime getPvpTime() {
		return pvpTime == null ? DEFAULT_PVP_TIME : pvpTime;
	}
	
	@Override
	public void setPvpTime(LocalTime pvpTime) {
		this.pvpTime = pvpTime;
	}
}
