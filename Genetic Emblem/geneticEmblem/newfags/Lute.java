package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Lute extends Unit {

	public Lute() {
		this.setJob("Lute");
		this.setWeapon(new IronLance());
		this.setHpBase(17);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(6);
		this.setSpeedBase(7);
		this.setLuckBase(8);
		this.setDefBase(3);
		this.setResBase(5);

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