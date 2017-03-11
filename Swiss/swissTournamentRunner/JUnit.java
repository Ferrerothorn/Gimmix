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
		assertEquals(2, t.participants());
	}

	@Test
	public void testCompareIdenticalPlayersIsTie() {
		Player p1 = new Player("P1", 0, 0, 0);
		Player p2 = new Player("P2", 0, 0, 0);
		t.addPlayer("P1");
		t.addPlayer("P2");
		assertEquals(0, p1.compareTo(p2));
	}

	@Test
	public void testP1Better() {
		Player p1 = new Player("P1", 1, 0, 0);
		Player p2 = new Player("P2", 0, 0, 0);
		t.addPlayer("P1");
		t.addPlayer("P2");
		assertEquals(-1, p1.compareTo(p2));
	}

	@Test
	public void testCompareP2Better() {
		Player p1 = new Player("P1", 0, 0, 0);
		Player p2 = new Player("P2", 1, 0, 0);
		t.addPlayer("P1");
		t.addPlayer("P2");
		assertEquals(1, p1.compareTo(p2));
	}

	@Test
	public void testTiedSoGoToTB() {
		Player p1 = new Player("P1", 3, 1, 0);
		Player p2 = new Player("P2", 3, 0, 0);
		t.addPlayer("P1");
		t.addPlayer("P2");
		assertEquals(-1, p1.compareTo(p2));
	}

	@Test
	public void testTiedSoGoToTB_p2() {
		Player p1 = new Player("P1", 3, 0, 0);
		Player p2 = new Player("P2", 3, 1, 0);
		t.addPlayer("P1");
		t.addPlayer("P2");
		assertEquals(1, p1.compareTo(p2));
	}

	@Test
	public void testTiedSoGoToBuch() {
		Player p1 = new Player("P1", 3, 1, 3);
		Player p2 = new Player("P2", 3, 1, 0);
		t.addPlayer("P1");
		t.addPlayer("P2");
		assertEquals(-1, p1.compareTo(p2));
	}

	@Test
	public void testTiedSoGoToBuchp2() {
		Player p1 = new Player("P1", 3, 1, 0);
		Player p2 = new Player("P2", 3, 1, 3);
		t.addPlayer("P1");
		t.addPlayer("P2");
		assertEquals(1, p1.compareTo(p2));
	}

	@Test
	public void testTiedEveryTieBreaker() {
		Player p1 = new Player("P1", 3, 1, 3);
		Player p2 = new Player("P2", 3, 1, 3);
		t.addPlayer("P1");
		t.addPlayer("P2");
		assertEquals(0, p1.compareTo(p2));
	}

	@Test
	public void testSortFourParticipants() {
		Player p1 = new Player("P1", 3, 1, 2);
		Player p2 = new Player("P2", 6, 1, 3);
		Player p3 = new Player("P3", 3, 1, 3);
		Player p4 = new Player("P4", 0, 0, 6);
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
		Player p2 = new Player("P2");
		Player p3 = new Player("P3");
		t.addPlayer(p1);
		t.addPlayer(p2);
		t.addPlayer(p3);

		p1.beats(p2);
		p2.beats(p3);

		assertEquals("P1 vs. P2 (P1 won)\nP2 vs. P3 (P2 won)\n", t.getResultsOfAllMatchesSoFar());
	}

	@Test
	public void testGetResultsOfAllMatchesSoFar_WinsAndTies() {
		Player p1 = new Player("P1");
		Player p2 = new Player("P2");
		Player p3 = new Player("P3");
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

}
