package geneticEmblem.units.ootb;

import geneticEmblem.weapons.*;

public class MageKnight extends Unit {

	public MageKnight() {
		this.setJob("Mage Knight");
		this.setWeapon(new Thunder());
		this.setHpBase(22);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(6);
		this.setSkillBase(7);
		this.setSpeedBase(7);
		this.setLuckBase(7);
		this.setDefBase(3);
		this.setResBase(6);

		this.setHpGr(40);
		this.setStrGr(50);
		this.setSkillGr(45);
		this.setSpeedGr(45);
		this.setLuckGr(65);
		this.setDefGr(20);
		this.setResGr(45);

		this.setStrCap(26);
		this.setSkillCap(24);
		this.setSpeedCap(25);
		this.setDefCap(24);
		this.setResCap(29);
	}

}
