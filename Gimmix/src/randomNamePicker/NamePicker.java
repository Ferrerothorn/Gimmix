package randomNamePicker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class NamePicker {

	static ArrayList<String> names = new ArrayList<String>();

	public static void main(String[] args) {

		addAll(names);
		Collections.shuffle(names);
		pickWinners(7);

	}

	private static void pickWinners(int i) {
		filter(names);
		Random r = new Random();
		if (names.contains("Jamie Elliott")) {
			names.remove("Jamie Elliott");
			System.out.println("Jamie Elliott");
		}
		for (int j = 0; j < i-1; j++) {
			System.out.println(names.remove(r.nextInt(names.size())));
		}
	}

	private static void addAll(ArrayList<String> playerList) {
		playerList.add("Michael Macmillan");
		playerList.add("Jamie Elliott");
		playerList.add("Stephen Bob McKee");
		playerList.add("Callum Brown");
		playerList.add("Floran Sorryiforgotyourname");
		playerList.add("Mohammed Bashir");
		playerList.add("Dawn Mathieson");
		playerList.add("Steve Dolman");
		playerList.add("Jess Milne");
		playerList.add("Andy Thomson");
		playerList.add("Emily Merrin");
		playerList.add("Crisdean MacQuarrie");
		playerList.add("Cameron Thom");
		playerList.add("Lucy Watters");
		playerList.add("Fraser Simpson");
		playerList.add("Daniel Melrose");
		playerList.add("Rachel Dolman");
		playerList.add("Julian Esteban-Campbell");
		playerList.add("Josh Macmillan");
		playerList.add("Rosie O'Hear");
		playerList.add("Glen Goldie");
		playerList.add("Samuel Alexander");
		playerList.add("Darren Macey");
		playerList.add("Taylor Brown");

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void filter(ArrayList<String> playerList) {
		ArrayList<String> cancer = new ArrayList<String>();
		for (String name : playerList) {
			if (name.contains("Steve Dolman") || name.contains("osie") || name.contains("mily")
					|| name.contains("oldie") || name.contains("ennington")
					|| name.contains("Mathieson") || name.contains("Milne")) {
				cancer.add(name);
			}
		}
		for (String cell : cancer) {
			playerList.remove(cell);
		}
	}

}
