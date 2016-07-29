import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class JUnit {
	
	//Tests for the core functionality of tourneys.

	public Tournament t = new Tournament();
	public Player p1;
	public Player p2;

	@Before
	public void setup() {
		t.newTourney();
		p1 = new Player("P1");
		p2 = new Player("P2");
	}

	@Test
	public void testAddPlayersToTournament() {
		t.addPlayer(p1);
		t.addPlayer(p2);
		assertEquals(2, t.participants());
	}

	@Test
	public void testCompareIdenticalPlayersIsTie() {
		p1 = new Player("P1", 0, 0, 0);
		p2 = new Player("P2", 0, 0, 0);
		t.addPlayer(p1);
		t.addPlayer(p2);
		assertEquals(0, p1.compareTo(p2));
	}

	@Test
	public void testCompareOneDudeBetter() {
		p1 = new Player("P1", 0, 0, 0);
		p2 = new Player("P2", 1, 0, 0);
		t.addPlayer(p1);
		t.addPlayer(p2);
		assertEquals(1, p1.compareTo(p2));
	}

	@Test
	public void testOtherDudeBetter() {
		p1 = new Player("P1", 1, 0, 0);
		p2 = new Player("P2", 0, 0, 0);
		t.addPlayer(p1);
		t.addPlayer(p2);
		assertEquals(-1, p1.compareTo(p2));
	}

	@Test
	public void testTiedSoGoToTB() {
		p1 = new Player("P1", 3, 1, 0);
		p2 = new Player("P2", 3, 0, 0);
		t.addPlayer(p1);
		t.addPlayer(p2);
		assertEquals(-1, p1.compareTo(p2));
	}

	@Test
	public void testTiedSoGoToTB_p2() {
		p1 = new Player("P1", 3, 0, 0);
		p2 = new Player("P2", 3, 1, 0);
		t.addPlayer(p1);
		t.addPlayer(p2);
		assertEquals(1, p1.compareTo(p2));
	}

	@Test
	public void testTiedSoGoToBuch() {
		p1 = new Player("P1", 3, 1, 3);
		p2 = new Player("P2", 3, 1, 0);
		t.addPlayer(p1);
		t.addPlayer(p2);
		assertEquals(-1, p1.compareTo(p2));
	}

	@Test
	public void testTiedSoGoToBuchp2() {
		p1 = new Player("P1", 3, 1, 0);
		p2 = new Player("P2", 3, 1, 3);
		t.addPlayer(p1);
		t.addPlayer(p2);
		assertEquals(1, p1.compareTo(p2));
	}

	@Test
	public void testTiedEveryTieBreaker() {
		p1 = new Player("P1", 3, 1, 3);
		p2 = new Player("P2", 3, 1, 3);
		t.addPlayer(p1);
		t.addPlayer(p2);
		assertEquals(0, p1.compareTo(p2));
	}

	@Test
	public void testSortFourParticipants() {
		p1 = new Player("P1", 3, 1, 2);
		p2 = new Player("P2", 6, 1, 3);
		Player p3 = new Player("P3", 3, 1, 3);
		Player p4 = new Player("P4", 0, 0, 6);
		t.addPlayer(p1);
		t.addPlayer(p2);
		t.addPlayer(p3);
		t.addPlayer(p4);
		t.sortRankings();
		assertEquals("P4P1P3P2", t.rankingsToOneBigString());
	}

	@Test
	public void testAddBye_AddsNoBye() {
		t.addPlayer(p1);
		t.addPlayer(p2);
		t.addBye();
		assertEquals(false, t.containsPlayer("BYE"));
	}

	@Test
	public void testAddBye_AddsBye() {
		t.addPlayer(p1);
		t.addBye();
		assertEquals(true, t.containsPlayer("BYE"));
	}

	@Test
	public void testFightWinnerP1GetsPoints() {
		t.addPlayer(p1);
		t.addPlayer(p2);
		assertEquals(0, p1.getPoints());
		assertEquals(0, p2.getPoints());
		p1.beats(p2);
		assertEquals(3, p1.getPoints());
		assertEquals(0, p2.getPoints());
	}

	@Test
	public void testFightWinnerP2GetsPoints() {
		t.addPlayer(p1);
		t.addPlayer(p2);
		assertEquals(0, p1.getPoints());
		assertEquals(0, p2.getPoints());
		p2.beats(p1);
		assertEquals(0, p1.getPoints());
		assertEquals(3, p2.getPoints());
	}

	@Test
	public void testFightLogsEachOtherInFightHistory() {
		t.addPlayer(p1);
		t.addPlayer(p2);
		assertEquals(0, p1.getOpponentsList().size());
		assertEquals(0, p2.getOpponentsList().size());
		p2.beats(p1);
		assertEquals(1, p1.getOpponentsList().size());
		assertEquals(1, p2.getOpponentsList().size());
	}

	@Test
	public void testFightWinnerGetsVictoryLogged() {
		t.addPlayer(p1);
		t.addPlayer(p2);
		assertEquals(0, p1.getListOfVictories().size());
		assertEquals(0, p2.getListOfVictories().size());
		p1.beats(p2);
		assertEquals(1, p1.getListOfVictories().size());
		assertEquals("P2", p1.getListOfVictories().get(0).getName());
		assertEquals(0, p2.getListOfVictories().size());
	}

	@Test
	public void test1beats2_2beats3_1gt2gt3() {
		Player p3 = new Player("P3");
		t.addPlayer(p3);
		t.addPlayer(p2);
		t.addPlayer(p1);

		p1.beats(p2);
		p2.beats(p3);

		assertEquals(1, p1.getListOfVictories().size());
		assertEquals(1, p2.getListOfVictories().size());
		assertEquals(0, p3.getListOfVictories().size());
		assertEquals("P1P2P3", t.rankingsToOneBigString());

	}

	@Test
	public void testFiveManPeckingOrder() {
		Player p3 = new Player("P3");
		Player p4 = new Player("P4");
		Player p5 = new Player("P5");

		t.addPlayer(p3);
		t.addPlayer(p2);
		t.addPlayer(p1);
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
		assertEquals("P1P2P3P4P5", t.rankingsToOneBigString());

	}

	@Test
	public void testPairEveryoneCorrectlyThreeRoundsIn() {
		Player p3 = new Player("P3");
		Player p4 = new Player("P4");
		Player p5 = new Player("P5");
		Player bye = new Player("BYE");
		t.addPlayer(p1);
		t.addPlayer(p2);
		t.addPlayer(p3);
		t.addPlayer(p4);
		t.addPlayer(p5);
		t.addPlayer(bye);
		// R1
		p4.beats(bye);
		p1.beats(p3);
		p2.beats(p2);
		// R2
		p3.beats(bye);
		p4.beats(p5);
		p1.beats(p2);

		t.shufflePlayers();
		t.sortRankings();
		t.generatePairings();
		assertEquals(3, t.currentBattles.size());
	}

	@Test
	public void testUpdatePositionInRankings() {
		t.addPlayer(p1);
		t.addPlayer(p2);
		p1.beats(p2);
		t.sortRankings();
		t.updateParticipantStats();
		assertEquals(1, p1.getPositionInRankings());
	}

}
