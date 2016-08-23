package draftHandComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static ArrayList<Entry> p1hand = new ArrayList<Entry>();
	public static ArrayList<Entry> p2hand = new ArrayList<Entry>();
	public static ArrayList<Pairing> pairings = new ArrayList<Pairing>();
	
	public static void main(String[] args) {
		fillHands();
		
		for (Entry s : p1hand) {
			for (Entry s2 : p2hand) {
				pairings.add(new Pairing(s, s2));
			}
		}
		Collections.shuffle(pairings);
		
		pollForPairings();
			
		Collections.sort(p1hand);
		Collections.sort(p2hand);
		System.out.println(stringify(p1hand));
		System.out.println(stringify(p2hand));
	}

	private static String stringify(ArrayList<Entry> p1hand2) {
		String s = "";
		for (Entry e : p1hand2) {
			s += e.getName() + ", ";
		}
		return s;
	}

	private static void pollForPairings() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-=-=-=-BATTLES IN PROGRESS-=-=-=-");
		while (pairings.size() > 0) {
			try {
				printAllPairings();
				int reportUpon = sc.nextInt();
				Pairing p = pairings.remove(reportUpon - 1);
				System.out.println("And who won in " + p.getP1Name() + " vs. " + p.getP2Name() + "?");
				System.out.println("1) " + p.getP1Name());
				System.out.println("2) " + p.getP2Name());
				System.out.println("3) Tied.");

				int winner = 0;
				winner = sc.nextInt();

				if (winner == 1) {
					p.getP1().win();
				} else if (winner == 2) {
					p.getP2().win();
				} else {
					
				}
			} catch (Exception e) {
				System.out.println("Illegal input. Please enter a NUMBER.");
			}
		}
		}


	private static void printAllPairings() {
		int index = 0;
		for (Pairing p : pairings) {
			index++;
			System.out.println("Table " + index + ") " + p.getP1Name() + " vs. " + p.getP2Name() + ".");
		}
		System.out.println();
	}

	private static void fillHands() {
		p1hand.add(new Entry("Charizard X"));
		p1hand.add(new Entry("Chansey"));
		p1hand.add(new Entry("Latias"));
		p1hand.add(new Entry("Serperior"));
		p1hand.add(new Entry("Manaphy"));
		p1hand.add(new Entry("Chesnaught"));
		p1hand.add(new Entry("Mamoswine"));
		p1hand.add(new Entry("Doublade"));
		p1hand.add(new Entry("Mandibuzz"));
		p1hand.add(new Entry("Tentacruel"));
		p1hand.add(new Entry("Heliolisk"));
		p1hand.add(new Entry("Salamence"));
		p1hand.add(new Entry("Diggersby"));
		
		
		
		p2hand.add(new Entry("Rotom"));	
		p2hand.add(new Entry("Venusaur"));	
		p2hand.add(new Entry("Garchomp"));	
		p2hand.add(new Entry("Bisharp"));	
		p2hand.add(new Entry("Dragonite"));	
		p2hand.add(new Entry("Porygon2"));	
		p2hand.add(new Entry("Conkeldurr"));	
		p2hand.add(new Entry("Feraligatr"));	
		p2hand.add(new Entry("Houndoom"));	
		p2hand.add(new Entry("Cloyster"));	
		p2hand.add(new Entry("Entei"));	
		p2hand.add(new Entry("Metagross"));	
		p2hand.add(new Entry("Volcarona"));	
	}

	
	
}
