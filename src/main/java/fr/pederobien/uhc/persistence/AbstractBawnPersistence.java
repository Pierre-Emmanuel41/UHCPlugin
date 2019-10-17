package fr.pederobien.uhc.persistence;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import fr.pederobien.uhc.interfaces.IBawn;

public abstract class AbstractBawnPersistence<T extends IBawn> extends AbstractPersistence<T> {
	
	public AbstractBawnPersistence(T elt) {
		super(elt);
	}
	
	protected abstract String getDefault();

	@Override
	protected void checkAndWriteDefault() {
		File file = new File(getPath());
		if (!file.exists()) {
			file.mkdirs();
			BufferedWriter writer = null;
			try {
				writer = new BufferedWriter(new FileWriter(new File(getAbsolutePath())));
				writer.write(getDefault());
			} catch (IOException e) {

			} finally {
				try {
					writer.close();
				} catch (IOException e) {

				}
			}
		}
		try {
			load(get().getName());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
