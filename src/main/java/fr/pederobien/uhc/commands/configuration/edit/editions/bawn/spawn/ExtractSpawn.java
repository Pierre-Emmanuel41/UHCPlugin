package fr.pederobien.uhc.commands.configuration.edit.editions.bawn.spawn;

import fr.pederobien.uhc.commands.configuration.edit.editions.bawn.CommonExtract;
import fr.pederobien.uhc.dictionary.dictionaries.MessageCode;
import fr.pederobien.uhc.interfaces.ISpawn;

public class ExtractSpawn extends CommonExtract<ISpawn> {

	public ExtractSpawn() {
		super(MessageCode.EXTRACT_SPAWN_EXPLANATION);
	}

	@Override
	protected MessageCode onExtracted() {
		return MessageCode.EXTRACT_SPAWN_EXTRACTED.withArgs(get().getName());
	}
}
