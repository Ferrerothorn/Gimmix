package geneticEmblem.weapons;

import geneticEmblem.weapons.Weapon;

public class Divine extends Weapon {

	public Divine() {
		super.setTrinity("Light");
		super.addTrait("Ranged");
		super.setPow(8);
		super.setAcc(85);
		super.setCrit(10);
		super.setPhys(false);
		super.setName("Divine");
	}
}
