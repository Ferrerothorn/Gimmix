package geneticEmblem.weapons;

import geneticEmblem.weapons.Weapon;

public class ShortSpear extends Weapon {

	public ShortSpear() {
		super.setTrinity("Lance");
		super.addTrait("Ranged");
		super.setPow(12);
		super.setAcc(60);
		super.setPhys(true);
		super.setName("ShortSpear");
	}

}
