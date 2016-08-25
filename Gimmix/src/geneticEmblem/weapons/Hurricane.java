package geneticEmblem.weapons;

public class Hurricane extends Weapon {

	public Hurricane() {
		super.setTrinity("Bow");
		super.setTrinity("Shield");
		super.setPow(7);
		super.setAcc(70);
		super.setPhys(true);
		super.addTrait("Arrow");
		super.setName("Hurricane");
	}
}
