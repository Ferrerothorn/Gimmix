package geneticEmblem.weapons;

public class HuntersGear extends Weapon {

	public HuntersGear() {
		super.setTrinity("Axe");
		super.setTrinity("Bow");
		super.setPow(7);
		super.setAcc(70);
		super.setPhys(true);
		super.addTrait("Arrow");
		super.setName("HuntersGear");
	}
}
