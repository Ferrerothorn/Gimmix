package deckMetagame.weapons;

public class DualBowgun extends Weapon {

	public DualBowgun() {
		super.setTrinity("Bow");
		super.setTrinity("Seafare");
		super.setPow(5);
		super.setAcc(100);
		super.setPhys(true);
		super.addTrait("Arrow");
		super.setName("DualBowgun");
	}
}
