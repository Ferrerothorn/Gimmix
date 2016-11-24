package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Gunslinger extends Unit {

	public Gunslinger() {

		this.setJob("Gunslinger");
		this.setWeapon(new IronGun());
		this.setHpBase(25);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(9);
		this.setSpeedBase(8);
		this.setLuckBase(6);
		this.setDefBase(5);
		this.setResBase(2);

		this.setHpGr(45);
		this.setStrGr(55);
		this.setSkillGr(55);
		this.setSpeedGr(55);
		this.setLuckGr(40);
		this.setDefGr(45);
		this.setResGr(25);

		this.setStrCap(25);
		this.setSkillCap(30);
		this.setSpeedCap(23);
		this.setDefCap(27);
		this.setResCap(25);
	}
}
