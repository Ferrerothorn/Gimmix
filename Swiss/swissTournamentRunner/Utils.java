package swissTournamentRunner;

import java.util.ArrayList;

public class Utils {

	public static void autocompleteRound(ArrayList<Battle> battles) {
		while (battles.size() > 0) {
			handleBattleWinner(battles.remove(0), "1");
		}
	}

	public static void handleBattleWinner(Battle b, String winner) {
		switch (winner) {
		case "1":
			b.getP1().beats(b.getP2());
			b = null;
			break;
		case "2":
			b.getP2().beats(b.getP1());
			b = null;
			break;
		case "3":
			b.getP1().tied(b.getP2());
			b = null;
			break;
		default:
			break;
		}
	}

	public static void showHelp() {
		GUI.wipePane();
		print("Welcome to B-T-C.\n"
				+ "First, use the text bar below to enter the tournament's participants, one at a time.\n"
				+ "Then, pairings will be automatically generated for you, ordered by each participant's results so far.\n"
				+ "Enter numbers to the text bar to report scores for each pairing.\n\n");
		print("");
		print("At any point while polling for game results, you can enter 'admintools' to enter Administrator mode. ");
		print("You can then enter a further series of commands to alter properties of the current tournament.");
		print("Here's the manual for all current Administrator commands:");
		print();

		print("drop/dropUser/dropPlayer:");
		print("Prompts for a player name, then removes the specified player from the tournament.");
		print("This doesn't affect the scores of anyone who beat this player in a previous round.");
		print("This command can only be performed on players who have no active battle.");
		print();

		print("editName:");
		print("Takes in the current username (case sensitive) of a player in the tournament, and a new name for that player.");
		print("Scores, etc, of the renamed player are preserved.");
		print();

		print("batchAdd/addBatch:");
		print("Takes in a comma-separated list of usernames and adds them to the tournament in one transaction.");
		print("This can be used to insert latecomer players to the tournament - the pairing algorithm will pick up the new players at the beginning of each round.");
		print("New players start with a score of 0.");
		print("An example of this command in use might be 'Jimmy Page, Robert Plant, John Paul Jones'.");
		print("Trailing and leading whitespace in a batchAdd player's name is ignored.");
		print();

		print("reopenGame:");
		print("Prompts the user for two parameters; the case-sensitive usernames of the two players whose game you'd like to reopen.");
		print("Any scores from a reopened game are reset, and the game is re-added to the Open Games list to report anew.");
		print();

		print("save:");
		print("Saves a .tnt metadata file of the tournament's current state.");
		print("The file will be saved to the same directory as the BTC executable.");
		print("Files can be reloaded by the admin 'load' command, or simply kept for posterity.");
		print("Currently BTC saves a .tnt backup every time a result is reported - this may change later.");
		print();

		print("load:");
		print("Asks for a .tnt metadata file to reload that tournament into memory.");
		print("File names can be supplied either with or without the .tnt suffix.");
		print();

		print("matches:");
		print("Produces a list of each result reported thus far - the combatants, and the reported victor.");
		print();

		print("setrounds/addround:");
		print("Takes an integer as input to use as the new 'max number of rounds'.");
		print("You can't set the number of rounds to be less than logBase2(number of players), or >= the number of players.");
		print();

		print("killall:");
		print("Wipes all battles and players from memory and kills the current session.");
		print("WARNING: This is irreversible, and designed for debug use only!");
		print();

		print("elimination:");
		print("Experimental: Turns a tournament into X-elimination, instead of Swiss.");
		print("The command will request a value for X. In between rounds, users with X or more losses will be dropped.");
		print("WARNING: For the time being, use is discouraged, as testing is minimal and there are known fatal bugs.");
		print();

	}

	public static void print() {
		GUI.postString("");
	}

	public static void print(String string) {
		GUI.postString(string);
	}

	public static String rpad(String inStr, int finalLength) {
		return (inStr
				+ "                                                                                                                          ")
						.substring(0, finalLength);
	}
	


}
