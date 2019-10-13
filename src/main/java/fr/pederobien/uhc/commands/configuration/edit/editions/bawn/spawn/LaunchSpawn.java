package fr.pederobien.uhc.commands.configuration.edit.editions.bawn.spawn;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

import fr.pederobien.uhc.commands.configuration.edit.editions.bawn.AbstractBawnEdition;
import fr.pederobien.uhc.conf.persistence.IPersistence;
import fr.pederobien.uhc.world.blocks.ISpawn;

public class LaunchSpawn extends AbstractBawnEdition<ISpawn> {

	public LaunchSpawn(IPersistence<ISpawn> persistence) {
		super(persistence, "launch", "to launch a spawn in the world");
	}

	@Override
	public String edit(String[] args) {
		if (args.length == 0) {
			get().launch();
			return "Spawn " + get().getName() + " launched at " + showBlock(get().getCenter());
		} else if (args.length < 2) {
			getPersistence().save();
			try {
				getPersistence().load(args[0]);
				get().launch();
				return "Spawn " + get().getName() + " launched at " + showBlock(get().getCenter());
			} catch (FileNotFoundException e) {
				return "Cannot launch spawn " + args[0] + ", spawn does not exist";
			}
		} else if (args.length < 4) {
			try {
				get().setCenter(args[0], args[1], args[2]);
				get().launch();
				return "Spawn " + get().getName() + " launched at " + showBlock(get().getCenter());
			} catch (IndexOutOfBoundsException e) {
				return "Cannot launch spawn " + get().getName() + ", need center's coordinates <X> <Y> <Z>";
			} catch (NumberFormatException e) {
				return "Cannot parse width or height or depth";
			}
		} else {
			getPersistence().save();
			try {
				getPersistence().load(args[0]);
				get().setCenter(args[1], args[2], args[3]);
				get().launch();
				return "Spawn " + get().getName() + " launched at " + showBlock(get().getCenter());
			} catch (FileNotFoundException e) {
				return "Cannot launch spawn " + args[0] + ", spawn does not exist";
			} catch (IndexOutOfBoundsException e) {
				return "Cannot launch spawn " + args[0] + ", need the spawn's name and center's coordinates <X> <Y> <Z>";
			} catch (NumberFormatException e) {
				return "Cannot parse width or height or depth";
			}
		}
	}

	@Override
	public List<String> getArguments(String[] subArguments) {
		return Arrays.asList("<nothing>", "<name>", "<X> <Y> <Z>", "<name> <X> <Y> <Z>");
	}
}