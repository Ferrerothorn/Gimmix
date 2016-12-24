package geneticEmblem.weapons;

import geneticEmblem.weapons.Weapon;

public class Lightning extends Weapon {

	public Lightning() {
		super.setTrinity("Light");
		super.setTraits("Ranged");
		super.setPow(4);
		super.setAcc(95);
		super.setCrit(5);
		super.setPhys(false);
		super.setName("Lightning");
	}
}
