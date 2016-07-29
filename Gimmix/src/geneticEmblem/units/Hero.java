package geneticEmblem.units;

import Weapons.IronSword;

public class Hero extends Unit {

	public Hero() {
		this.setJob("Hero");
		this.setWeapon(new IronSword());
		this.setHpBase(27);
		this.setCurrentHp(this.getHpBase());

		this.setStrBase(7);
		this.setSkillBase(9);
		this.setSpeedBase(8);
		this.setLuckBase(4);
		this.setDefBase(6);
		this.setResBase(2);

		this.setHpGr(80);
		this.setStrGr(45);
		this.setSkillGr(45);
		this.setSpeedGr(40);
		this.setLuckGr(30);
		this.setDefGr(42);
		this.setResGr(28);

		this.setStrCap(25);
		this.setSkillCap(30);
		this.setSpeedCap(26);
		this.setDefCap(25);
		this.setResCap(22);
	}
}