package geneticEmblem.units.ootb;

import geneticEmblem.weapons.*;

public class Druid extends Unit {

	public Druid() {
		this.setJob("Druid");
		this.setWeapon(new Luna());
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(8);
		this.setSkillBase(7);
		this.setSpeedBase(6);
		this.setLuckBase(5);
		this.setDefBase(4);
		this.setResBase(6);

		this.setHpGr(70);
		this.setStrGr(45);
		this.setSkillGr(40);
		this.setSpeedGr(35);
		this.setLuckGr(50);
		this.setDefGr(25);
		this.setResGr(45);

		this.setStrCap(29);
		this.setSkillCap(27);
		this.setSpeedCap(26);
		this.setDefCap(21);
		this.setResCap(28);
	}

}
