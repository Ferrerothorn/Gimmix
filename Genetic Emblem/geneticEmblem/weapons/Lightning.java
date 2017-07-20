package geneticEmblem.weapons;

import geneticEmblem.weapons.Weapon;

public class Lightning extends Weapon {

	public Lightning() {
		super.setTrinity("Light");
		super.addTrait("Ranged");
		super.setPow(4);
		super.setAcc(90);
		super.setCrit(5);
		super.setPhys(false);
		super.setName("Lightning");
	}
}
