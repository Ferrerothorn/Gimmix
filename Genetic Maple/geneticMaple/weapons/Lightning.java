package geneticMaple.weapons;

import geneticMaple.weapons.Weapon;

public class Lightning extends Weapon {

	public Lightning() {
		super.setTrinity("Magic");
		super.setPow(4);
		super.setAcc(95);
		super.setPhys(false);
		super.setName("Lightning");
		super.setCrit(5);
	}

}
