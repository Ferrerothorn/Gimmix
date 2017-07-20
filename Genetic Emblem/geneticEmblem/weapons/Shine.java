package geneticEmblem.weapons;

import geneticEmblem.weapons.Weapon;

public class Shine extends Weapon {

	public Shine() {
		super.setTrinity("Light");
		super.addTrait("Ranged");
		super.setPow(6);
		super.setAcc(90);
		super.setCrit(8);
		super.setPhys(false);
		super.setName("Aura");
	}
}
