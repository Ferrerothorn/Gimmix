package randomNamePicker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class NamePicker {

	static ArrayList<String> names = new ArrayList<String>();

	public static void main(String[] args) {

		addAll(names);
		Collections.shuffle(names);
		pickWinners(3);

	}

	private static void pickWinners(int i) {
		filter(names);
		Random r = new Random();
		for (int j = 0; j < i; j++) {
			System.out.println(names.remove(r.nextInt(names.size())));
		}
	}

	private static void addAll(ArrayList<String> playerList) {
		playerList.add("");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void filter(ArrayList<String> playerList) {
		ArrayList<String> cancer = new ArrayList<String>();
		for (String name : playerList) {
			if (name.contains("Steve Dolman") || name.contains("osie") || name.contains("mily")
					|| name.contains("oldie") || name.contains("ennington")) {
				cancer.add(name);
			}
		}
		for (String cell : cancer) {
			playerList.remove(cell);
		}
	}

}
