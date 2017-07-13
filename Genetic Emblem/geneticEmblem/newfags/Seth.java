package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Seth extends Unit {

	public Seth() {
		this.setJob("Seth");
		this.setWeapon(new IronLance());
		this.setHpBase(0);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(0);
		this.setSkillBase(0);
		this.setSpeedBase(0);
		this.setLuckBase(0);
		this.setDefBase(0);
		this.setResBase(0);

		this.setHpGr(90);
		this.setStrGr(50);
		this.setSkillGr(45);
		this.setSpeedGr(45);
		this.setLuckGr(25);
		this.setDefGr(40);
		this.setResGr(30);

		this.setStrCap(25);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(25);
		this.setResCap(25);
	}

}