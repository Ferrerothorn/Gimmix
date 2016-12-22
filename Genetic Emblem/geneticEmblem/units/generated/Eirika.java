package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronSword;

public class Eirika extends Unit {

	public Eirika() {
		this.setJob("Eirika");
		this.setWeapon(new IronSword());
		this.setHpBase(16);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(4);
		this.setSkillBase(8);
		this.setSpeedBase(9);
		this.setLuckBase(5);
		this.setDefBase(3);
		this.setResBase(1);

		this.setHpGr(70);
		this.setStrGr(40);
		this.setSkillGr(60);
		this.setSpeedGr(60);
		this.setLuckGr(60);
		this.setDefGr(30);
		this.setResGr(30);

		this.setStrCap(24);
		this.setSkillCap(29);
		this.setSpeedCap(30);
		this.setDefCap(22);
		this.setResCap(25);
	}

}