package geneticEmblem.weapons;

import geneticEmblem.weapons.Weapon;

public class Aura extends Weapon {

	public Aura() {
		super.setTrinity("Light");
		super.addTrait("Ranged");
		super.setPow(12);
		super.setAcc(85);
		super.setCrit(15);
		super.setPhys(false);
		super.setName("Aura");
	}
}
