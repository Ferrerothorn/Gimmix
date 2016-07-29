package geneticEmblem.weapons;

public class Nosferatu extends Weapon {

	public Nosferatu() {
		super.setTrinity("Dark");
		super.setPow(10);
		super.setAcc(70);
		super.setPhys(false);
		super.addTrait("Lifelink");
	}

}
