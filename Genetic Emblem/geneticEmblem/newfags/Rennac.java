package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Rennac extends Unit {

	public Rennac() {
		this.setJob("Rennac");
		this.setWeapon(new IronLance());
		this.setHpBase(0);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(0);
		this.setSkillBase(0);
		this.setSpeedBase(0);
		this.setLuckBase(0);
		this.setDefBase(0);
		this.setResBase(0);

		this.setHpGr(65);
		this.setStrGr(25);
		this.setSkillGr(45);
		this.setSpeedGr(60);
		this.setLuckGr(25);
		this.setDefGr(25);
		this.setResGr(30);

		this.setStrCap(20);
		this.setSkillCap(30);
		this.setSpeedCap(30);
		this.setDefCap(20);
		this.setResCap(20);
	}

}