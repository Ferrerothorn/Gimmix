package geneticMaple.weapons;

import geneticMaple.weapons.Weapon;

public class Cane extends Weapon {

	public Cane() {
		super.setTrinity("Melee");
		super.setTrinity("Magic");
		super.setTrinity("Stealth");
		super.setPow(6);
		super.setAcc(90);
		super.setPhys(true);
		super.setName("Cane");
	}

}
