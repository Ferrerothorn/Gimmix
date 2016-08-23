package geneticEmblem.units.ootb;

import geneticEmblem.weapons.*;

public class Valkyrie extends Unit {

	public Valkyrie() {
		this.setJob("Valkyrie");
		this.setWeapon(new Lightning());
		this.setHpBase(22);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(5);
		this.setSkillBase(6);
		this.setSpeedBase(7);
		this.setLuckBase(8);
		this.setDefBase(4);
		this.setResBase(6);

		this.setHpGr(40);
		this.setStrGr(45);
		this.setSkillGr(45);
		this.setSpeedGr(45);
		this.setLuckGr(65);
		this.setDefGr(20);
		this.setResGr(50);

		this.setStrCap(26);
		this.setSkillCap(24);
		this.setSpeedCap(25);
		this.setDefCap(24);
		this.setResCap(29);
	}

}
