package geneticEmblem.weapons;

import geneticEmblem.weapons.Weapon;

public class Spear extends Weapon {

	public Spear() {
		super.setTrinity("Lance");
		super.addTrait("Ranged");
		super.setPow(12);
		super.setAcc(70);
		super.setCrit(5);
		super.setPhys(true);
		super.setName("IronLance");
	}

}
