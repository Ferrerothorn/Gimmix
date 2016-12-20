package deckMetagame.weapons;

public class IronBow extends Weapon {

	public IronBow() {
		super.setTrinity("Bow");
		super.setPow(6);
		super.setAcc(85);
		super.setPhys(true);
		super.addTrait("Arrow");
		super.setName("IronBow");
	}
}
