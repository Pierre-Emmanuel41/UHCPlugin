package fr.pederobien.uhc.commands.configuration.edit.editions.bawn.base;

import fr.pederobien.uhc.commands.configuration.edit.editions.bawn.CommonLaunch;
import fr.pederobien.uhc.dictionary.dictionaries.MessageCode;
import fr.pederobien.uhc.interfaces.IBase;
import fr.pederobien.uhc.managers.EColor;

public class LaunchBase extends CommonLaunch<IBase> {

	public LaunchBase() {
		super(MessageCode.LAUNCH_BASE_EXPLANATION);
	}

	@Override
	protected void onLaunch() {
		switch (get().getChestsNumber()) {
		case 0:
			sendMessage(MessageCode.LAUNCH_BASE_NO_TEAM_SUPPORTED, get().getName(), "" + get().getCenter().getX(), "" + get().getCenter().getY(),
					"" + get().getCenter().getZ());
			break;
		case 1:
			sendMessage(MessageCode.LAUNCH_BASE_ONE_TEAM_SUPPORTED, get().getName(), "" + get().getCenter().getX(), "" + get().getCenter().getY(),
					"" + get().getCenter().getZ(), get().getChests().values().iterator().next().getColoredColorName());
			break;
		default:
			String teamColors = "";
			for (EColor color : get().getChests().values())
				teamColors += color.getColoredColorName() + " ";
			sendMessage(MessageCode.LAUNCH_BASE_TEAMS_SUPPORTED, get().getName(), "" + get().getCenter().getX(), "" + get().getCenter().getY(),
					"" + get().getCenter().getZ(), teamColors);
			break;
		}
	}

	@Override
	protected void onNotExist(String name) {
		sendMessage(MessageCode.LAUNCH_BASE_NOT_EXISTING, name);
	}

	@Override
	protected void onNeedCoordinates(String name) {
		sendMessage(MessageCode.LAUNCH_BASE_MISSING_COORDINATES, name);
	}

	@Override
	protected void onNeedNameAndCoordinates(String name) {
		sendMessage(MessageCode.LAUNCH_BASE_MISSING_NAME_AND_COORDINATES, name);
	}
}
