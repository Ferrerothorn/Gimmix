package geneticEmblem.units;

import geneticEmblem.weapons.*;

public class Soldier extends Unit {

	public Soldier() {
		this.setJob("Soldier");
		this.setWeapon(new IronLance());
		this.setHpBase(23);
		this.setCurrentHp(this.getHpBase());

		this.setStrBase(7);
		this.setSkillBase(8);
		this.setSpeedBase(8);
		this.setLuckBase(5);
		this.setDefBase(6);
		this.setResBase(2);

		this.setHpGr(51);
		this.setStrGr(51);
		this.setSkillGr(51);
		this.setSpeedGr(51);
		this.setLuckGr(30);
		this.setDefGr(48);
		this.setResGr(28);

		this.setStrCap(25);
		this.setSkillCap(28);
		this.setSpeedCap(26);
		this.setDefCap(28);
		this.setResCap(25);
	}

}
