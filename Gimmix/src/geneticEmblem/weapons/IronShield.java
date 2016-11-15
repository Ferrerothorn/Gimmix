package geneticEmblem.weapons;

public class IronShield extends Weapon {

	public IronShield() {
		super.setTrinity("Melee");
		super.setPow(5);
		super.setAcc(100);
		super.setPhys(true);
		super.addTrait("Shield");
		super.setName("IronShield");
	}

}