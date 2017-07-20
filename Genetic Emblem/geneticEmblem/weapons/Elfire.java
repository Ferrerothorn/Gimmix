package geneticEmblem.weapons;

import geneticEmblem.weapons.Weapon;

public class Elfire extends Weapon {

	public Elfire() {
		super.setTrinity("Anima");
		super.setPow(10);
		super.addTrait("Ranged");
		super.setAcc(85);
		super.setPhys(false);
		super.setName("Elfire");
	}
}
