package fr.pederobien.uhc.commands.configuration.edit.editions.bawn;

import fr.pederobien.uhc.commands.configuration.edit.editions.AbstractEditionsFactory;
import fr.pederobien.uhc.commands.configuration.edit.editions.IEdition;
import fr.pederobien.uhc.commands.configuration.edit.editions.IMapEdition;
import fr.pederobien.uhc.interfaces.IBawn;
import fr.pederobien.uhc.interfaces.IPersistence;

public abstract class AbstractBawnEditionsFactory<T extends IBawn> extends AbstractEditionsFactory<T> {

	public AbstractBawnEditionsFactory(IPersistence<T> persistence) {
		super(persistence);
	}

	public IEdition createCenterEdition() {
		return new CommonCenter<T>(persistence);
	}

	public IEdition createDimensionsEdition() {
		return new CommonDimensions<T>(persistence);
	}

	public abstract IEdition createExtractEdition();

	public abstract IMapEdition createRenameEdition();
}
