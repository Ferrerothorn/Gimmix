package geneticEmblem.weapons;

public class IronShield extends Weapon {

	public IronShield() {
		super.setTrinity("Shield");
		super.setPow(5);
		super.setAcc(100);
		super.setPhys(false);
		super.addTrait("Shield");
		super.setName("IronShield");
	}

}