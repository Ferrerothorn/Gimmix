package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;
import geneticEmblem.weapons.SilverSword;

public class Rennac extends Unit {

	public Rennac() {
		this.setJob("Rennac");
		this.setWeapon(new SilverSword());
		this.setHpBase(16);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(7);
		this.setSpeedBase(6);
		this.setLuckBase(0);
		this.setDefBase(4);
		this.setResBase(5);

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