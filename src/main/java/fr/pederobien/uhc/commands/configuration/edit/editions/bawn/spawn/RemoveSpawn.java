package fr.pederobien.uhc.commands.configuration.edit.editions.bawn.spawn;

import fr.pederobien.uhc.commands.configuration.edit.editions.bawn.CommonRemove;
import fr.pederobien.uhc.dictionary.dictionaries.MessageCode;
import fr.pederobien.uhc.interfaces.ISpawn;

public class RemoveSpawn extends CommonRemove<ISpawn> {

	public RemoveSpawn() {
		super(MessageCode.REMOVE_SPAWN_EXPLANATION);
	}

	@Override
	protected void onRemove() {
		sendMessage(MessageCode.REMOVE_SPAWN_REMOVED, get().getName());
	}
}
