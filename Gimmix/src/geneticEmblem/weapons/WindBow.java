package geneticEmblem.weapons;

public class WindBow extends Weapon {

	public WindBow() {
		super.setTrinity("Bow");
		super.setTrinity("Magic");
		super.setPow(7);
		super.setAcc(70);
		super.setPhys(false);
		super.addTrait("Arrow");
		super.setName("WindBow");
	}
}
