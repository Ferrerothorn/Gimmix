package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Geoffrey extends Unit {

	public Geoffrey() {
		this.setJob("Geoffrey");
		this.setTrait("Mounted");
		this.setWeapon(new IronLance());
		this.setHpBase(24);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(3);
		this.setSkillBase(1);
		this.setSpeedBase(3);
		this.setLuckBase(6);
		this.setDefBase(8);
		this.setResBase(-5);

		this.setHpGr(65);
		this.setStrGr(50);
		this.setSkillGr(55);
		this.setSpeedGr(55);
		this.setLuckGr(20);
		this.setDefGr(45);
		this.setResGr(45);

		this.setStrCap(26);
		this.setSkillCap(26);
		this.setSpeedCap(27);
		this.setDefCap(27);
		this.setResCap(25);
	}
}