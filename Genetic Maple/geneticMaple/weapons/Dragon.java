package geneticMaple.weapons;

import geneticMaple.weapons.Weapon;

public class Dragon extends Weapon {

	public Dragon() {
		super.setTrinity("Melee");
		super.setTrinity("Bow");
		super.setTrinity("Magic");
		super.setPow(7);
		super.setAcc(80);
		super.setPhys(false);
		super.setName("Dragon");
	}

}