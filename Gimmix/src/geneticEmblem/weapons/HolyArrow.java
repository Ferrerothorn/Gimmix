package geneticEmblem.weapons;

public class HolyArrow extends Weapon {

	public HolyArrow() {
		super.setTrinity("Bow");
		super.setTrinity("Light");
		super.setPow(6);
		super.setAcc(85);
		super.setPhys(false);
		super.addTrait("Arrow");
		super.setName("HolyArrow");
	}
}
