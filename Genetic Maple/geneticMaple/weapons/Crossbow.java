package geneticMaple.weapons;

import geneticMaple.weapons.Weapon;

public class Crossbow extends Weapon {

	public Crossbow() {
		super.setTrinity("Bow");
		super.setTrinity("Melee");
		super.setPow(7);
		super.setAcc(70);
		super.setPhys(true);
		super.setName("IronCrossbow");
	}
}
