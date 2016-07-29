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
			} else { // Otherwise, make a new Player object with the name
						// entered previously.
				tourney.addPlayer(new Player(name));
			}
		}

		tourney.addBye(); 

		int numberOfRounds = tourney.logBase2(tourney.numberOfPlayers());


		int i = 1; // Here, i is basically just a banner that displays the round
					// number.
		while (i <= numberOfRounds) { // Each round consists of:
			System.out.println("-=-=-=-Round " + i + "!-=-=-=-"); // Announcing
																	// the Round
																	// number...
			System.out.println();
			tourney.shufflePlayers();
			tourney.sortRankings(); // Sorting the players into points order...
			tourney.updateParticipantStats(); 
			tourney.generatePairings(); 
			tourney.pollForResults(); // Wait until each player or pair reports
										// the results of their game...
			tourney.updateParticipantStats(); // Update each player's score
												// again with the new results...
			tourney.sortRankings(); // Re-sort the players after this round...
			tourney.displayInDepthRankings(); // Then display the current
												// "league" standings before the
												// next round.
			i++; // Move into next round.
		}

		System.out.println("And that's it over!");
		System.out.println("FINAL STANDINGS");
		System.out.println();
		tourney.displayInDepthRankings();
		tourney.closeScanner();
		sc.close();
	}
}
