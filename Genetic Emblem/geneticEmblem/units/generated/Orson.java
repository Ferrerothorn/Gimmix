package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronSword;

public class Orson extends Unit {

	public Orson() {
		this.setJob("Orson");
		this.setTrait("Mounted");
		this.setWeapon(new IronSword());
		this.setHpBase(24);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(2);
		this.setSpeedBase(2);
		this.setLuckBase(-1);
		this.setDefBase(1);
		this.setResBase(2);

		this.setHpGr(80);
		this.setStrGr(45);
		this.setSkillGr(45);
		this.setSpeedGr(40);
		this.setLuckGr(25);
		this.setDefGr(45);
		this.setResGr(30);

		this.setStrCap(25);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(25);
		this.setResCap(25);
	}

}