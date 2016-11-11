package geneticEmblem.weapons;

public class WindBow extends Weapon {

	public WindBow() {
		super.setTrinity("Bow");
		super.setTrinity("Anima");
		super.setPow(7);
		super.setAcc(70);
		super.setPhys(true);
		super.addTrait("Arrow");
		super.setName("WindBow");
	}
}
