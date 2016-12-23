package geneticMaple.weapons;

import geneticMaple.weapons.Weapon;

public class Bow extends Weapon {

	public Bow() {
		super.setTrinity("Bow");
		super.setPow(6);
		super.setAcc(85);
		super.setPhys(true);
		super.addTrait("Arrow");
		super.setName("IronBow");
	}
}
