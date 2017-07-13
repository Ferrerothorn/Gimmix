package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Innes extends Unit {

	public Innes() {
		this.setJob("Innes");
		this.setWeapon(new IronLance());
		this.setHpBase(0);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(0);
		this.setSkillBase(0);
		this.setSpeedBase(0);
		this.setLuckBase(0);
		this.setDefBase(0);
		this.setResBase(0);

		this.setHpGr(75);
		this.setStrGr(40);
		this.setSkillGr(40);
		this.setSpeedGr(45);
		this.setLuckGr(45);
		this.setDefGr(20);
		this.setResGr(25);

		this.setStrCap(25);
		this.setSkillCap(30);
		this.setSpeedCap(28);
		this.setDefCap(25);
		this.setResCap(23);
	}

}