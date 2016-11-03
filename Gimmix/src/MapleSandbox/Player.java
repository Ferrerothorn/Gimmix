package MapleSandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import geneticEmblem.weapons.Weapon;

public class Player {

	String name = "";
	String job = "Beginner";
	Weapon weapon;
	int lv = 1;
	int baseCrit = 5;
	
	int Str = 4;
	int Dex = 4;
	int Int = 4;
	int Luk = 4;
	
	public Player() {
		generateName(name);
	}

	private void generateName(String name) {
		ArrayList<String> cons = new ArrayList<String>();
		cons.addAll(Arrays.asList("b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "r", "s", "t", "v", "w",
				"z"));
		ArrayList<String> vow = new ArrayList<String>();
		vow.addAll(Arrays.asList("a", "e", "i", "o", "u", "y"));

		Random r = new Random();
		name += cons.get(r.nextInt(cons.size() - 1));
		name += vow.get(r.nextInt(vow.size() - 1));
		name += cons.get(r.nextInt(cons.size() - 1));
		name += cons.get(r.nextInt(cons.size() - 1));
		name += vow.get(r.nextInt(vow.size() - 1));
		int six = r.nextInt(2);
		if (six == 1) {
			name += cons.get(r.nextInt(cons.size() - 1));
		}
	}
	
}
