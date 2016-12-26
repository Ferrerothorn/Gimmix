package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Franz extends Unit {

	public Franz() {
		this.setJob("Franz");
		this.setWeapon(new IronLance());
		this.setTrait("Mounted");
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(5);
		this.setSpeedBase(7);
		this.setLuckBase(2);
		this.setDefBase(6);
		this.setResBase(1);

		this.setHpGr(80);
		this.setStrGr(40);
		this.setSkillGr(40);
		this.setSpeedGr(50);
		this.setLuckGr(40);
		this.setDefGr(25);
		this.setResGr(20);

		this.setStrCap(25);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(25);
		this.setResCap(25);
	}

}