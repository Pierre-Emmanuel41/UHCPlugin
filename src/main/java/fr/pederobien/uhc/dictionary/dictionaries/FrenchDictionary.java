package fr.pederobien.uhc.dictionary.dictionaries;

import java.util.Locale;

public class FrenchDictionary extends AbstractDictionary {

	public FrenchDictionary() {
		super(Locale.FRANCE, Locale.FRENCH, Locale.CANADA_FRENCH);

		registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_CURRENT_GAME_TIME) {
			@Override
			public String getMessage(String... args) {
				return "Temps : ";
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
				return "Bordure : ";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_BLOCKEDEX_GAME_NORTH_BASE) {
			@Override
			public String getMessage(String... args) {
				return "Nord : ";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_BLOCKEDEX_GAME_SOUTH_BASE) {
			@Override
			public String getMessage(String... args) {
				return "Sud : ";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_BLOCKEDEX_GAME_WEST_BASE) {
			@Override
			public String getMessage(String... args) {
				return "Ouest : ";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_BLOCKEDEX_GAME_EAST_BASE) {
			@Override
			public String getMessage(String... args) {
				return "Est : ";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.DELETE_ON_CANNOT_DELETE) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de supprimer " + args[0];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.HELP_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour afficher toutes les fonctionnalités";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_NAME_MUST_NOT_START_BY_DEFAULT) {
			@Override
			public String getMessage(String... args) {
				return args[0] + " ne doit pas commencer par 'default' (insensible à la casse)";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_NAME_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<nom>";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<nouveau nom>";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BAD_COORDINATES_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Mauvais format des coordonnées, elles doivent être des entiers";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.COMMAND_NOT_AVAILABLE) {
			@Override
			public String getMessage(String... args) {
				return "La commande " + args[0] + " non disponible";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.CANNOT_RUN_COMMAND) {
			@Override
			public String getMessage(String... args) {
				return "Impossible d'exécuter la commande " + args[0] + ", des arguments sont manquants";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.ARGUMENT_NOT_VALID) {
			@Override
			public String getMessage(String... args) {
				return "L'argument " + args[0] + " n'est pas valide";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.COMMAND_NOT_AVAILABLE_YET) {
			@Override
			public String getMessage(String... args) {
				return "La commande " + args[0] + " n'est pas encore disponible";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BAD_TIME_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Mauvais format du temps, il doit respecter le schéma hh:mm:ss";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.CENTER_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour définir le centre";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.CENTER_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Centre défini en " + args[0] + " " + args[1] + " " + args[2];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.CENTER_COORDINATES_ARE_MISSING) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir les coordonnées du centre, il manque <X> ou <Y> ou <Z>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.DIMENSIONS_MISSING_DIMENSIONS) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir les dimensions, il manque la <largeur> ou la <hauteur> ou la <profondeur>";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.DIMENSIONS_BAD_DIMENSIONS_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Mauvais format des dimensions, elles doivent être des entiers";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.DIMENSIONS_WITDH_HEIGHT_DEPTH_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<largeur> <hauteur> <profondeur>";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.DIMENSIONS_HEIGHT_DEPTH_TAB_COMPLETE) {

			@Override
			public String getMessage(String... args) {
				return "<hauteur> <profondeur>";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.DIMENSIONS_DEPTH_TAB_COMPLETE) {

			@Override
			public String getMessage(String... args) {
				return "<profondeur>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.BASE_EDITION_CONFIGURATION_EXPLANATION) {

			@Override
			public String getMessage(String... args) {
				return "pour configurer une base";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.CURRENT_BASE_EXPLANATION) {

			@Override
			public String getMessage(String... args) {
				return "pour connaître le nom de la base courante";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.CURRENT_BASE_MESSAGE) {

			@Override
			public String getMessage(String... args) {
				return "Base courante :\n" + args[0];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.DELETE_BASE_EXPLANATION) {

			@Override
			public String getMessage(String... args) {
				return "pour supprimer une base";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.DELETE_BASE_DELETED) {

			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " supprimée";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.EXTRACT_BASE_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour extraire du monde les blocs de la base";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.EXTRACT_BASE_ONE_CHEST_EXTRACTED) {
			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " extraite\nUn coffre détecté pour la couleur d'équipe : " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.EXTRACT_BASE_CHESTS_EXTRACTED) {
			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " extraites" + "\nDes coffres détectés pour les couleurs d'équipes : " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.EXTRACT_BASE_MAGENTA_WOOL_IS_FORBIDDEN) {
			@Override
			public String getMessage(String... args) {
				return "L'utilisation de la laine magenta est interdite, utilisez la laine rose ou violette";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.EXTRACT_BASE_BROWN_WOOL_HAS_NO_EQUIVALENT) {
			@Override
			public String getMessage(String... args) {
				return "La laine marron n'a pas d'équivalent dans les couleurs d'équipe";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.EXTRACT_BASE_MATERIAL_UNDER_CHEST_IS_NOT_WOOL) {
			@Override
			public String getMessage(String... args) {
				return "Le block en dessous d'un coffre n'est pas de laine";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.DIMENSIONS_BASE_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour extraire du monde les blocs de la base";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.DIMENSIONS_BASE_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Les dimensions de la base " + args[0] + " sont " + args[1] + " " + args[2] + " " + args[3];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_BASE_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour charger une base dans le monde";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_BASE_NO_TEAM_SUPPORTED) {
			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " chargée en " + args[1] + " " + args[2] + " " + args[3] + "\nAucune couleur d'équipe supportée";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_BASE_ONE_TEAM_SUPPORTED) {
			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " chargée en " + args[1] + " " + args[2] + " " + args[3] + "\nUne couleur d'équipe supportée : " + args[4];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_BASE_TEAMS_SUPPORTED) {
			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " chargée en " + args[1] + " " + args[2] + " " + args[3] + "\nCouleurs d’équipe supportées : " + args[4];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_BASE_NOT_EXISTING) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de charger la base " + args[0] + ", la base n’existe pas";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_BASE_MISSING_COORDINATES) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de charger la base " + args[0] + ", il manque les coordonnées du centre <X> ou <Y> ou <Z>";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_BASE_MISSING_NAME_AND_COORDINATES) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de charger la base " + args[0] + " il manque le nom et les coordonnées <X> ou <Y> ou <Z> du centre";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.LIST_BASE_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour afficher le nom des bases existantes";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_BASE_SIZE_EQUALS_0) {
			@Override
			public String getMessage(String... args) {
				return "Il n’existe aucune base";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_BASE_SIZE_EQUALS_1) {
			@Override
			public String getMessage(String... args) {
				return "Il existe une base : " + args[0];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_BASE_SIZE_GREATER_THAN_0) {
			@Override
			public String getMessage(String... args) {
				return "Liste des bases existantes :\n" + args[0];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.NEW_BASE_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour créer une nouvelle base";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_BASE_CREATED) {
			@Override
			public String getMessage(String... args) {
				return "Nouvelle base " + args[0] + " créée";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_BASE_ALREADY_EXISTING) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de créer une nouvelle base, la base " + args[0] + " existe déjà";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_BASE_MISSING_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de créer une nouvelle base, il manque le nom";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.REMOVE_BASE_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour enlever une base du monde";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.REMOVE_BASE_REMOVED) {
			@Override
			public String getMessage(String... args) {
				return "La base " + args[0] + " a été enlevée du monde";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_BASE_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour renommer une base";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_BASE_RENAMED) {
			@Override
			public String getMessage(String... args) {
				return "la base " + args[0] + " a été renommée en " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_BASE_ALREADY_EXISTING) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de renommer la base " + args[0] + " en " + args[1] + ", une base du même nom existe déjà";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_BASE_MISSING_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de renommer la base " + args[0] + ", il manque le nom";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.RESET_BASE_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour réinitialiser les caractéristiques d'une base";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SAVE_BASE_SAVED) {
			@Override
			public String getMessage(String... args) {
				return "Les caractéristiques de la base " + args[0] + " ont été réinitialisées";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.SAVE_BASE_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour sauvegarder une base";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SAVE_BASE_SAVED) {
			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " sauvegardée";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.SPAWN_EDITION_CONFIGURATION_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour configurer un spawn";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.CURRENT_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour connaître le nom du spawn courant";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.CURRENT_SPAWN_MESSAGE) {
			@Override
			public String getMessage(String... args) {
				return "Spawn courant :\n" + args[0];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.DELETE_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour supprimer un spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.DELETE_SPAWN_DELETED) {
			@Override
			public String getMessage(String... args) {
				return "Spawn " + args[0] + " supprimé";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.DIMENSIONS_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour définir les dimensions du spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.DIMENSIONS_SPAWN_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Les dimensions du spawn " + args[0] + " sont " + args[1] + " " + args[2] + " " + args[3];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.EXTRACT_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour extraire du monde les blocs du spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.EXTRACT_SPAWN_EXTRACTED) {
			@Override
			public String getMessage(String... args) {
				return "Spawn " + args[0] + " extrait";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour charger un spawn dans le monde";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_SPAWN_LAUNCHED) {
			@Override
			public String getMessage(String... args) {
				return "Spawn " + args[0] + " chargé en " + args[1] + " " + args[2] + " " + args[3];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_SPAWN_NOT_EXISTING) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de charger le spawn " + args[0] + ", le spawn n’existe pas";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_SPAWN_MISSING_COORDINATES) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de charger le spawn " + args[0] + ", il manque les coordonnées <X> ou <Y> ou <Z> du centre";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LAUNCH_SPAWN_MISSING_NAME_AND_COORDINATES) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de charger le spawn " + args[0] + " il manque le nom et les coordonnées <X> ou <Y> ou <Z> du centre";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.LIST_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour afficher le nom des spawns existants";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_SPAWN_SIZE_EQUALS_0) {
			@Override
			public String getMessage(String... args) {
				return "Il n’existe aucun spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_SPAWN_SIZE_EQUALS_1) {
			@Override
			public String getMessage(String... args) {
				return "Il existe un spawn : " + args[0];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_SPAWN_SIZE_GREATER_THAN_0) {
			@Override
			public String getMessage(String... args) {
				return "Liste des spawns existants :\n" + args[0];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.NEW_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour créer un nouveau spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_SPAWN_CREATED) {
			@Override
			public String getMessage(String... args) {
				return "Nouveau spawn " + args[0] + " créé";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_SPAWN_ALREADY_EXISTING) {
			@Override
			public String getMessage(String... args) {
				return "Un spawn " + args[0] + " existe déjà";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_SPAWN_MISSING_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de créer un nouveau spawn, il manque le nom";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.PLAYER_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour définir le spawn des joueurs lorsque le spawn est chargé dans le monde";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PLAYER_SPAWN_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Les joueurs apparaîtront en " + args[0] + " " + args[1] + " " + args[2];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PLAYER_SPAWN_MISSING_COORDINATES) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir les coordonnées du spawn des joueurs, il manque <X> ou <Y> ou <Z>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.RANDOM_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour charger aléatoirement un spawn dans le monde";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RANDOM_SPAWN_LAUNCHED) {
			@Override
			public String getMessage(String... args) {
				return "Le spawn " + args[0] + " est chargé en " + args[1] + " " + args[2] + " " + args[3];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RANDOM_SPAWN_CANNOT_BE_LAUNCHED) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de charger le spawn " + args[0] + ", le spawn n'existe pas";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RANDOM_SPAWN_MISSING_COORDINATES) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de charger un spawn, il manque les coordonnées " + "<X> ou <Y> ou <Z> du centre";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.REMOVE_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour enlever le spawn du monde";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.REMOVE_SPAWN_REMOVED) {
			@Override
			public String getMessage(String... args) {
				return "Spawn " + args[0] + " a été enlevé du monde";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour renommer le spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_SPAWN_RENAMED) {
			@Override
			public String getMessage(String... args) {
				return "Spawn " + args[0] + " renommée : " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_SPAWN_ALREADY_EXISTING) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de renommer le spawn " + args[0] + " en " + args[1] + ", un spawn du même nom existe déjà";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_SPAWN_MISSING_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de renommer le spawn " + args[0] + ", il manque le nom";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.RESET_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour réinitialiser les caractéristiques d'un spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RESET_SPAWN_MESSAGE) {
			@Override
			public String getMessage(String... args) {
				return "Les caractéristiques du spawn " + args[0] + " ont été réinitialisées";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.SAVE_SPAWN_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour sauvegarder le spawn courant";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SAVE_SPAWN_SAVED) {
			@Override
			public String getMessage(String... args) {
				return "Spawn " + args[0] + " sauvegardé";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.AS_CURRENT_STYLE_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Style " + args[0] + " défini en tant que style courant";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.GAME_TIME_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Game time défini : " + args[0] + "h " + args[1] + "m " + args[2] + "s";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.GAME_TIME_MISSING_TIME) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir le game time, il manque le temps";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.LOAD_CANNOT_LOAD) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de charger le style " + args[0] + ", le style n'existe pas";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_REFRESH_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour définir la fréquence (tics serveur) de rafraichissement du scoreboard de chaque joueur";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_REFRESH_NEGATIVE_TIC_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Le nombre de tics doit être positive";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_REFRESH_ONE_TIC_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Le scoreboard est rafraichit à chaque tic serveur";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_REFRESH_TICS_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Le scoreboard est rafraichit tous les " + args[0] + " tics";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_REFRESH_MISSING_TICS) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir la fréquence de rafraichissement, il manque la fréquence";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_REFRESH_BAD_TICS_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Mauvais format de la fréquence, elle doit être un entier";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SCOREBOARD_REFRESH_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<nombre de tic>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour gérer les équipes d'un style de jeu";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_BAD_TEAM) {
			@Override
			public String getMessage(String... args) {
				return args[0] + " ne correspond pas à une équipe";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_BAD_PLAYER) {
			@Override
			public String getMessage(String... args) {
				return args[0] + " ne correspond pas à un joueur";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_BAD_COLOR) {
			@Override
			public String getMessage(String... args) {
				return args[0] + " ne correspond pas à une couleur";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ALREADY_EXISTING_TEAM_COLOR) {
			@Override
			public String getMessage(String... args) {
				return "La couleur " + args[0] + " est déjà utilisée";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ALREADY_EXISTING_TEAM_NAME) {
			@Override
			public String getMessage(String... args) {
				return "L'équipe " + args[0] + " existe déjà";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_FORBIDDEN_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Le nom " + args[0] + " est interdit pour une équipe";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_PLAYER_ALREADY_IN_TEAM) {
			@Override
			public String getMessage(String... args) {
				return "Le joueur " + args[0] + " est déjà dans une équipe (" + args[1] + ")";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ADDPLAYER_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour ajouter un joueur à une équipe";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ADDPLAYER_NO_PLAYER_ADDED) {
			@Override
			public String getMessage(String... args) {
				return "Aucun joueur ajouté";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ADDPLAYER_ONE_PLAYER_ADDED) {
			@Override
			public String getMessage(String... args) {
				return "Joueur " + args[0] + " a été ajouté à l'équipe " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ADDPLAYER_PLAYERS_ADDED) {
			@Override
			public String getMessage(String... args) {
				return "Joueurs " + args[0] + " ajoutés à l'équipe " + args[1];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ADDTEAM_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour ajouter une équipe à un style de jeu";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ADDTEAM_TEAM_NO_PLAYER_ADDED) {
			@Override
			public String getMessage(String... args) {
				return "Equipe " + args[0] + " créée, aucun joueur ajouté";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ADDTEAM_TEAM_ONE_PLAYER_ADDED) {
			@Override
			public String getMessage(String... args) {
				return "Equipe " + args[0] + " créée, un joueur ajouté : " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ADDTEAM_TEAM_PLAYERS_ADDED) {
			@Override
			public String getMessage(String... args) {
				return "Equipe " + args[0] + " créée, joueurs ajoutés : " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ADDTEAM_MISSING_ARGUMENTS) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de créer une nouvelle équipe, des arguments sont manquants";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_LIST_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour afficher le nom des équipes d'un style de jeu";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_LIST_NO_EXISTING_TEAM) {
			@Override
			public String getMessage(String... args) {
				return "Il n'existe aucune équipe pour le style de jeu " + args[0];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_LIST_ONE_EXISTING_TEAM) {
			@Override
			public String getMessage(String... args) {
				return "Il existe une équipe pour le style " + args[0] + ":\n" + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_LIST_EXISTING_TEAMS) {
			@Override
			public String getMessage(String... args) {
				return "Liste des équipes pour le style " + args[0] + ":\n" + args[1];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_MODIFY_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour modifier les caractéristiques d'une équipe";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_MODIFY_COLOR_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour changer la couleur d'une équipe";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_MODIFY_COLOR_MODIFIED) {
			@Override
			public String getMessage(String... args) {
				return "La couleur de l'équipe " + args[0] + " a été mise à jour";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_MODIFY_COLOR_UNCHANGED) {
			@Override
			public String getMessage(String... args) {
				return "La couleur de l'équipe " + args[0] + " n'a pas été changée";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_MODIFY_NAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour modifier le nom d'une équipe";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_MODIFY_NAME_MODIFIED) {
			@Override
			public String getMessage(String... args) {
				return "L'équipe " + args[0] + " a été renommée en " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_MODIFY_NAME_UNCHANGED) {
			@Override
			public String getMessage(String... args) {
				return "Le nom de l'équipe " + args[0] + " n'a pas été changé";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_MOVEPLAYER_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour déplacer un joueur dans une autre équipe";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_MOVEPLAYER_MOVED) {
			@Override
			public String getMessage(String... args) {
				return "Joueur " + args[0] + " a été déplacé dans l'équipe " + args[2] + ", ancienne équipe " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_MOVEPLAYER_PLAYER_NOT_IN_TEAM) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de changer l'équipe du joueur " + args[0] + ", le joueur n'est pas dans une équipe";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_RANDOMTEAM_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour répartir les joueurs dans les équipes";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_RANDOMTEAM_DISPATCHED) {
			@Override
			public String getMessage(String... args) {
				return "Equipes aléatoires créées :\n" + args[0];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_RANDOMTEAM_BAD_MAX_PLAYER_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Mauvais format du nombre maximal de joueurs par équipe, il doit être un entier";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_RANDOMTEAM_MAX_PLAYER_NEGATIVE) {
			@Override
			public String getMessage(String... args) {
				return "Le nombre maximum de joueur par équipe doit être strictement positif";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_RANDOMTEAM_NOT_ENOUGH_TEAMS) {
			@Override
			public String getMessage(String... args) {
				return "Il n'y a pas assez d'équipes";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_RANDOMTEAM_NOT_ENOUGH_PLAYERS) {
			@Override
			public String getMessage(String... args) {
				return "Il n'y a pas assez de joueurs";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_RANDOMTEAM_ON_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "[Max joueurs par équipe]";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_REMOVEPLAYER_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour enlever un joueur d'une équipe";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_REMOVEPLAYER_NO_PLAYER_REMOVED) {
			@Override
			public String getMessage(String... args) {
				return "Aucun joueur n'a été enlevé";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_REMOVEPLAYER_ONE_PLAYER_REMOVED) {
			@Override
			public String getMessage(String... args) {
				return "Le joueur " + args[0] + " a été retiré de son équipe";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_REMOVEPLAYER_PLAYERS_REMOVED) {
			@Override
			public String getMessage(String... args) {
				return "Les joueurs " + args[0] + " ont été retirés de leurs équipes";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_REMOVEPLAYER_PLAYER_NOT_IN_TEAM) {
			@Override
			public String getMessage(String... args) {
				return "Impossible d'enlever " + args[0] + " de son équipe, ce joueur n'appartient à aucune équipe";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_REMOVETEAM_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour enlever une équipe d'un style de jeu";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_REMOVETEAM_NO_TEAM_REMOVED) {
			@Override
			public String getMessage(String... args) {
				return "Aucune équipe n'a été enlevée";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_REMOVETEAM_ONE_TEAM_REMOVED) {
			@Override
			public String getMessage(String... args) {
				return "L'équipe " + args[0] + " a été enlevée";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_REMOVETEAM_TEAMS_REMOVED) {
			@Override
			public String getMessage(String... args) {
				return "Les équipes " + args[0] + " ont été enlevées";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_REMOVETEAM_ALL_TEAMS_REMOVED) {
			@Override
			public String getMessage(String... args) {
				return "Toutes les équipes ont été enlevées";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.HUNGER_GAME_EDITION_CONFIGURATION_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour configurer un style de jeu hunger game";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.AS_CURRENT_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "Pour définir le style hunger game courant comme le style courant";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.AS_CURRENT_HUNGER_GAME_NOT_EXISTING_STYLE) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir le style hunger game " + args[0] + " comme le style courant, ce style n'existe pas";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.BORDER_CENTER_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour définir le centre de la bordure du monde";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BORDER_CENTER_HUNGER_GAME_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Le centre de la bordure se situe en : " + args[0];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BORDER_CENTER_HUNGER_GAME_MISSING_COORDINATES) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir les coordonées du centre, il manque les coordonnées <X> ou <Z>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.CURRENT_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour connaître les caractéristiques du style de jeu hunger game courant";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.CURRENT_HUNGER_GAME_MESSAGE) {
			@Override
			public String getMessage(String... args) {
				return "Style hunger game courant :\n" + args[0];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.DELETE_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour supprimer un style hunger game";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.DELETE_HUNGER_GAME_MESSAGE) {
			@Override
			public String getMessage(String... args) {
				return "Style hunger game " + args[0] + " a été supprimé";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.FINAL_BORDER_DIAMETER_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "Pour définir le diamètre final de la bordure";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.FINAL_BORDER_DIAMETER_HUNGER_GAME_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Diamètre final défini : " + args[0] + " blocks";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.FINAL_BORDER_NEGATIVE_DIAMETER) {
			@Override
			public String getMessage(String... args) {
				return "Le diamètre final de la bordure doit être strictement positif";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.FINAL_BORDER_DIAMETER_HUNGER_GAME_MISSING_DIAMETER) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir le diamètre final de la bordure, il manque le diamètre";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.FINAL_BORDER_DIAMETER_HUNGER_GAME_BAD_DIAMETER_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Mauvais format du diamètre final, il doit être un entier";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.FINAL_BORDER_DIAMETER_HUNGER_GAME_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<diamètre final>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.FRACTION_TIME_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour définir le temps au bout duquel les joueurs réapparaîtront en mode spectateur";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.FRACTION_TIME_HUNGER_GAME_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Les joueurs réapparaîtront en mode spectateur au bout de " + args[0] + "h " + args[1] + "m " + args[2] + "s de jeu";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.FRACTION_TIME_HUNGER_GAME_MISSING_TIME) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir le fraction time, il manque le temps";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.GAME_TIME_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Temps de jeu : " + args[0] + "h " + args[1] + "m " + args[2] + "s";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.GAME_TIME_MISSING_TIME) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir le temps de jeu, il manque le temps";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.GAME_TIME_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour définir le temps à partir duquel la bordure se déplacera de son diamètre initial à son diamètre final";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.INITIAL_BORDER_DIAMETER_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour définir le diamètre initial de la bordure du monde";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.INITIAL_BORDER_DIAMETER_HUNGER_GAME_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Diamètre initial de la bordure défini : " + args[0] + " blocs";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.INITIAL_BORDER_NEGATIVE_DIAMETER) {
			@Override
			public String getMessage(String... args) {
				return "Le diamètre initial doit être strictement positif";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.INITIAL_BORDER_DIAMETER_HUNGER_GAME_MISSING_DIAMETER) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir le diamètre initial, il manque le diamètre";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.INITIAL_BORDER_DIAMETER_HUNGER_GAME_BAD_DIAMETER_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Mauvais format pour le diamètre initial, il doit être un entier";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.INITIAL_BORDER_DIAMETER_HUNGER_GAME_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<diamètre initial>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.LIST_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour afficher le nom des styles hunger game existants";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_HUNGER_GAME_SIZE_EQUALS_0) {
			@Override
			public String getMessage(String... args) {
				return "Il n'existe aucun style de jeu hunger game";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_HUNGER_GAME_SIZE_EQUALS_1) {
			@Override
			public String getMessage(String... args) {
				return "Il existe un style de jeu hunger game :\n" + args[0];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_HUNGER_GAME_SIZE_GREATER_THAN_0) {
			@Override
			public String getMessage(String... args) {
				return "Liste des styles de jeu hunger game existants :\n" + args[0];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.LOAD_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour charger un style de jeu hunger game";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LOAD_HUNGER_GAME_STYLE_NO_TEAM_CREATED_LOADED) {
			@Override
			public String getMessage(String... args) {
				return "Style hunger game " + args[0] + " chargé\nAucune équipe créées";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LOAD_HUNGER_GAME_STYLE_ONE_TEAM_CREATED_LOADED) {
			@Override
			public String getMessage(String... args) {
				return "Style hunger game " + args[0] + " chargé\nUne équipe créée " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LOAD_HUNGER_GAME_STYLE_TEAMS_CREATED_LOADED) {
			@Override
			public String getMessage(String... args) {
				return "Style hunger game " + args[0] + " chargé\nEquipes créées : " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LOAD_HUNGER_GAME_MISSING_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de charger un style hunger game, il manque le nom";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.NEW_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour créer un nouveau style de jeu hunger game";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_HUNGER_GAME_CREATED) {
			@Override
			public String getMessage(String... args) {
				return "Nouveau style hunger game " + args[0] + " créé";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_HUNGER_GAME_ALREADY_EXISTING) {
			@Override
			public String getMessage(String... args) {
				return "Un style hunger game " + args[0] + " existe déjà";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_HUNGER_GAME_MISSING_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de créer un nouveau style hunger game, il manque le nom";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.PVP_TIME_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour définir le temps au bout duquel le pvp est activé";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PVP_TIME_HUNGER_GAME_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Le pvp est activé après " + args[0] + "h " + args[1] + "m " + args[2] + "s de jeu";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PVP_TIME_HUNGER_GAME_MISSING_TIME) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir le pvp time, il manque le temps";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour renommer style hunger game courant";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_HUNGER_GAME_RENAMED) {
			@Override
			public String getMessage(String... args) {
				return "Le style hunger game " + args[0] + " a été renommé en " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_HUNGER_GAME_ALREADY_EXISTING) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de renommer le style hunger game " + args[0] + " en " + args[1] + ", ce style existe déjà";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_HUNGER_GAME_MISSING_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de renommer le style hunger game " + args[0] + ", il manque le nom";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.RESET_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour réinitialiser les caractéristiques d'un style hunger game";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RESET_HUNGER_GAME_MESSAGE) {
			@Override
			public String getMessage(String... args) {
				return "Les caractéristiques du style hunger game " + args[0] + " ont été réinitialisées";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.SAVE_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour sauvegarder le style hunger game courant";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SAVE_HUNGER_GAME_SAVED) {
			@Override
			public String getMessage(String... args) {
				return "Le style hunger game " + args[0] + " a été enregistré";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.SPEED_BORDER_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour définir la vitesse de déplacement de la bordure";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SPEED_BORDER_HUNGER_GAME_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "la vitesse de la bordure est défini à " + args[0] + " bloc/s";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SPEED_BORDER_HUNGER_GAME_LESS_THAN_1) {
			@Override
			public String getMessage(String... args) {
				return "la vitesse de déplacement de la bordure doit être au moins égale à 1 bloc/s";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SPEED_BORDER_HUNGER_GAME_MISSING_SPEED) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir la vitesse de déplacement de la bordure, il manque la vitesse";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SPEED_BORDER_HUNGER_GAME_BAD_SPEED_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "La valeur de la vitesse doit être un double (exemple : 1.5)";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SPEED_BORDER_HUNGER_GAME_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<blocs par seconde>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.WARNING_TIME_HUNGER_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour prévenir les joueurs qui sont dans le Nether / End de retourner à la surface avant le déplacement de la bordure";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.WARNING_TIME_HUNGER_GAME_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Les joueurs seront prévenu " + args[0] + "h " + args[1] + "m " + args[2] + "s avant le déplacement de la bordure";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.WARNING_TIME_HUNGER_GAME_MISSING_TIME) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir le warning time, il manque le temps";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.FRACTION_TIME_LESS_THAN_GAME_TIME) {
			@Override
			public String getMessage(String... args) {
				return "le fraction time doit être inférieur au game time";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_DEATH_MATCH) {
			@Override
			public String getMessage(String... args) {
				return "Match à mort par équipe";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PVP_ENABLED) {
			@Override
			public String getMessage(String... args) {
				return "PVP activé";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NO_MORE_RESURRECTION) {
			@Override
			public String getMessage(String... args) {
				return "Plus de résurrection";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.MOVING_BORDER) {
			@Override
			public String getMessage(String... args) {
				return "Déplacement bordure";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PLAYER_MUST_GO_BACK_TO_THE_OVERWORLD) {
			@Override
			public String getMessage(String... args) {
				return "Retourner à la surface ou vous allez mourrir dans " + args[0] + "h " + args[1] + "m " + args[2] + "s";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PLAYER_MUST_STAY_IN_THE_OVERWORLD) {
			@Override
			public String getMessage(String... args) {
				return "Vous ne pouvez pas entrer dans le " + args[0];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.BLOCKEDEX_EDITION_CONFIGURATION_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour configurer un style de jeu blockedex";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.AS_CURRENT_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour définir le style blockedex courant comme style courant";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.AS_CURRENT_BLOCKEDEX_GAME_NOT_EXISTING_STYLE) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de charger le style " + args[0] + ", ce style n'existe pas";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.BASE_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour définir les bases d'un style de jeu blockedex";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BASE_BLOCKEDEX_GAME_DOES_NOT_SUPPORT_TEAM) {
			@Override
			public String getMessage(String... args) {
				return "La base " + args[0] + " ne supporte pas toutes les équipes (nombre ou couleur)";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BASE_BLOCKEDEX_GAME_MISSING_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir la base, il manque le nom";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.BASE_EAST_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour définir la base située à l'Est du spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BASE_EAST_BLOCKEDEX_GAME_SETTED) {
			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " définie en tant que base de l'Est";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.BASE_NORTH_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour définir la base située au Nord du spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BASE_NORTH_BLOCKEDEX_GAME_SETTED) {
			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " définie en tant que base du Nord";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.BASE_SOUTH_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour définir la base située au Sud du spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BASE_SOUTH_BLOCKEDEX_GAME_SETTED) {
			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " définie en tant que base du Sud";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.BASE_WEST_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour définir la base située à l'Ouest du spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BASE_WEST_BLOCKEDEX_GAME_SETTED) {
			@Override
			public String getMessage(String... args) {
				return "Base " + args[0] + " définie en tant que base de l'Ouest";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.BASE_DISTANCE_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour définir la distance entre le centre de chaque base et le centre du spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BASE_DISTANCE_BLOCKEDEX_GAME_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Chaque base est à une distance de " + args[0] + " blocks du spawn";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BASE_DISTANCE_BLOCKEDEX_GAME_NEGATIVE_DISTANCE) {
			@Override
			public String getMessage(String... args) {
				return "La distance doit être strictement positive";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BASE_DISTANCE_BLOCKEDEX_GAME_MISSING_DISTANCE) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir la distance, il manque la distance";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.BASE_DISTANCE_BLOCKEDEX_GAME_BAD_DISTANCE_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir la distance, elle doit être un entier";
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
				return "pour connaître les caractéristiques du style de jeu blockedex courant";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.CURRENT_BLOCKEDEX_GAME_MESSAGE) {
			@Override
			public String getMessage(String... args) {
				return "Style de jeu blockedex courant :\n" + args[0];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.DELETE_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour supprimer un style de jeu blockedex";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.DELETE_BLOCKEDEX_GAME_MESSAGE) {
			@Override
			public String getMessage(String... args) {
				return "Le style blockedex " + args[0] + " a été supprimé";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.PLAYER_RESPAWN_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour définir le diamètre de la zone de réapparition des joueurs";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PLAYER_RESPAWN_BLOCKEDEX_GAME_NEGATIVE_DIAMETER) {
			@Override
			public String getMessage(String... args) {
				return "Le diamètre de la zone de réapparition doit être strictement positif";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PLAYER_RESPAWN_BLOCKEDEX_GAME_DIAMETER_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "Les joueurs réapparaîtront dans une zone de " + args[0] + "x" + args[0] + " blocs";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PLAYER_RESPAWN_BLOCKEDEX_GAME_BAD_DIAMETER_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir le diamètre de la zone de réapparition, le diamètre doit être un entier";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PLAYER_RESPAWN_BLOCKEDEX_GAME_MISSING_DIAMETER) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir le diamètre de la zone de réapparition, il manque le diamètre";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.PLAYER_RESPAWN_BLOCKEDEX_GAME_ON_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<diamètre de la zone de réapparition>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.GAME_TIME_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour définir le temps au bout duquel la partie s'arrête";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.LIST_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour afficher le nom de tous le(s) style(s) de jeu blockedex existant(s)";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_BLOCKEDEX_GAME_SIZE_EQUALS_0) {
			@Override
			public String getMessage(String... args) {
				return "Il n'existe aucun style de jeu blockedex";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_BLOCKEDEX_GAME_SIZE_EQUALS_1) {
			@Override
			public String getMessage(String... args) {
				return "Il existe un style de jeu blockedex :\n" + args[0];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LIST_BLOCKEDEX_GAME_SIZE_GREATER_THAN_0) {
			@Override
			public String getMessage(String... args) {
				return "Liste des styles de jeu blockedex existants :\n" + args[0];
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.LOAD_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour charger un style de jeu blockedex";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LOAD_BLOCKEDEX_GAME_STYLE_NO_TEAM_CREATED_LOADED) {
			@Override
			public String getMessage(String... args) {
				return "Style de jeu blockedex " + args[0] + " chargé\nAucune équipe créée";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LOAD_BLOCKEDEX_GAME_STYLE_ONE_TEAM_CREATED_LOADED) {
			@Override
			public String getMessage(String... args) {
				return "Style de jeu blockedex " + args[0] + " chargé\nL'équipe " + args[1] + " a été créée";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LOAD_BLOCKEDEX_GAME_STYLE_TEAMS_CREATED_LOADED) {
			@Override
			public String getMessage(String... args) {
				return "Style de jeu blockedex " + args[0] + " chargé\nEquipes créées : " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.LOAD_BLOCKEDEX_GAME_MISSING_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de charger le style de jeu blockedex, il manque le nom";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.NEW_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour créer un nouveau style de jeu blockedex";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_BLOCKEDEX_GAME_CREATED) {
			@Override
			public String getMessage(String... args) {
				return "Nouveau style de jeu blockedex " + args[0] + " créé";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_BLOCKEDEX_GAME_ALREADY_EXISTING) {
			@Override
			public String getMessage(String... args) {
				return "Le style de jeu blockedex " + args[0] + " existe déjà";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NEW_BLOCKEDEX_GAME_MISSING_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de créer un nouveau style de jeu blockedex, il manque le nom";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_DIE_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour définir une zone autour du lieu de la mort d'un joueur";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_DIE_BLOCKEDEX_GAME_NEGATIVE_DISTANCE) {
			@Override
			public String getMessage(String... args) {
				return "Le rayon doit être positif";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_DIE_BLOCKEDEX_GAME_RADIUS_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "La zone autour du lieu de la mort d'un joueur a un rayon de " + args[0] + " blocs";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_DIE_BLOCKEDEX_GAME_BAD_DISTANCE_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir le rayon, il doit être un entier";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_DIE_BLOCKEDEX_GAME_MISSING_DISTANCE) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir le rayon, il manque le rayon";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_DIE_BLOCKEDEX_GAME_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<rayon>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_KILL_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour définir une zone autour du joueur qui a tué un autre joueur";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_KILL_BLOCKEDEX_GAME_NEGATIVE_DISTANCE) {
			@Override
			public String getMessage(String... args) {
				return "Le rayon doit être positif";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_KILL_BLOCKEDEX_GAME_RADIUS_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "La zone autour du joueur qui a tué un autre joueur a un rayon de " + args[0] + " blocs";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_KILL_BLOCKEDEX_GAME_BAD_DISTANCE_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir le rayon, il doit être un entier";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_KILL_BLOCKEDEX_GAME_MISSING_DISTANCE) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir le rayon, il manque le rayon";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RADIUS_AREA_ON_PLAYER_KILL_BLOCKEDEX_GAME_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<rayon>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour changer le nom du style de jeu blockedex courant";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_BLOCKEDEX_GAME_RENAMED) {
			@Override
			public String getMessage(String... args) {
				return "Style de jeu blockedex " + args[0] + " renamed as " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_BLOCKEDEX_GAME_ALREADY_EXISTING) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de renommer le style blockedex " + args[0] + " en " + args[1] + ", ce style existe déjà";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RENAME_BLOCKEDEX_GAME_MISSING_NAME) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de renommer le style de jeu blockedex " + args[0] + ", il manque le nom";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.RESET_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour réinitialiser les caractéristiques d'un style blockedex";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.RESET_BLOCKEDEX_GAME_MESSAGE) {
			@Override
			public String getMessage(String... args) {
				return "Les caractéristiques du style blockedex " + args[0] + " ont été réinitialisées";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.SAVE_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour sauvegarder le style blockedex courant";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.SAVE_BLOCKEDEX_GAME_SAVED) {
			@Override
			public String getMessage(String... args) {
				return "Style de jeu blockedex " + args[0] + " sauvegardé";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.STEP_HEALTH_BLOCKEDEX_GAME_EXPLANATION) {
			@Override
			public String getMessage(String... args) {
				return "pour définir le pas lorsque la vie d'un joueur doit être augmentée ou diminuée";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.STEP_HEALTH_BLOCKEDEX_GAME_NEGATIVE_STEP) {
			@Override
			public String getMessage(String... args) {
				return "Le pas doit être strictement positif";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.STEP_HEALTH_BLOCKEDEX_GAME_STEP_DEFINED) {
			@Override
			public String getMessage(String... args) {
				return "La vie d'un joueur sera augmentée/diminuée de " + args[0] + " demi-coeurs";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.STEP_HEALTH_BLOCKEDEX_GAME_BAD_STEP_FORMAT) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir le pas, il doit être un double";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.STEP_HEALTH_BLOCKEDEX_GAME_MISSING_STEP) {
			@Override
			public String getMessage(String... args) {
				return "Impossible de définir le pas, il manque le pas";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.STEP_HEALTH_BLOCKEDEX_GAME_ON_TAB_COMPLETE) {
			@Override
			public String getMessage(String... args) {
				return "<pas>";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.BAD_BASES_CONFIGURATION) {
			@Override
			public String getMessage(String... args) {
				return "Une ou plusieurs bases (nord, sud, est, ouest) ne sont pas définies ou ne sont pas accessibles par rapport aux équipes enregistrées";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.CHEST_IS_RESTRICTED) {
			@Override
			public String getMessage(String... args) {
				return "Ce coffre est reservé à l'équipe " + args[0] + " vous êtes dans l'équipe " + args[1];
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.TEAM_ELIMINATED) {
			@Override
			public String getMessage(String... args) {
				return "L'équipe " + args[0] + " a été éliminée ";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.CANNOT_DROP_ITEM_ITEM_FORBIDDEN) {
			@Override
			public String getMessage(String... args) {
				return "Cet item n'est pas reconnu";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.CANNOT_DROP_ITEM_ITEM_ALREADY_DROPPED) {
			@Override
			public String getMessage(String... args) {
				return "Cet item a déjà été déposé";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.CANNOT_GET_ITEM_BACK) {
			@Override
			public String getMessage(String... args) {
				return "Vous ne pouvez pas récupérer cet item";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.PLAYERS_NOT_IN_TEAM) {
			@Override
			public String getMessage(String... args) {
				return "Il y a des joueurs qui ne sont pas en équipe";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.NO_GAME_STYLE_DEFINED_AS_CURRENT) {
			@Override
			public String getMessage(String... args) {
				return "Aucun style de jeu défini";
			}
		});

		registerMessage(new AbstractPlayerMessage(MessageCode.GAME_SUSPENDED) {
			@Override
			public String getMessage(String... args) {
				return "Partie suspendue";
			}
		}).registerMessage(new AbstractPlayerMessage(MessageCode.GAME_RESUMED) {
			@Override
			public String getMessage(String... args) {
				return "Reprise";
			}
		});
	}
}
