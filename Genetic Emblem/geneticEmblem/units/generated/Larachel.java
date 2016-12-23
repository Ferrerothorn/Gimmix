package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Fire;

public class Larachel extends Unit {

	public Larachel() {
		this.setJob("Larachel");
		this.setWeapon(new Fire());
		this.setHpBase(17);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(5);
		this.setSpeedBase(9);
		this.setLuckBase(11);
		this.setDefBase(5);
		this.setResBase(7);

		this.setHpGr(45);
		this.setStrGr(50);
		this.setSkillGr(45);
		this.setSpeedGr(45);
		this.setLuckGr(65);
		this.setDefGr(15);
		this.setResGr(50);

		this.setStrCap(25);
		this.setSkillCap(24);
		this.setSpeedCap(25);
		this.setDefCap(24);
		this.setResCap(28);
	}
}