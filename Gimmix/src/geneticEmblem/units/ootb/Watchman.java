package geneticEmblem.units.ootb;

import geneticEmblem.weapons.*;

public class Watchman extends Unit {

	public Watchman() {
		this.setJob("Watchman");
		this.setWeapon(new IronShield());
		this.setHpBase(24);
		this.setCurrentHp(this.getHpBase());

		this.setStrBase(7);
		this.setSkillBase(8);
		this.setSpeedBase(7);
		this.setLuckBase(4);
		this.setDefBase(7);
		this.setResBase(3);

		this.setHpGr(48);
		this.setStrGr(45);
		this.setSkillGr(48);
		this.setSpeedGr(45);
		this.setLuckGr(40);
		this.setDefGr(48);
		this.setResGr(36);

		this.setStrCap(25);
		this.setSkillCap(29);
		this.setSpeedCap(24);
		this.setDefCap(29);
		this.setResCap(24);
	}

}