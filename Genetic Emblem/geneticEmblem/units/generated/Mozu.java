package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Mozu extends Unit {

	public Mozu() {
		this.setJob("Mozu");
		this.setWeapon(new IronLance());
		this.setHpBase(16);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(5);
		this.setSpeedBase(7);
		this.setLuckBase(3);
		this.setDefBase(4);
		this.setResBase(1);

		this.setHpGr(50);
		this.setStrGr(60);
		this.setSkillGr(60);
		this.setSpeedGr(60);
		this.setLuckGr(60);
		this.setDefGr(55);
		this.setResGr(35);

		this.setStrCap(33);
		this.setSkillCap(29);
		this.setSpeedCap(28);
		this.setDefCap(33);
		this.setResCap(30);
	}
}