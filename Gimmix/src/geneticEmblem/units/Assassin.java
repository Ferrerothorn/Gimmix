package geneticEmblem.units;

import geneticEmblem.weapons.*;

public class Assassin extends Unit {

	public Assassin() {
		this.setJob("Assassin");
		this.setWeapon(new IronSword());
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(6);
		this.setSkillBase(10);
		this.setSpeedBase(10);
		this.setLuckBase(6);
		this.setDefBase(5);
		this.setResBase(2);

		this.setHpGr(65);
		this.setStrGr(33);
		this.setSkillGr(50);
		this.setSpeedGr(50);
		this.setLuckGr(33);
		this.setDefGr(30);
		this.setResGr(30);

		this.setStrCap(20);
		this.setSkillCap(30);
		this.setSpeedCap(30);
		this.setDefCap(20);
		this.setResCap(20);
	}

}
