package fr.pederobien.uhc.commands.configuration;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import fr.pederobien.uhc.commands.AbstractCommand;
import fr.pederobien.uhc.commands.configuration.edit.EditHungerGameConfiguration;
import fr.pederobien.uhc.commands.configuration.edit.IEditConfig;

public class HungerGameConfigurationCommand extends AbstractCommand {
	private IEditConfig hungergameConfig;
	
	public HungerGameConfigurationCommand(JavaPlugin plugin, String command) {
		super(plugin, command);
		hungergameConfig = new EditHungerGameConfiguration(confContext);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (hungergameConfig.edit(args))
			sendMessageToSender(sender, hungergameConfig.getMessage());
		else
			sendMessageToSender(sender, hungergameConfig.getEditCommands());
		return false;
	}

}