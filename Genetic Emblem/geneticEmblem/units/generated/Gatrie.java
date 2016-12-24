package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Gatrie extends Unit {

	public Gatrie() {
		this.setJob("Gatrie");
		this.setWeapon(new IronLance());
		this.setHpBase(25);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(2);
		this.setSpeedBase(3);
		this.setLuckBase(3);
		this.setDefBase(9);
		this.setResBase(-2);

		this.setHpGr(80);
		this.setStrGr(55);
		this.setSkillGr(55);
		this.setSpeedGr(25);
		this.setLuckGr(25);
		this.setDefGr(60);
		this.setResGr(30);

		this.setStrCap(29);
		this.setSkillCap(27);
		this.setSpeedCap(24);
		this.setDefCap(30);
		this.setResCap(25);
	}
}