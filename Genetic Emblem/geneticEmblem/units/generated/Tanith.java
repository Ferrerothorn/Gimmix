package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Tanith extends Unit {

	public Tanith() {
		this.setJob("Tanith");
		this.setWeapon(new IronLance());
		this.setTrait("Mounted");
		this.setTrait("Flying");
		this.setHpBase(15);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(4);
		this.setSkillBase(-2);
		this.setSpeedBase(12);
		this.setLuckBase(9);
		this.setDefBase(8);
		this.setResBase(4);

		this.setHpGr(60);
		this.setStrGr(40);
		this.setSkillGr(70);
		this.setSpeedGr(40);
		this.setLuckGr(30);
		this.setDefGr(25);
		this.setResGr(30);

		this.setStrCap(23);
		this.setSkillCap(26);
		this.setSpeedCap(28);
		this.setDefCap(24);
		this.setResCap(27);
	}
}