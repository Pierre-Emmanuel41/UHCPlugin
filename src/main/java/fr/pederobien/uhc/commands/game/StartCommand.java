package fr.pederobien.uhc.commands.game;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import fr.pederobien.uhc.commands.AbstractCommand;
import fr.pederobien.uhc.commands.configuration.edit.editions.EditConfigurationFactory;
import fr.pederobien.uhc.dictionary.dictionaries.MessageCode;
import fr.pederobien.uhc.managers.PlayerManager;

public class StartCommand extends AbstractCommand {

	public StartCommand(JavaPlugin plugin, String command) {
		super(plugin, command);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		System.out.println("Start command : On command");
		try {
			if (confContext.getPlayersRegistered().count() != PlayerManager.getNumberOfPlayer())
				sendMessage(createMessageEvent(sender, MessageCode.PLAYERS_NOT_IN_TEAM));
			else {
				if (confContext.initiate()) {
					EditConfigurationFactory.setAllAvailable(false);
					confContext.prepareTeam();
					confContext.start();
				} else
					sendMessage(createMessageEvent(sender, confContext.getMessage()));
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
			sendMessage(createMessageEvent(sender, MessageCode.NO_GAME_STYLE_DEFINED_AS_CURRENT));
		}
		return true;
	}
}
