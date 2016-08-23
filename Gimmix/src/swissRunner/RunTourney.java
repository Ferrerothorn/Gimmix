package swissRunner;

import java.util.Scanner;

public class RunTourney {

	static Tournament tourney = new Tournament();

	public static void main(String[] args) {

		boolean allParticipantsIn = false;
		Scanner sc = new Scanner(System.in);

		while (!allParticipantsIn) {
			System.out.println("Enter the name of the next participant, or enter 'no' if done.");
			String name = sc.nextLine();
			if (name.equals("no") && name.length() > 0) {
				allParticipantsIn = true;
			} else {
				tourney.addPlayer(new Player(name));
			}
		}

		tourney.addBye();

		int numberOfRounds = tourney.logBase2(tourney.numberOfPlayers());

		int i = 1;
		while (i <= numberOfRounds) {
			System.out.println("-=-=-=-Round " + i + "!-=-=-=-");
			System.out.println();
			tourney.shufflePlayers();
			tourney.sortRankings();
			tourney.updateParticipantStats();
			tourney.generatePairings();
			tourney.pollForResults();
			tourney.updateParticipantStats();
			tourney.sortRankings();
			tourney.displayInDepthRankings();
			i++;
		}

		System.out.println("And that's it over!");
		System.out.println("FINAL STANDINGS");
		System.out.println();
		tourney.displayInDepthRankings();
		tourney.closeScanner();
		sc.close();
	}
}
