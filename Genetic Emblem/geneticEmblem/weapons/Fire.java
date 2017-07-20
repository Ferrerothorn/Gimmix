package geneticEmblem.weapons;

import geneticEmblem.weapons.Weapon;

public class Fire extends Weapon {

	public Fire() {
		super.setTrinity("Anima");
		super.setPow(5);
		super.addTrait("Ranged");
		super.setAcc(90);
		super.setPhys(false);
		super.setName("Fire");
	}
}
