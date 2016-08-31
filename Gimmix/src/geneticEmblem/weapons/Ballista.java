package geneticEmblem.weapons;

public class Ballista extends Weapon {

	public Ballista() {
		super.setTrinity("Lance");
		super.setTrinity("Bow");
		super.setPow(9);
		super.setAcc(65);
		super.setPhys(true);
		super.addTrait("Arrow");
		super.setName("Ballista");
	}
}
