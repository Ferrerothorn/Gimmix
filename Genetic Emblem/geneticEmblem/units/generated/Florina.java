package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Florina extends Unit {

	public Florina() {
		this.setJob("Florina");
		this.setWeapon(new IronLance());
		this.setTrait("Mounted");
		this.setTrait("Flying");
		this.setHpBase(17);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(7);
		this.setSpeedBase(9);
		this.setLuckBase(7);
		this.setDefBase(4);
		this.setResBase(4);

		this.setHpGr(60);
		this.setStrGr(40);
		this.setSkillGr(50);
		this.setSpeedGr(55);
		this.setLuckGr(50);
		this.setDefGr(15);
		this.setResGr(35);

		this.setStrCap(23);
		this.setSkillCap(25);
		this.setSpeedCap(28);
		this.setDefCap(23);
		this.setResCap(26);
	}
}