package fr.pederobien.uhc.commands.configuration.edit.editions.configurations.blockedexgame;

import java.util.Arrays;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import fr.pederobien.uhc.commands.configuration.edit.editions.configurations.AbstractConfEdition;
import fr.pederobien.uhc.dictionary.dictionaries.MessageCode;
import fr.pederobien.uhc.interfaces.IBlockedexConfiguration;

public class BaseDistanceBlockedexGame extends AbstractConfEdition<IBlockedexConfiguration> {

	public BaseDistanceBlockedexGame() {
		super("basedistance", MessageCode.BASE_DISTANCE_BLOCKEDEX_GAME_EXPLANATION);
	}

	@Override
	public void edit(String[] args) {
		int distance;
		try {
			distance = Integer.parseInt(args[0]);
			if (distance <= 0) {
				sendMessage(MessageCode.BASE_DISTANCE_BLOCKEDEX_GAME_NEGATIVE_DISTANCE);
				return;
			}

			get().setBaseFromSpawnDistance(distance);
			sendMessage(MessageCode.BASE_DISTANCE_BLOCKEDEX_GAME_DEFINED, get().getBaseFromSpawnDistance().toString());
		} catch (NumberFormatException e) {
			sendMessage(MessageCode.BASE_DISTANCE_BLOCKEDEX_GAME_BAD_DISTANCE_FORMAT);
		} catch (IndexOutOfBoundsException e) {
			sendMessage(MessageCode.BASE_DISTANCE_BLOCKEDEX_GAME_MISSING_DISTANCE);
		}
	}

	@Override
	public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
		if (args.length == 1)
			return Arrays.asList(onTabComplete(sender, MessageCode.BASE_DISTANCE_BLOCKEDEX_GAME_TAB_COMPLETE));
		return super.onTabComplete(sender, command, alias, args);
	}
}
