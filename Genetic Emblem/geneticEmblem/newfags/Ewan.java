package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Ewan extends Unit {

	public Ewan() {
		this.setJob("Ewan");
		this.setWeapon(new IronLance());
		this.setHpBase(0);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(0);
		this.setSkillBase(0);
		this.setSpeedBase(0);
		this.setLuckBase(0);
		this.setDefBase(0);
		this.setResBase(0);

		this.setHpGr(50);
		this.setStrGr(45);
		this.setSkillGr(40);
		this.setSpeedGr(35);
		this.setLuckGr(50);
		this.setDefGr(15);
		this.setResGr(40);

		this.setStrCap(29);
		this.setSkillCap(26);
		this.setSpeedCap(26);
		this.setDefCap(21);
		this.setResCap(28);
	}

}