package geneticEmblem.weapons;

public class IronGun extends Weapon {

	public IronGun() {
		super.setTrinity("Gun");
		super.setPow(7);
		super.setAcc(70);
		super.setPhys(true);
		super.addTrait("Bullet");
		super.setName("IronGun");
	}
}
