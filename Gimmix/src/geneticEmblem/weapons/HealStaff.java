package geneticEmblem.weapons;

public class HealStaff extends Weapon {

	public HealStaff() {
		super.setTrinity("Light");
		super.setPow(4);
		super.setAcc(85);
		super.setPhys(false);
		super.setCrit(5);
		super.addTrait("Lifelink");
	}

}
