package geneticEmblem.weapons;

import geneticEmblem.weapons.Weapon;

public class IronBow extends Weapon {

	public IronBow() {
		super.setTrinity("Bow");
		super.setTraits("Ranged");
		super.setTraits("Arrow");
		super.setPow(6);
		super.setAcc(85);
		super.setPhys(true);
		super.setName("IronBow");
	}
}
