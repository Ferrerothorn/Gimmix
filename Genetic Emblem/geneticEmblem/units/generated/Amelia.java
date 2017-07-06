package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Amelia extends Unit {

	public Amelia() {
		this.setJob("Amelia");
		this.setWeapon(new IronLance());
		this.setHpBase(24);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(8);
		this.setSpeedBase(9);
		this.setLuckBase(11);
		this.setDefBase(7);
		this.setResBase(5);

		this.setHpGr(60);
		this.setStrGr(35);
		this.setSkillGr(40);
		this.setSpeedGr(40);
		this.setLuckGr(50);
		this.setDefGr(30);
		this.setResGr(15);

		this.setStrCap(27);
		this.setSkillCap(28);
		this.setSpeedCap(25);
		this.setDefCap(29);
		this.setResCap(26);
	}

}