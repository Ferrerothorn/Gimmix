package geneticMaple.weapons;

import geneticMaple.weapons.Weapon;

public class LightningMagic extends Weapon {

	public LightningMagic() {
		super.setTrinity("Magic");
		super.setPow(4);
		super.setAcc(95);
		super.setPhys(false);
		super.setName("Lightning");
		super.setCrit(5);
	}

}
