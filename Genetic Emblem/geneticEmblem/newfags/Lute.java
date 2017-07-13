package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Lute extends Unit {

	public Lute() {
		this.setJob("Lute");
		this.setWeapon(new IronLance());
		this.setHpBase(0);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(0);
		this.setSkillBase(0);
		this.setSpeedBase(0);
		this.setLuckBase(0);
		this.setDefBase(0);
		this.setResBase(0);

		this.setHpGr(45);
		this.setStrGr(65);
		this.setSkillGr(30);
		this.setSpeedGr(45);
		this.setLuckGr(45);
		this.setDefGr(15);
		this.setResGr(40);

		this.setStrCap(30);
		this.setSkillCap(28);
		this.setSpeedCap(26);
		this.setDefCap(21);
		this.setResCap(25);
	}

}