package fr.pederobien.uhc.dictionary;

import org.bukkit.entity.Player;

import fr.pederobien.uhc.BukkitManager;
import fr.pederobien.uhc.event.MessageCodeEvent;
import fr.pederobien.uhc.event.MessageEvent;
import fr.pederobien.uhc.managers.PlayerManager;

public class NotificationCenter {

	public static void sendMessage(MessageEvent event) {
		switch (event.getCode().getPermission()) {
		case ALL:
			PlayerManager.getPlayers().forEach(p -> sendMessage(p, event));
			break;
		case COMMAND_SENDER:
			if (event.getSender() instanceof Player)
				sendMessage((Player) event.getSender(), event);
			break;
		case OPERATORS:
			BukkitManager.getOnlineOperators().forEach(p -> sendMessage(p, event));
		default:
			break;
		}
	}

	private static void sendMessage(Player player, MessageCodeEvent event) {
		PlayerManager.sendMessageToPlayer(player, DictionaryManager.getMessage(player, event));
	}
}
