package geneticEmblem.weapons;

import geneticEmblem.weapons.Weapon;

public class HeavySpear extends Weapon {

	public HeavySpear() {
		super.setTrinity("Lance");
		super.setPow(14);
		super.addTrait("Armorslayer");
		super.setAcc(70);
		super.setPhys(true);
		super.setName("Horseslayer");
	}
}
