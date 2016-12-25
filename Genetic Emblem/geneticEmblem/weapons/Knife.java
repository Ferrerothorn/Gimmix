package geneticEmblem.weapons;

import geneticEmblem.weapons.Weapon;

public class Knife extends Weapon {

	public Knife() {
		super.setPow(2);
		super.setAcc(100);
		super.setCrit(5);
		super.setPhys(true);
		super.setName("Knife");
	}
}
