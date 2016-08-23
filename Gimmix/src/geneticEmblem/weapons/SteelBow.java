package geneticEmblem.weapons;

public class SteelBow extends Weapon {

	public SteelBow() {
		super.setTrinity("Bow");
		super.setPow(9);
		super.setAcc(70);
		super.setPhys(true);
		super.addTrait("Arrow");
		super.setName("SteelBow");
	}

}
