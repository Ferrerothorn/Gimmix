package geneticEmblem.weapons;

import geneticEmblem.weapons.Weapon;

public class SteelBow extends Weapon {

	public SteelBow() {
		super.setTrinity("Bow");
		super.addTrait("Ranged");
		super.addTrait("Arrow");
		super.setPow(9);
		super.setAcc(70);
		super.setPhys(true);
		super.setName("SteelBow");
	}
}
