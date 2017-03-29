package geneticMaple.weapons;

import geneticMaple.weapons.Weapon;

public class Staff extends Weapon {

	public Staff() {
		super.setTrinity("Melee");
		super.setTrinity("Magic");
		super.setPow(7);
		super.setAcc(75);
		super.setPhys(false);
		super.setName("Staff");
	}

}
