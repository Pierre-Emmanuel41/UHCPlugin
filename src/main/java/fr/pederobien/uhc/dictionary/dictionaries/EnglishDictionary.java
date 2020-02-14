package fr.pederobien.uhc.dictionary.dictionaries;

import java.util.Locale;

public class EnglishDictionary extends AbstractDictionary {

	public EnglishDictionary() {
		super(Locale.UK, Locale.US, Locale.ENGLISH, Locale.CANADA);

		registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_CURRENT_GAME_TIME) {
			@Override
			public String getMessage(String... args) {
				return "Time : ";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_CURRENT_PAUSE_TIME) {
			@Override
			public String getMessage(String... args) {
				return "Pause : ";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_HUNGER_GAME_BORDER) {
			@Override
			public String getMessage(String... args) {
				return "Border : ";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_BLOCKEDEX_GAME_NORTH_BASE) {
			@Override
			public String getMessage(String... args) {
				return "North : ";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_BLOCKEDEX_GAME_SOUTH_BASE) {
			@Override
			public String getMessage(String... args) {
				return "Sud : ";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_BLOCKEDEX_GAME_WEST_BASE) {
			@Override
			public String getMessage(String... args) {
				return "West : ";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_BLOCKEDEX_GAME_EAST_BASE) {
			@Override
			public String getMessage(String... args) {
				return "East : ";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.DELETE_ON_CANNOT_DELETE) {
			@Override
			public String getMessage(String... args) {
				return "Cannot delete " + args[0];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.HELP_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to displayer all features";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_NAME_MUST_NOT_START_BY_DEFAULT) {
			@Override
			public String getMessage(String... args) {
				return args[0] + " must not start with 'default' (ignoring case)";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_NAME_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<name>";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<newname>";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BAD_COORDINATES_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Bad coordinates format, they should be integer";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.COMMAND_NOT_AVAILABLE) {
			@Override
			public String getMessage(String... args) {
				return "Command " + args[0] + " is not available";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.CANNOT_RUN_COMMAND) {
			@Override
			public String getMessage(String... args) {
				return "Cannot run command " + args[0] + ", arguments are missing";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.ARGUMENT_NOT_VALID) {
			@Override
			public String getMessage(String... args) {
				return "Argument " + args[0] + " is not a valid argument";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.COMMAND_NOT_AVAILABLE_YET) {
			@Override
			public String getMessage(String... args) {
				return "Command " + args[0] + " not available yet";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BAD_TIME_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Cannot parse the time, the format should be hh:mm:ss";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.CENTER_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to set the center";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.CENTER_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Center defined in " + args[0] + " " + args[1] + " " + args[2];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.CENTER_COORDINATES_ARE_MISSING) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set center’s coordinates, need <X> <Y> <Z>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.DIMENSIONS_MISSING_DIMENSIONS) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set dimensions, need <width> <height> <depth>";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.DIMENSIONS_BAD_DIMENSIONS_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Bad dimensions format, they should be integer";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.DIMENSIONS_WITDH_HEIGHT_DEPTH_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<width> <height> <depth>";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.DIMENSIONS_HEIGHT_DEPTH_TAB_COMPLETE) {

			@Override
			public String getMessage(String... args) {
				return "<height> <depth>";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.DIMENSIONS_DEPTH_TAB_COMPLETE) {

			@Override
			public String getMessage(String... args) {
				return "<depth>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.BASE_EDITION_CONFIGURATION_EXPLANATION) {

			@Override
			public String getMessage(String... args) {
				return "to configure a base";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.CURRENT_BASE_EXPLANATION) {

			@Override
			public String getMessage(String... args) {
				return "to know the current base's name";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.CURRENT_BASE_MESSAGE) {

			@Override
			public String getMessage(String... args) {
				return "Current base :\n" + args[0];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.DELETE_BASE_EXPLANATION) {

			@Override
			public String getMessage(String... args) {
				return "to delete a base";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.DELETE_BASE_DELETED) {

			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " deleted";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.DIMENSIONS_BASE_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to extract from the world the blocks of the base";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.DIMENSIONS_BASE_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Dimensions of the base " + args[0] + " defined as " + args[1] + " " + args[2] + " " + args[3];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.EXTRACT_BASE_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to extract from the world the blocks of the base";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.EXTRACT_BASE_ONE_CHEST_EXTRACTED) {
			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " extracted\nOne chest for team's color : " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.EXTRACT_BASE_CHESTS_EXTRACTED) {
			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " extracted\nChests for teams : " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.EXTRACT_BASE_MAGENTA_WOOL_IS_FORBIDDEN) {
			@Override
			public String getMessage(String... args) {
				return "Usage of magenta wool is forbidden, please use pink or purple wool";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.EXTRACT_BASE_BROWN_WOOL_HAS_NO_EQUIVALENT) {
			@Override
			public String getMessage(String... args) {
				return "Brown wool as no equivalent in team's color";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.EXTRACT_BASE_MATERIAL_UNDER_CHEST_IS_NOT_WOOL) {
			@Override
			public String getMessage(String... args) {
				return "Blocks under chests are not wool";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_BASE_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to launch a base in the world";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_BASE_NO_TEAM_SUPPORTED) {
			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " launched at " + args[1] + " " + args[2] + " " + args[3] + "\nNo team color supported";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_BASE_ONE_TEAM_SUPPORTED) {
			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " launched at " + args[1] + " " + args[2] + " " + args[3] + "\nOne team color supported : " + args[4];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_BASE_TEAMS_SUPPORTED) {
			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " launched at " + args[1] + " " + args[2] + " " + args[3] + "\nTeam colors supported : " + args[4];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_BASE_NOT_EXISTING) {
			@Override
			public String getMessage(String... args) {
				return "Cannot launch base " + args[0] + ", base does not exist";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_BASE_MISSING_COORDINATES) {
			@Override
			public String getMessage(String... args) {
				return "Cannot launch base " + args[0] + ", need center’s coordinates <X> <Y> <Z>";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_BASE_MISSING_NAME_AND_COORDINATES) {
			@Override
			public String getMessage(String... args) {
				return "Cannot launch base " + args[0] + " need the base’s name and center’s coordinates <X> <Y> <Z>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.LIST_BASE_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to display all existing base's name";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_BASE_SIZE_EQUALS_0) {
			@Override
			public String getMessage(String... args) {
				return "No existing base";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_BASE_SIZE_EQUALS_1) {
			@Override
			public String getMessage(String... args) {
				return "One existing base : " + args[0];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_BASE_SIZE_GREATER_THAN_0) {
			@Override
			public String getMessage(String... args) {
				return "List of existing bases :\n" + args[0];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.NEW_BASE_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to create a new base";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_BASE_CREATED) {
			@Override
			public String getMessage(String... args) {
				return "New base " + args[0] + " created";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_BASE_ALREADY_EXISTING) {
			@Override
			public String getMessage(String... args) {
				return "Cannot create a new base, the base " + args[0] + " already exist";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_BASE_MISSING_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Cannot create a new base, need the name";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.REMOVE_BASE_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to remove the base from the world";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.REMOVE_BASE_REMOVED) {
			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " removed from the world";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_BASE_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to rename the base";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_BASE_RENAMED) {
			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " renamed as " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_BASE_ALREADY_EXISTING) {
			@Override
			public String getMessage(String... args) {
				return "Cannot rename base " + args[0] + " as " + args[1] + ", base already exist";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_BASE_MISSING_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Cannot rename the base " + args[0] + ", need the name";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.RESET_BASE_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to reset base's characteristics";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SAVE_BASE_SAVED) {
			@Override
			public String getMessage(String... args) {
				return "The characteristics of the base " + args[0] + " have been reset";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.SAVE_BASE_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to save a base";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SAVE_BASE_SAVED) {
			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " saved";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.SPAWN_EDITION_CONFIGURATION_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to configure a spawn";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.CURRENT_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to know the current spawn’s name";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.CURRENT_SPAWN_MESSAGE) {
			@Override
			public String getMessage(String... args) {
				return "Current spawn :\n" + args[0];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.DELETE_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to delete a spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.DELETE_SPAWN_DELETED) {
			@Override
			public String getMessage(String... args) {
				return "Spawn " + args[0] + " deleted";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.DIMENSIONS_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to set the dimensions of the spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.DIMENSIONS_SPAWN_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Dimensions of the spawn " + args[0] + " defined as " + args[1] + " " + args[2] + " " + args[3];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.EXTRACT_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to extract from the world the blocks of the spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.EXTRACT_SPAWN_EXTRACTED) {
			@Override
			public String getMessage(String... args) {
				return "Spawn " + args[0] + " extracted";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to launch a spawn in the world";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_SPAWN_LAUNCHED) {
			@Override
			public String getMessage(String... args) {
				return "Spawn " + args[0] + " launched at " + args[1] + " " + args[2] + " " + args[3];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_SPAWN_NOT_EXISTING) {
			@Override
			public String getMessage(String... args) {
				return "Cannot launch spawn " + args[0] + ", spawn does not exist";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_SPAWN_MISSING_COORDINATES) {
			@Override
			public String getMessage(String... args) {
				return "Cannot launch spawn " + args[0] + ", need center’s coordinates <X> <Y> <Z>";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_SPAWN_MISSING_NAME_AND_COORDINATES) {
			@Override
			public String getMessage(String... args) {
				return "Cannot launch spawn " + args[0] + " need the spawn’s name and center’s coordinates <X> <Y> <Z>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.LIST_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to display all existing spawn's names";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_SPAWN_SIZE_EQUALS_0) {
			@Override
			public String getMessage(String... args) {
				return "No existing spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_SPAWN_SIZE_EQUALS_1) {
			@Override
			public String getMessage(String... args) {
				return "One existing spawn : " + args[0];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_SPAWN_SIZE_GREATER_THAN_0) {
			@Override
			public String getMessage(String... args) {
				return "List of existing spawns :\n" + args[0];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.NEW_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to create a new spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_SPAWN_CREATED) {
			@Override
			public String getMessage(String... args) {
				return "New spawn " + args[0] + " created";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_SPAWN_ALREADY_EXISTING) {
			@Override
			public String getMessage(String... args) {
				return "The spawn " + args[0] + " already exist";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_SPAWN_MISSING_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Cannot create a new spawn, need the name";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.PLAYER_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to set the player's spawn when the spawn is launched on the world";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PLAYER_SPAWN_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Players will spawn at " + args[0] + " " + args[1] + " " + args[2];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PLAYER_SPAWN_MISSING_COORDINATES) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set player spawn’s coordinates, need <X> <Y> <Z>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.RANDOM_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to launch randomly a spawn on the world";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RANDOM_SPAWN_LAUNCHED) {
			@Override
			public String getMessage(String... args) {
				return "Spawn " + args[0] + " launched at " + args[1] + " " + args[2] + " " + args[3];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RANDOM_SPAWN_CANNOT_BE_LAUNCHED) {
			@Override
			public String getMessage(String... args) {
				return "Cannot launch spawn " + args[0] + ", spawn does not exist";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RANDOM_SPAWN_MISSING_COORDINATES) {
			@Override
			public String getMessage(String... args) {
				return "Cannot launch a spawn, need center's coordinates <X> <Y> <Z>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.REMOVE_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to remove the spawn from the world";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.REMOVE_SPAWN_REMOVED) {
			@Override
			public String getMessage(String... args) {
				return "Spawn " + args[0] + " removed from the world";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to rename the spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_SPAWN_RENAMED) {
			@Override
			public String getMessage(String... args) {
				return "Spawn " + args[0] + " renamed as " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_SPAWN_ALREADY_EXISTING) {
			@Override
			public String getMessage(String... args) {
				return "Cannot rename spawn " + args[0] + " as " + args[1] + ", spawn already exist";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_SPAWN_MISSING_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Cannot rename the spawn " + args[0] + ", need the name";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.RESET_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to reset spawn's characteristics";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RESET_SPAWN_MESSAGE) {
			@Override
			public String getMessage(String... args) {
				return "The characteristics of the spawn " + args[0] + " have been reset";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.SAVE_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to save the current spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SAVE_SPAWN_SAVED) {
			@Override
			public String getMessage(String... args) {
				return "Spawn " + args[0] + " saved";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.AS_CURRENT_STYLE_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Style " + args[0] + " defined as current style";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.GAME_TIME_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Game time defined : " + args[0] + "h " + args[1] + "m " + args[2] + "s";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.GAME_TIME_MISSING_TIME) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set the game time, need the time";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.LOAD_CANNOT_LOAD) {
			@Override
			public String getMessage(String... args) {
				return "Cannot load style " + args[0] + ", style does not existing";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_REFRESH_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to set the number of server’s tic after which the scoreboard of each player is refreshed";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_REFRESH_NEGATIVE_TIC_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "The number of tics must be strictly positive";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_REFRESH_ONE_TIC_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Scoreboard refreshed each tic";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_REFRESH_TICS_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Scoreboard refreshed each " + args[0] + " tics";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_REFRESH_MISSING_TICS) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set the scoreboard refresh value, need a number of tics";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_REFRESH_BAD_TICS_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Cannot parse number of tics, the value must be an integer";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_REFRESH_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<number of tics>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to manage team for game style";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_BAD_TEAM) {
			@Override
			public String getMessage(String... args) {
				return args[0] + " does not correspond to a team";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_BAD_PLAYER) {
			@Override
			public String getMessage(String... args) {
				return args[0] + " does not correspond to a player";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_BAD_COLOR) {
			@Override
			public String getMessage(String... args) {
				return args[0] + " does not correspond to a color";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ALREADY_EXISTING_TEAM_COLOR) {
			@Override
			public String getMessage(String... args) {
				return "The color " + args[0] + " is already used";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ALREADY_EXISTING_TEAM_NAME) {
			@Override
			public String getMessage(String... args) {
				return "The team " + args[0] + " already exists";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_FORBIDDEN_NAME) {
			@Override
			public String getMessage(String... args) {
				return "The name " + args[0] + " is forbidden for a team";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_PLAYER_ALREADY_IN_TEAM) {
			@Override
			public String getMessage(String... args) {
				return "The player " + args[0] + " is already in a team (" + args[1] + ")";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ADDPLAYER_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to add players into a team";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ADDPLAYER_NO_PLAYER_ADDED) {
			@Override
			public String getMessage(String... args) {
				return "No player added";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ADDPLAYER_ONE_PLAYER_ADDED) {
			@Override
			public String getMessage(String... args) {
				return "Player " + args[0] + " has been added to " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ADDPLAYER_PLAYERS_ADDED) {
			@Override
			public String getMessage(String... args) {
				return "Players " + args[0] + " has been added to " + args[1];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ADDTEAM_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to add a team to a game style";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ADDTEAM_TEAM_NO_PLAYER_ADDED) {
			@Override
			public String getMessage(String... args) {
				return "Team " + args[0] + " created, no player added";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ADDTEAM_TEAM_ONE_PLAYER_ADDED) {
			@Override
			public String getMessage(String... args) {
				return "Team " + args[0] + " created, one player added " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ADDTEAM_TEAM_PLAYERS_ADDED) {
			@Override
			public String getMessage(String... args) {
				return "Team " + args[0] + " created, players added " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ADDTEAM_MISSING_ARGUMENTS) {
			@Override
			public String getMessage(String... args) {
				return "Cannot create a new team, arguments are missing";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_LIST_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to display all existing team(s) for a game style";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_LIST_NO_EXISTING_TEAM) {
			@Override
			public String getMessage(String... args) {
				return "No existing team for game style " + args[0];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_LIST_ONE_EXISTING_TEAM) {
			@Override
			public String getMessage(String... args) {
				return "One Existing team for style " + args[0] + " :\n" + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_LIST_EXISTING_TEAMS) {
			@Override
			public String getMessage(String... args) {
				return "List of existing teams for style " + args[0] + " :\n" + args[1];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_MODIFY_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to modify team's characteristics";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_MODIFY_COLOR_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to change the color of a team";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_MODIFY_COLOR_MODIFIED) {
			@Override
			public String getMessage(String... args) {
				return args[0] + "'s color has been updated";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_MODIFY_COLOR_UNCHANGED) {
			@Override
			public String getMessage(String... args) {
				return args[0] + "'s color has not been changed";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_MODIFY_NAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to modify team's name";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_MODIFY_NAME_MODIFIED) {
			@Override
			public String getMessage(String... args) {
				return "Team " + args[0] + " renamed as " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_MODIFY_NAME_UNCHANGED) {
			@Override
			public String getMessage(String... args) {
				return "Team " + args[0] + "'s name has not been changed";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_MOVEPLAYER_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to move a player to another team";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_MOVEPLAYER_MOVED) {
			@Override
			public String getMessage(String... args) {
				return args[0] + " moved from " + args[1] + " to " + args[2];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_MOVEPLAYER_PLAYER_NOT_IN_TEAM) {
			@Override
			public String getMessage(String... args) {
				return "Cannot move player " + args[0] + ", player is not in a team";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_RANDOMTEAM_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to dispatch players randomly in teams";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_RANDOMTEAM_DISPATCHED) {
			@Override
			public String getMessage(String... args) {
				return "Random teams created :\n" + args[0];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_RANDOMTEAM_BAD_MAX_PLAYER_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Bad format for max player per team, it should be an integer";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_RANDOMTEAM_MAX_PLAYER_NEGATIVE) {
			@Override
			public String getMessage(String... args) {
				return "The max player per team should be strictly positive";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_RANDOMTEAM_NOT_ENOUGH_TEAMS) {
			@Override
			public String getMessage(String... args) {
				return "There is not enough teams";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_RANDOMTEAM_NOT_ENOUGH_PLAYERS) {
			@Override
			public String getMessage(String... args) {
				return "There is not enough players";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_RANDOMTEAM_ON_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "[Max player per team]";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_REMOVEPLAYER_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to remove a player from a team";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_REMOVEPLAYER_NO_PLAYER_REMOVED) {
			@Override
			public String getMessage(String... args) {
				return "No player removed";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_REMOVEPLAYER_ONE_PLAYER_REMOVED) {
			@Override
			public String getMessage(String... args) {
				return "Player " + args[0] + " has been removed from its team";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_REMOVEPLAYER_PLAYERS_REMOVED) {
			@Override
			public String getMessage(String... args) {
				return "Players " + args[0] + " have been removed from their team";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_REMOVEPLAYER_PLAYER_NOT_IN_TEAM) {
			@Override
			public String getMessage(String... args) {
				return "Cannot remove " + args[0] + " from its team, this player is not in a team";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_REMOVETEAM_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to remove a team from a game style";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_REMOVETEAM_NO_TEAM_REMOVED) {
			@Override
			public String getMessage(String... args) {
				return "No team removed";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_REMOVETEAM_ONE_TEAM_REMOVED) {
			@Override
			public String getMessage(String... args) {
				return "Team " + args[0] + " has been removed";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_REMOVETEAM_TEAMS_REMOVED) {
			@Override
			public String getMessage(String... args) {
				return "Teams " + args[0] + " have been removed";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_REMOVETEAM_ALL_TEAMS_REMOVED) {
			@Override
			public String getMessage(String... args) {
				return "All teams have been removed";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.HUNGER_GAME_EDITION_CONFIGURATION_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to configure an hunger game style";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.AS_CURRENT_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to set the current hunger game style as the current style";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.AS_CURRENT_HUNGER_GAME_NOT_EXISTING_STYLE) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set the hunger game style " + args[0] + " as the current style, style does not exist";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.BORDER_CENTER_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to set the center of the world’s border";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BORDER_CENTER_HUNGER_GAME_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Border center defined in : " + args[0];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BORDER_CENTER_HUNGER_GAME_MISSING_COORDINATES) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set the border center, need coordinates <X> <Z>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.CURRENT_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to know the current hunger game style's characteristics";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.CURRENT_HUNGER_GAME_MESSAGE) {
			@Override
			public String getMessage(String... args) {
				return "Current hunger game style :\n" + args[0];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.DELETE_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to delete an hunger game style";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.DELETE_HUNGER_GAME_MESSAGE) {
			@Override
			public String getMessage(String... args) {
				return "Hunger game style " + args[0] + " has been deleted";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.FINAL_BORDER_DIAMETER_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to set the final border diameter of the world’s border";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.FINAL_BORDER_DIAMETER_HUNGER_GAME_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Final border diameter defined as " + args[0] + " blocks";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.FINAL_BORDER_NEGATIVE_DIAMETER) {
			@Override
			public String getMessage(String... args) {
				return "The final border diameter should be strictly positive";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.FINAL_BORDER_DIAMETER_HUNGER_GAME_MISSING_DIAMETER) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set the final border diameter, need the diameter";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.FINAL_BORDER_DIAMETER_HUNGER_GAME_BAD_DIAMETER_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Bad format for the final diameter, it should be an integer";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.FINAL_BORDER_DIAMETER_HUNGER_GAME_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<final diameter>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.FRACTION_TIME_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to set the time after which players will respawn in spectator mode";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.FRACTION_TIME_HUNGER_GAME_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Player will respawn in spectator mode after " + args[0] + "h " + args[1] + "m " + args[2] + "s of play";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.FRACTION_TIME_HUNGER_GAME_MISSING_TIME) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set the fraction time, need the time";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.GAME_TIME_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Game time defined : " + args[0] + "h " + args[1] + "m " + args[2] + "s";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.GAME_TIME_MISSING_TIME) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set the game time, need the time";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.GAME_TIME_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to set the time after which the world border move from its initial diameter to its final diameter";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.INITIAL_BORDER_DIAMETER_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to set the initial border diameter of the world’s border";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.INITIAL_BORDER_DIAMETER_HUNGER_GAME_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Initial border diameter defined as " + args[0] + " blocks";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.INITIAL_BORDER_NEGATIVE_DIAMETER) {
			@Override
			public String getMessage(String... args) {
				return "The initial border diameter should be strictly positive";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.INITIAL_BORDER_DIAMETER_HUNGER_GAME_MISSING_DIAMETER) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set the initial border diameter, need the diameter";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.INITIAL_BORDER_DIAMETER_HUNGER_GAME_BAD_DIAMETER_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Bad format for the initial diameter, it should be an integer";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.INITIAL_BORDER_DIAMETER_HUNGER_GAME_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<initial diameter>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.LIST_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to display all existing hunger game style(s)";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_HUNGER_GAME_SIZE_EQUALS_0) {
			@Override
			public String getMessage(String... args) {
				return "No existing hunger game style";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_HUNGER_GAME_SIZE_EQUALS_1) {
			@Override
			public String getMessage(String... args) {
				return "One existing hunger game style :\n" + args[0];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_HUNGER_GAME_SIZE_GREATER_THAN_0) {
			@Override
			public String getMessage(String... args) {
				return "List of existing hunger game styles :\n" + args[0];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.LOAD_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to load an hunger game style";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LOAD_HUNGER_GAME_STYLE_NO_TEAM_CREATED_LOADED) {
			@Override
			public String getMessage(String... args) {
				return "Hunger game style " + args[0] + " loaded\nNo team created";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LOAD_HUNGER_GAME_STYLE_ONE_TEAM_CREATED_LOADED) {
			@Override
			public String getMessage(String... args) {
				return "Hunger game style " + args[0] + " loaded\nTeam " + args[1] + " created";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LOAD_HUNGER_GAME_STYLE_TEAMS_CREATED_LOADED) {
			@Override
			public String getMessage(String... args) {
				return "Hunger game style " + args[0] + " loaded\nTeams created : " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LOAD_HUNGER_GAME_MISSING_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Cannot load an hunger game style, need the name";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.NEW_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to create a new hunger game style";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_HUNGER_GAME_CREATED) {
			@Override
			public String getMessage(String... args) {
				return "New hunger game style " + args[0] + " created";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_HUNGER_GAME_ALREADY_EXISTING) {
			@Override
			public String getMessage(String... args) {
				return "The hunger game style " + args[0] + " already exist";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_HUNGER_GAME_MISSING_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Cannot create a new hunger game style, need the name";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.PVP_TIME_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to set the time after which pvp is enabled";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PVP_TIME_HUNGER_GAME_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Pvp is enabled after " + args[0] + "h " + args[1] + "m " + args[2] + "s of play";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PVP_TIME_HUNGER_GAME_MISSING_TIME) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set the pvp time, need the time";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to rename the current hunger game style";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_HUNGER_GAME_RENAMED) {
			@Override
			public String getMessage(String... args) {
				return "Hunger game style " + args[0] + " renamed as " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_HUNGER_GAME_ALREADY_EXISTING) {
			@Override
			public String getMessage(String... args) {
				return "Cannot rename the hunger game style " + args[0] + " as " + args[1] + ", style already exist";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_HUNGER_GAME_MISSING_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Cannot rename the hunger game style " + args[0] + ", need the name";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.RESET_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to reset hunger game style's characteristics";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RESET_HUNGER_GAME_MESSAGE) {
			@Override
			public String getMessage(String... args) {
				return "The characteristics of the hunger game style " + args[0] + " have been reset";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.SAVE_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to save the current hunger game style";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SAVE_HUNGER_GAME_SAVED) {
			@Override
			public String getMessage(String... args) {
				return "Hunger game style " + args[0] + " saved";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.SPEED_BORDER_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to set the border’s speed";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SPEED_BORDER_HUNGER_GAME_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "The border’s speed defined as " + args[0] + " block/s";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SPEED_BORDER_HUNGER_GAME_LESS_THAN_1) {
			@Override
			public String getMessage(String... args) {
				return "The border’s speed must be equals or greater than 1 block/s";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SPEED_BORDER_HUNGER_GAME_MISSING_SPEED) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set the border's speed, need the speed";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SPEED_BORDER_HUNGER_GAME_BAD_SPEED_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "The speed must be a double value (example : 1.5)";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SPEED_BORDER_HUNGER_GAME_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<blocks per seconds>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.WARNING_TIME_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "To warn players who are in the Nether / End to return to the Overworld before the border move";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.WARNING_TIME_HUNGER_GAME_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Players will be warned " + args[0] + "h " + args[1] + "m " + args[2] + "s before moving border";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.WARNING_TIME_HUNGER_GAME_MISSING_TIME) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set the warning time, need the time";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.FRACTION_TIME_LESS_THAN_GAME_TIME) {
			@Override
			public String getMessage(String... args) {
				return "The fraction time must be less than the game time";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_DEATH_MATCH) {
			@Override
			public String getMessage(String... args) {
				return "Team deatch match";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PVP_ENABLED) {
			@Override
			public String getMessage(String... args) {
				return "PVP enabled";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NO_MORE_RESURRECTION) {
			@Override
			public String getMessage(String... args) {
				return "No more resurrection";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.MOVING_BORDER) {
			@Override
			public String getMessage(String... args) {
				return "Moving border";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PLAYER_MUST_GO_BACK_TO_THE_OVERWORLD) {
			@Override
			public String getMessage(String... args) {
				return "Go back to the overworld or you will die in " + args[0] + "h " + args[1] + "m " + args[2] + "s";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PLAYER_MUST_STAY_IN_THE_OVERWORLD) {
			@Override
			public String getMessage(String... args) {
				return "You cannot go into the " + args[0];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.BLOCKEDEX_EDITION_CONFIGURATION_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to configure a blockedex game style";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.AS_CURRENT_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to set the current blockedex game style as the current style";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.AS_CURRENT_BLOCKEDEX_GAME_NOT_EXISTING_STYLE) {
			@Override
			public String getMessage(String... args) {
				return "Cannot load blockedex game style, style does not exist";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.BASE_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to set bases of a blockedex game style";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BASE_BLOCKEDEX_GAME_DOES_NOT_SUPPORT_TEAM) {
			@Override
			public String getMessage(String... args) {
				return "Base does not support all team (number or color)";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BASE_BLOCKEDEX_GAME_MISSING_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set the base, need the name";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.BASE_EAST_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to set the base at the east of the spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BASE_EAST_BLOCKEDEX_GAME_SETTED) {
			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " defined as the east base";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.BASE_NORTH_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to set the base at the north of the spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BASE_NORTH_BLOCKEDEX_GAME_SETTED) {
			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " defined as the north base";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.BASE_SOUTH_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to set the base at the south of the spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BASE_SOUTH_BLOCKEDEX_GAME_SETTED) {
			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " defined as the south base";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.BASE_WEST_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to set the base at the west of the spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BASE_WEST_BLOCKEDEX_GAME_SETTED) {
			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " defined as the west base";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.BASE_DISTANCE_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to set the distance between each base’s center and spawn’s center";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BASE_DISTANCE_BLOCKEDEX_GAME_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Base - spawn distance defined as " + args[0] + " blocks";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BASE_DISTANCE_BLOCKEDEX_GAME_NEGATIVE_DISTANCE) {
			@Override
			public String getMessage(String... args) {
				return "The distance should be strictly positive";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BASE_DISTANCE_BLOCKEDEX_GAME_MISSING_DISTANCE) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set the distance, need the distance";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BASE_DISTANCE_BLOCKEDEX_GAME_BAD_DISTANCE_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set the distance, the distance should be an integer";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BASE_DISTANCE_BLOCKEDEX_GAME_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<distance>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.CURRENT_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to know the current blockedex game style's characteristics";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.CURRENT_BLOCKEDEX_GAME_MESSAGE) {
			@Override
			public String getMessage(String... args) {
				return "Current blockedex game style :\n" + args[0];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.DELETE_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to delete a blockedex game style";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.DELETE_BLOCKEDEX_GAME_MESSAGE) {
			@Override
			public String getMessage(String... args) {
				return "Blockedex style " + args[0] + " has been deleted";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.PLAYER_RESPAWN_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to define the diameter of respawn area";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PLAYER_RESPAWN_BLOCKEDEX_GAME_NEGATIVE_DIAMETER) {
			@Override
			public String getMessage(String... args) {
				return "The respawn area's diameter should be strictly positive";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PLAYER_RESPAWN_BLOCKEDEX_GAME_DIAMETER_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Player will respawn in an area of " + args[0] + "x" + args[0] + " blocks";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PLAYER_RESPAWN_BLOCKEDEX_GAME_BAD_DIAMETER_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set the players respawn area's diameter, the diameter should be an integer";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PLAYER_RESPAWN_BLOCKEDEX_GAME_MISSING_DIAMETER) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set the players respawn area's diameter, need the diameter";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PLAYER_RESPAWN_BLOCKEDEX_GAME_ON_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<respawn area diameter>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.GAME_TIME_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to set the time after which the game stops";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.LIST_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to display all existing blockedex game style(s)";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_BLOCKEDEX_GAME_SIZE_EQUALS_0) {
			@Override
			public String getMessage(String... args) {
				return "No existing blockedex game style";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_BLOCKEDEX_GAME_SIZE_EQUALS_1) {
			@Override
			public String getMessage(String... args) {
				return "One existing blockedex game style :\n" + args[0];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_BLOCKEDEX_GAME_SIZE_GREATER_THAN_0) {
			@Override
			public String getMessage(String... args) {
				return "List of existing blockedex game styles :\n" + args[0];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.LOAD_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to load a blockedex game style";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LOAD_BLOCKEDEX_GAME_STYLE_NO_TEAM_CREATED_LOADED) {
			@Override
			public String getMessage(String... args) {
				return "Blockedex game style " + args[0] + " loaded\nNo team created";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LOAD_BLOCKEDEX_GAME_STYLE_ONE_TEAM_CREATED_LOADED) {
			@Override
			public String getMessage(String... args) {
				return "Blockedex game style " + args[0] + " loaded\nTeam " + args[1] + " created";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LOAD_BLOCKEDEX_GAME_STYLE_TEAMS_CREATED_LOADED) {
			@Override
			public String getMessage(String... args) {
				return "Blockedex game style " + args[0] + " loaded\nTeam created : " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LOAD_BLOCKEDEX_GAME_MISSING_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Cannot load blockedex game style, need the name";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.NEW_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to create a new blockedex game style";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_BLOCKEDEX_GAME_CREATED) {
			@Override
			public String getMessage(String... args) {
				return "New blockedex game style " + args[0] + " created";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_BLOCKEDEX_GAME_ALREADY_EXISTING) {
			@Override
			public String getMessage(String... args) {
				return "The blockedex game style " + args[0] + " already exist";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_BLOCKEDEX_GAME_MISSING_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Cannot create a new blockedex game style, need the name";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_DIE_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to define a zone around the player's death location";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_DIE_BLOCKEDEX_GAME_NEGATIVE_DISTANCE) {
			@Override
			public String getMessage(String... args) {
				return "The radius should be positive";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_DIE_BLOCKEDEX_GAME_RADIUS_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "The zone around the player's death location has a radius of " + args[0] + " blocks";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_DIE_BLOCKEDEX_GAME_BAD_DISTANCE_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set the radius, the radius should be an integer";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_DIE_BLOCKEDEX_GAME_MISSING_DISTANCE) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set the radius, need the radius";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_DIE_BLOCKEDEX_GAME_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<radius>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_KILL_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to define a zone around the player that killed another player";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_KILL_BLOCKEDEX_GAME_NEGATIVE_DISTANCE) {
			@Override
			public String getMessage(String... args) {
				return "The radius should be positive";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_KILL_BLOCKEDEX_GAME_RADIUS_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "The zone around the player that killed another player has a radius of " + args[0] + " blocks";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_KILL_BLOCKEDEX_GAME_BAD_DISTANCE_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set the radius, the radius should be an integer";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_KILL_BLOCKEDEX_GAME_MISSING_DISTANCE) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set the radius, need the radius";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_KILL_BLOCKEDEX_GAME_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<radius>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to change the name of the current blockedex game style";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_BLOCKEDEX_GAME_RENAMED) {
			@Override
			public String getMessage(String... args) {
				return "Blockedex game style " + args[0] + " renamed as " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_BLOCKEDEX_GAME_ALREADY_EXISTING) {
			@Override
			public String getMessage(String... args) {
				return "Cannot rename the blockedex game style " + args[0] + " as " + args[1] + ", style already exist";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_BLOCKEDEX_GAME_MISSING_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Cannot rename the blockedex game style " + args[0] + ", need the name";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.RESET_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to reset blockedex style's characteristics";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RESET_BLOCKEDEX_GAME_MESSAGE) {
			@Override
			public String getMessage(String... args) {
				return "The characteristics of the blockedex game style " + args[0] + " have been reset";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.SAVE_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to save the current blockedex game style";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SAVE_BLOCKEDEX_GAME_SAVED) {
			@Override
			public String getMessage(String... args) {
				return "Blockedex game style " + args[0] + " saved";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.STEP_HEALTH_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "to define the step when player's max health should be increased or decreased";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.STEP_HEALTH_BLOCKEDEX_GAME_NEGATIVE_STEP) {
			@Override
			public String getMessage(String... args) {
				return "The step must be strictly positive";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.STEP_HEALTH_BLOCKEDEX_GAME_STEP_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Players' health will be increased/decreased by " + args[0] + " half hearts";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.STEP_HEALTH_BLOCKEDEX_GAME_BAD_STEP_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set the player's health step, it should be a double";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.STEP_HEALTH_BLOCKEDEX_GAME_MISSING_STEP) {
			@Override
			public String getMessage(String... args) {
				return "Cannot set the step on player's health, need the step";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.STEP_HEALTH_BLOCKEDEX_GAME_ON_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<step>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.BAD_BASES_CONFIGURATION) {
			@Override
			public String getMessage(String... args) {
				return "One or more bases (north, south, west, east) are not defined or not available compared to registered teams";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.CHEST_IS_RESTRICTED) {
			@Override
			public String getMessage(String... args) {
				return "This chest is reserved for team " + args[0] + " you are in team " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ELIMINATED) {
			@Override
			public String getMessage(String... args) {
				return "Team " + args[0] + " eliminated ";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.CANNOT_DROP_ITEM_ITEM_FORBIDDEN) {
			@Override
			public String getMessage(String... args) {
				return "This item is not recognized";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.CANNOT_DROP_ITEM_ITEM_ALREADY_DROPPED) {
			@Override
			public String getMessage(String... args) {
				return "This item has already been dropped";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.CANNOT_GET_ITEM_BACK) {
			@Override
			public String getMessage(String... args) {
				return "You cannot get this item back";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.PLAYERS_NOT_IN_TEAM) {
			@Override
			public String getMessage(String... args) {
				return "They are players that are not in team";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NO_GAME_STYLE_DEFINED_AS_CURRENT) {
			@Override
			public String getMessage(String... args) {
				return "No game to be launch";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.GAME_SUSPENDED) {
			@Override
			public String getMessage(String... args) {
				return "Game suspended";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.GAME_RESUMED) {
			@Override
			public String getMessage(String... args) {
				return "Game resumed";
			}
		});
	}
}
