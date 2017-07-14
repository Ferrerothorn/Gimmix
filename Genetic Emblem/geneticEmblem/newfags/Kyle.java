package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Kyle extends Unit {

	public Kyle() {
		this.setJob("Kyle");
		this.setWeapon(new IronLance());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(4);
		this.setSpeedBase(5);
		this.setLuckBase(5);
		this.setDefBase(8);
		this.setResBase(0);

		this.setHpGr(85);
		this.setStrGr(50);
		this.setSkillGr(40);
		this.setSpeedGr(40);
		this.setLuckGr(20);
		this.setDefGr(25);
		this.setResGr(20);

		this.setStrCap(28);
		this.setSkillCap(24);
		this.setSpeedCap(24);
		this.setDefCap(29);
		this.setResCap(25);
	}

}