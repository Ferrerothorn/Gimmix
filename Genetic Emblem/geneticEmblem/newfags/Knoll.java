package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Knoll extends Unit {

	public Knoll() {
		this.setJob("Knoll");
		this.setWeapon(new IronLance());
		this.setHpBase(0);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(0);
		this.setSkillBase(0);
		this.setSpeedBase(0);
		this.setLuckBase(0);
		this.setDefBase(0);
		this.setResBase(0);

		this.setHpGr(70);
		this.setStrGr(50);
		this.setSkillGr(40);
		this.setSpeedGr(35);
		this.setLuckGr(20);
		this.setDefGr(10);
		this.setResGr(45);

		this.setStrCap(29);
		this.setSkillCap(26);
		this.setSpeedCap(26);
		this.setDefCap(21);
		this.setResCap(28);
	}

}