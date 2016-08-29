package geneticEmblem.weapons;

public class DualBowgun extends Weapon {

	public DualBowgun() {
		super.setTrinity("Gun");
		super.setTrinity("Bow");
		super.setPow(6);
		super.setCrit(5);
		super.setAcc(85);
		super.setPhys(true);
		super.addTrait("Arrow");
		super.setName("DualBowgun");
	}
}
