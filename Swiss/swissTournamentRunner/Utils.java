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
	
}
