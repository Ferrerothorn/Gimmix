package geneticEmblem.weapons;

public class IronGear extends Weapon {

	public IronGear() {
		super.setTrinity("Bow");
		super.setTrinity("Sword");
		super.setPow(6);
		super.setAcc(90);
		super.setPhys(true);
		super.addTrait("Arrow");
		super.setName("IronGear");
	}
}
