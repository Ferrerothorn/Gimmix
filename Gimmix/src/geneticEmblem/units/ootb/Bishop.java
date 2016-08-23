package geneticEmblem.units.ootb;

import geneticEmblem.weapons.*;

public class Bishop extends Unit {

	public Bishop() {
		this.setJob("Bishop");
		this.setWeapon(new Shine());
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(7);
		this.setSkillBase(8);
		this.setSpeedBase(8);
		this.setLuckBase(4);
		this.setDefBase(2);
		this.setResBase(7);

		this.setHpGr(50);
		this.setStrGr(45);
		this.setSkillGr(50);
		this.setSpeedGr(40);
		this.setLuckGr(35);
		this.setDefGr(30);
		this.setResGr(60);

		this.setStrCap(25);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(22);
		this.setResCap(30);
	}
}
