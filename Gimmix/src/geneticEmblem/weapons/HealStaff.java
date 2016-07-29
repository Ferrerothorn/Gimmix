package geneticEmblem.weapons;

public class HealStaff extends Weapon {

	public HealStaff() {
		super.setTrinity("Light");
		super.setPow(3);
		super.setAcc(85);
		super.setPhys(true);
		super.setCrit(5);
		super.addTrait("Lifelink");
	}

}
