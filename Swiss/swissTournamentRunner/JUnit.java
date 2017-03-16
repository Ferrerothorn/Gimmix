package swissTournamentRunner;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class JUnit {

	public Tournament t = new Tournament();

	@Before
	public void setup() {
		t.newTourney();
	}

	@Test
	public void testAddPlayersToTournament() {
		t.addPlayer("P1");
		t.addPlayer("P2");
		assertEquals(2, t.players.size());
	}

	@Test
	public void testCompareIdenticalPlayersIsTie() {
		Player p1 = new Player("P1", 0, 0, 0, 0);
		Player p2 = new Player("P2", 0, 0, 0, 0);
		t.addPlayer(p1);
		t.addPlayer(p2);
		assertEquals(0, p1.compareTo(p2));
	}

	@Test
	public void testP1Better() {
		Player p1 = new Player("P1", 1, 0, 0, 0);
		Player p2 = new Player("P2", 0, 0, 0, 0);
		t.addPlayer("P1");
		t.addPlayer("P2");
		assertEquals(-1, p1.compareTo(p2));
	}

	@Test
	public void testCompareP2Better() {
		Player p1 = new Player("P1", 0, 0, 0, 0);
		Player p2 = new Player("P2", 1, 0, 0, 0);
		t.addPlayer("P1");
		t.addPlayer("P2");
		assertEquals(1, p1.compareTo(p2));
	}

	@Test
	public void testTiedSoGoToTB() {
		Player p1 = new Player("P1", 3, 1, 0, 0);
		Player p2 = new Player("P2", 3, 0, 0, 0);
		t.addPlayer("P1");
		t.addPlayer("P2");
		assertEquals(-1, p1.compareTo(p2));
	}

	@Test
	public void testTiedSoGoToTB_p2() {
		Player p1 = new Player("P1", 3, 0, 0, 0);
		Player p2 = new Player("P2", 3, 1, 0, 0);
		t.addPlayer("P1");
		t.addPlayer("P2");
		assertEquals(1, p1.compareTo(p2));
	}

	@Test
	public void testTiedSoGoToOppWr() {
		Player p1 = new Player("P1", 3, 1, 3, 0);
		Player p2 = new Player("P2", 3, 1, 0, 0);
		t.addPlayer("P1");
		t.addPlayer("P2");
		assertEquals(-1, p1.compareTo(p2));
	}

	@Test
	public void testTiedSoGoToOppWrp2() {
		Player p1 = new Player("P1", 3, 1, 0, 0);
		Player p2 = new Player("P2", 3, 1, 3, 0);
		t.addPlayer("P1");
		t.addPlayer("P2");
		assertEquals(1, p1.compareTo(p2));
	}

	@Test
	public void testTiedSoGoToOppOppWr_P1Wins() {
		Player p1 = new Player("P1", 3, 1, 0, 1);
		Player p2 = new Player("P2", 3, 1, 0, 0);
		assertEquals(-1, p1.compareTo(p2));
	}

	@Test
	public void testTiedSoGoToOppOppWr_P2Wins() {
		Player p1 = new Player("P1", 3, 1, 0, 0);
		Player p2 = new Player("P2", 3, 1, 0, 1);
		assertEquals(1, p1.compareTo(p2));
	}

	@Test
	public void testTiedEveryTieBreaker() {
		Player p1 = new Player("P1", 3, 1, 3, 0);
		Player p2 = new Player("P2", 3, 1, 3, 0);
		t.addPlayer("P1");
		t.addPlayer("P2");
		assertEquals(0, p1.compareTo(p2));
	}

	@Test
	public void testSortFourParticipants() {
		Player p1 = new Player("P1", 3, 1, 2, 0);
		Player p2 = new Player("P2", 6, 1, 3, 0);
		Player p3 = new Player("P3", 3, 1, 3, 0);
		Player p4 = new Player("P4", 0, 0, 6, 0);
		t.addPlayer(p1);
		t.addPlayer(p2);
		t.addPlayer(p3);
		t.addPlayer(p4);
		t.sortRankings();
		assertEquals("-=-=-=-Rankings-=-=-=-\nP2P3P1P4", t.rankingsToOneBigString());
	}

	@Test
	public void testAddBye_AddsNoBye() {
		t.addPlayer("P1");
		t.addPlayer("P2");
		t.addBye();
		assertEquals(false, t.containsPlayer("BYE"));
	}

	@Test
	public void testAddBye_AddsBye() {
		t.addPlayer("P1");
		t.addBye();
		assertEquals(true, t.containsPlayer("BYE"));
	}

	@Test
	public void testFightWinnerP1GetsPoints() {
		Player p1 = new Player("P1");
		Player p2 = new Player("P2");
		assertEquals(0, p1.getPoints());
		assertEquals(0, p2.getPoints());
		p1.beats(p2);
		assertEquals(3, p1.getPoints());
		assertEquals(0, p2.getPoints());
	}

	@Test
	public void testFightLogsEachOtherInFightHistory() {
		Player p1 = new Player("P1");
		Player p2 = new Player("P2");
		assertEquals(0, p1.getOpponentsList().size());
		assertEquals(0, p2.getOpponentsList().size());
		p2.beats(p1);
		assertEquals(1, p1.getOpponentsList().size());
		assertEquals(1, p2.getOpponentsList().size());
	}

	@Test
	public void testFightWinnerGetsVictoryLogged() {
		Player p1 = new Player("P1");
		Player p2 = new Player("P2");
		assertEquals(0, p1.getListOfVictories().size());
		assertEquals(0, p2.getListOfVictories().size());
		p1.beats(p2);
		assertEquals(1, p1.getListOfVictories().size());
		assertEquals("P2", p1.getListOfVictories().get(0).getName());
		assertEquals(0, p2.getListOfVictories().size());
	}

	@Test
	public void test1beats2_2beats3_1gt2gt3() {
		Player p1 = new Player("P1");
		Player p2 = new Player("P2");
		Player p3 = new Player("P3");
		t.addPlayer(p1);
		t.addPlayer(p2);
		t.addPlayer(p3);

		p1.beats(p2);
		p2.beats(p3);

		assertEquals(1, p1.getListOfVictories().size());
		assertEquals(1, p2.getListOfVictories().size());
		assertEquals(0, p3.getListOfVictories().size());
		assertEquals("-=-=-=-Rankings-=-=-=-\nP1P2P3", t.rankingsToOneBigString());

	}

	@Test
	public void testFiveManPeckingOrder() {
		Player p1 = new Player("P1");
		Player p2 = new Player("P2");
		Player p3 = new Player("P3");
		Player p4 = new Player("P4");
		Player p5 = new Player("P5");

		t.addPlayer(p1);
		t.addPlayer(p2);
		t.addPlayer(p3);
		t.addPlayer(p4);
		t.addPlayer(p5);
		t.shufflePlayers();

		p2.beats(p1);
		p3.beats(p2);
		p3.beats(p1);
		p4.beats(p3);
		p4.beats(p2);
		p4.beats(p1);
		p5.beats(p4);
		p5.beats(p3);
		p5.beats(p3);
		p5.beats(p1);

		t.sortRankings();
		assertEquals("-=-=-=-Rankings-=-=-=-\nP5P4P3P2P1", t.rankingsToOneBigString());

	}

	@Test
	public void testPairEveryoneCorrectlyThreeRoundsIn() {
		t.addPlayer("P1");
		t.addPlayer("P2");
		t.addPlayer("P3");
		t.addPlayer("P4");
		t.addPlayer("P5");
		t.addBye();

		t.shufflePlayers();
		t.sortRankings();
		t.generatePairings();
		assertEquals(3, t.currentBattles.size());
	}

	@Test
	public void testUpdatePositionInRankings() {
		Player p1 = new Player("P1");
		Player p2 = new Player("P2");
		t.addPlayer(p1);
		t.addPlayer(p2);
		p1.beats(p2);
		t.sortRankings();
		t.updateParticipantStats();
		assertEquals(1, p1.getPositionInRankings());
	}

	@Test
	public void testDroppingNonByeUserRemovesBye() {
		Player p1 = new Player("P1");
		Player p2 = new Player("P2");
		t.addPlayer("P3");
		t.addBye();
		p1.beats(p2);
		t.dropPlayer("P2");
		assertEquals(2, t.size());
	}

	@Test
	public void testDroppingNonByeUserIn4PTourneyAddsBye() {
		t.addPlayer("P1");
		t.addPlayer("P2");
		t.addPlayer("P3");
		t.addPlayer("P4");
		t.dropPlayer("P2");
		assertEquals(4, t.size());
	}

	@Test
	public void testBatchAdd() {
		String batchAdd = "P1,P2,P3,P4,P5,P6,P7,P8";
		t.addBatch(batchAdd);
		assertEquals(8, t.players.size());
		assertEquals("P1", t.players.get(0).getName());
	}

	@Test
	public void testAddLateParticipantsCorrectlyManipulatesByes() {
		t.addPlayer("P1");
		t.addPlayer("P2");
		t.addPlayer("P3");
		t.addBye();
		t.generatePairings();
		assertEquals(true, t.containsPlayer("BYE"));
		t.addBatch("P4,P5,P6");
		assertEquals(6, t.size());
		assertEquals(false, t.containsPlayer("BYE"));
	}

	@Test
	public void testAddBatchTrimsWhitespace() {
		t.addPlayer("P1");
		t.addPlayer("P2");
		t.addPlayer("P3");
		t.addBatch(" P4,P5 ,  P6   ,                      P7 ,	P8 	");
		assertEquals(8, t.players.size());
		for (Player p : t.players) {
			assertEquals(2, p.getName().length());
		}
	}

	@Test
	public void testAddingUsersToTourneyWithBye_AssertByeStillRequired() {
		t.addPlayer("P1");
		t.addPlayer("P2");
		t.addPlayer("P3");
		t.addBye();
		t.addBatch("P4,P5,P6,P7");
		assertEquals(true, t.containsPlayer("BYE"));
		assertEquals(8, t.size());
	}

	@Test
	public void testAddingUsersToTourneyWithBye_AssertByeNoLongerRequired() {
		t.addPlayer("P1");
		t.addPlayer("P2");
		t.addPlayer("P3");
		t.addBye();
		t.addBatch("P4,P5,P6,P7,P8");
		assertEquals(false, t.containsPlayer("BYE"));
		assertEquals(8, t.size());
	}

	@Test
	public void testAddingUserWithDuplicateNameDoesntAdd() {
		t.addPlayer("Tom");
		t.addPlayer("Dick");
		t.addPlayer("Harry");
		t.addPlayer("Sally");
		assertEquals(4, t.size());
		t.addPlayer("Sally");
		assertEquals(false, t.containsPlayer("BYE"));
		assertEquals(4, t.size());
	}

	@Test
	public void testAddingUsersToTourneyWithoutBye_AssertByeStillNotRequired() {
		t.addPlayer("P1");
		t.addPlayer("P2");
		t.addPlayer("P3");
		t.addPlayer("P4");
		t.addBatch("P5,P6,P7,P8");
		assertEquals(false, t.containsPlayer("BYE"));
		assertEquals(8, t.size());
	}

	@Test
	public void testAddingUsersToTourneyWithoutBye_AssertByeNowRequired() {
		t.addPlayer("P1");
		t.addPlayer("P2");
		t.addPlayer("P3");
		t.addPlayer("P4");
		t.addBatch("P5,P6,P7");
		assertEquals(true, t.containsPlayer("BYE"));
		assertEquals(8, t.size());
	}

	@Test
	public void testAddingUserIncrementsRequiredRounds() {
		t.addBatch("P1,P2,P3,P4,P5,P6,P7,P8");
		t.setNumberOfRounds(3);
		t.addBatch("P9,P10");
		assertEquals(4, t.getNumberOfRounds());
	}

	@Test
	public void testRemovingUserDecrementsRequiredRounds() {
		t.addBatch("P1,P2,P3,P4,P5,P6");
		t.setNumberOfRounds(3);
		t.dropPlayer("P5");
		t.dropPlayer("P6");
		assertEquals(2, t.getNumberOfRounds());
	}

	@Test
	public void testReopenGame() {
		Player p1 = new Player("P1");
		Player p2 = new Player("P2");
		Player p3 = new Player("P3");
		Player p4 = new Player("P4");

		t.addPlayer(p1);
		t.addPlayer(p2);
		t.addPlayer(p3);
		t.addPlayer(p4);

		t.generatePairings();
		assertEquals(2, t.currentBattles.size());
		Battle b = t.currentBattles.remove(0);
		t.handleBattleWinner(b, "1");
		assertEquals(1, b.getP1().getListOfVictories().size());
		assertEquals(0, b.getP2().getListOfVictories().size());
		assertEquals(1, b.getP1().getOpponentsList().size());
		assertEquals(1, b.getP2().getOpponentsList().size());
		assertEquals(1, t.currentBattles.size());

		t.reopenBattle(b.getP1(), b.getP2());

		assertEquals(0, b.getP1().getListOfVictories().size());
		assertEquals(0, b.getP2().getListOfVictories().size());
		assertEquals(0, b.getP1().getOpponentsList().size());
		assertEquals(0, b.getP2().getOpponentsList().size());
		assertEquals(2, t.currentBattles.size());
	}

	@Test
	public void testCannotReopenNonexistantGame() {
		Player p1 = new Player("P1");
		Player p2 = new Player("P2");
		Player p3 = new Player("P3");
		Player p4 = new Player("P4");

		t.addPlayer(p1);
		t.addPlayer(p2);
		t.addPlayer(p3);
		t.addPlayer(p4);

		t.generatePairings();
		Battle b = t.currentBattles.remove(0);
		t.handleBattleWinner(b, "1");
		t.reopenBattle(p1, p4);
		assertEquals(1, t.currentBattles.size());
	}

	@Test
	public void testReopeningGameDropsScore() {
		Player p1 = new Player("P1");
		Player p2 = new Player("P2");

		t.addPlayer(p1);
		t.addPlayer(p2);

		t.generatePairings();
		assertEquals(1, t.currentBattles.size());
		Battle b = t.currentBattles.remove(0);
		t.handleBattleWinner(b, "1");

		assertEquals(3, b.getP1().getScore());
		assertEquals(0, b.getP2().getScore());

		t.reopenBattle(b.getP1(), b.getP2());

		assertEquals(0, b.getP1().getScore());
		assertEquals(0, b.getP2().getScore());
	}

	@Test
	public void testPreviousRoundsAreLoggedCorrectly() {
		Player p1 = new Player("P1");
		Player p2 = new Player("P2");
		t.addPlayer(p1);
		t.addPlayer(p2);

		p1.beats(p2);

		assertEquals(1, p1.getListOfVictories().size());
		assertEquals(1, p1.getOpponentsList().size());
		assertEquals(1, p2.getOpponentsList().size());
		assertEquals(0, p2.getListOfVictories().size());
	}

	@Test
	public void testGetResultsOfAllMatchesSoFar_NoTies() {
		Player p1 = new Player("P1");
		Player p3 = new Player("P3");
		Player p2 = new Player("P2");
		t.addPlayer(p1);
		t.addPlayer(p2);
		t.addPlayer(p3);

		p2.beats(p3);
		p1.beats(p2);

		assertEquals("P1 vs. P2 (P1 won)\nP2 vs. P3 (P2 won)\n", t.getResultsOfAllMatchesSoFar());
	}

	@Test
	public void testGetResultsOfAllMatchesSoFar_WinsAndTies() {

		Player p1 = new Player("P1");
		Player p3 = new Player("P3");
		Player p2 = new Player("P2");
		Player p4 = new Player("P4");
		t.addPlayer(p1);
		t.addPlayer(p2);
		t.addPlayer(p3);
		t.addPlayer(p4);

		p1.beats(p2);
		p2.beats(p3);
		p3.tied(p4);
		t.sortRankings();

		assertEquals("P1 vs. P2 (P1 won)\nP2 vs. P3 (P2 won)\nP3 vs. P4 (Tied)\nP4 vs. P3 (Tied)\n",
				t.getResultsOfAllMatchesSoFar());
	}

	@Test
	public void testSingleElimination_EliminatesCorrectly() {
		Player p1 = new Player("P1");
		Player p3 = new Player("P3");
		Player p2 = new Player("P2");
		Player p4 = new Player("P4");
		Player p5 = new Player("P5");
		Player p6 = new Player("P6");
		Player p7 = new Player("P7");
		Player p8 = new Player("P8");
		t.addPlayer(p1);
		t.addPlayer(p2);
		t.addPlayer(p3);
		t.addPlayer(p4);
		t.addPlayer(p5);
		t.addPlayer(p6);
		t.addPlayer(p7);
		t.addPlayer(p8);

		p1.beats(p2);
		p3.beats(p4);
		p5.beats(p6);
		p7.beats(p8);

		t.setX_elimination(1);
		t.elimination();

		assertEquals(4, t.players.size());
	}

	@Test
	public void testDoubleElimination_EliminatesCorrectly() {
		Player p1 = new Player("P1");
		Player p3 = new Player("P3");
		Player p2 = new Player("P2");
		Player p4 = new Player("P4");
		Player p5 = new Player("P5");
		Player p6 = new Player("P6");
		Player p7 = new Player("P7");
		Player p8 = new Player("P8");
		t.addPlayer(p1);
		t.addPlayer(p2);
		t.addPlayer(p3);
		t.addPlayer(p4);
		t.addPlayer(p5);
		t.addPlayer(p6);
		t.addPlayer(p7);
		t.addPlayer(p8);

		p1.beats(p2);
		p3.beats(p4);
		p5.beats(p6);
		p7.beats(p8);

		p1.beats(p3);
		p5.beats(p7);
		p2.beats(p4);
		p6.beats(p8);

		t.setX_elimination(2);
		t.elimination();

		assertEquals(6, t.players.size());
	}

	@Test
	public void testTwoManEliminationTourneyEnds() {
		Player p1 = new Player("P1");
		t.addPlayer(p1);
		t.setX_elimination(1);
		t.eliminationTournament();
		assertEquals(1, t.players.size());
	}

	@Test
	public void testFourManEliminationTourneyEnds() {

		Player p1 = new Player("P1");
		Player p2 = new Player("P2");
		Player p3 = new Player("P3");
		Player p4 = new Player("P4");
		t.addPlayer(p1);
		t.addPlayer(p2);
		t.addPlayer(p3);
		t.addPlayer(p4);
		t.setX_elimination(1);
		t.generatePairings();
		t.handleBattleWinner(t.currentBattles.remove(0), "1");
		t.handleBattleWinner(t.currentBattles.remove(0), "1");
		t.elimination();
		assertEquals(2, t.players.size());
		t.generatePairings();
		t.handleBattleWinner(t.currentBattles.remove(0), "1");
		t.elimination();
		assertEquals(2, t.players.size());
		assertEquals("P1", t.players.get(0).getName());
	}

	@Test
	public void testTwelveManEliminationTourneyEnds() {

		Player p1 = new Player("P1");
		Player p2 = new Player("P2");
		Player p3 = new Player("P3");
		Player p4 = new Player("P4");
		Player p5 = new Player("P5");
		Player p6 = new Player("P6");
		Player p7 = new Player("P7");
		Player p8 = new Player("P8");
		Player p9 = new Player("P9");
		Player p10 = new Player("P10");
		Player p11 = new Player("P11");
		Player p12 = new Player("P12");
		t.addPlayer(p1);
		t.addPlayer(p2);
		t.addPlayer(p3);
		t.addPlayer(p4);
		t.addPlayer(p5);
		t.addPlayer(p6);
		t.addPlayer(p7);
		t.addPlayer(p8);
		t.addPlayer(p9);
		t.addPlayer(p10);
		t.addPlayer(p11);
		t.addPlayer(p12);
		t.setX_elimination(2);

		t.generatePairings();
		while (t.currentBattles.size() > 0) {
			t.handleBattleWinner(t.currentBattles.remove(0), "1");
		}
		t.elimination();
		assertEquals(12, t.players.size());

		t.generatePairings();
		while (t.currentBattles.size() > 0) {
			t.handleBattleWinner(t.currentBattles.remove(0), "1");
		}
		t.elimination();
		assertEquals(10, t.players.size());

		t.generatePairings();
		while (t.currentBattles.size() > 0) {
			t.handleBattleWinner(t.currentBattles.remove(0), "1");
		}
		t.elimination();
		assertEquals(6, t.players.size());

		t.generatePairings();
		while (t.currentBattles.size() > 0) {
			t.handleBattleWinner(t.currentBattles.remove(0), "1");
		}
		t.elimination();
		assertEquals(4, t.players.size());

		t.generatePairings();
		while (t.currentBattles.size() > 0) {
			t.handleBattleWinner(t.currentBattles.remove(0), "1");
		}
		t.elimination();
		assertEquals(2, t.players.size());

		// t.generatePairings();
		// while (t.currentBattles.size() > 0) {
		// t.handleBattleWinner(t.currentBattles.remove(0), "1");
		// }
		// t.elimination();
		// assertEquals(1, t.players.size());
	}

	@Test
	public void testSaveTournament() {

	}

	@Test
	public void testAddsGameToPlayerHistory() {
		Player p1 = new Player("P1");
		Player p2 = new Player("P2");
		t.addPlayer(p1);
		t.addPlayer(p2);

		t.addGamesToPlayerHistory("P1_[P2]_[P2]");
		t.addGamesToPlayerHistory("P2_[]_[P1]");

		assertEquals(1, p1.getOpponentsList().size());
		assertEquals(1, p1.getListOfVictories().size());
		assertEquals(1, p2.getOpponentsList().size());
		assertEquals(0, p2.getListOfVictories().size());
	}

	@Test
	public void testTyingGameAddsOnePoint() {

		Player p1 = new Player("P1");
		Player p2 = new Player("P2");
		Player p3 = new Player("P3");
		t.addPlayer(p1);
		t.addPlayer(p2);
		t.addPlayer(p3);
		
		p1.beats(p2);
		p2.tied(p3);
		
		assertEquals(1 , p1.getListOfVictories().size());
		assertEquals(1 , p1.getOpponentsList().size());
		assertEquals(3 , p1.getScore());
		
		assertEquals(0 , p2.getListOfVictories().size());
		assertEquals(2 , p2.getOpponentsList().size());
		assertEquals(1 , p2.getScore());
		
		assertEquals(0 , p3.getListOfVictories().size());
		assertEquals(1 , p3.getOpponentsList().size());
		assertEquals(1 , p3.getScore());
		
		
		
	}
	
	@Test
	public void testAddingExtraRoundsThenReportingResultsDoesntResetRoundNumber() {
		Player p1 = new Player("P1");
		Player p2 = new Player("P2");
		Player p3 = new Player("P3");
		Player p4 = new Player("P4");
		Player p5 = new Player("P5");
		t.addPlayer(p1);
		t.addPlayer(p2);
		t.addPlayer(p3);
		t.addPlayer(p4);
		t.addPlayer(p5);
		t.addBye();
		t.setNumberOfRounds(5);

		t.generatePairings();
		while (t.currentBattles.size() > 0) {
			t.handleBattleWinner(t.currentBattles.remove(0), "1");
		}
		
		assertEquals(5, t.numberOfRounds);

	}

}
