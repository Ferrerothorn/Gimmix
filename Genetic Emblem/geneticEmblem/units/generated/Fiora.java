package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Fiora extends Unit {

	public Fiora() {
		this.setJob("Fiora");
		this.setWeapon(new IronLance());
		this.setTrait("Mounted");
		this.setTrait("Flying");
		this.setHpBase(17);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(7);
		this.setSpeedBase(10);
		this.setLuckBase(4);
		this.setDefBase(5);
		this.setResBase(4);

		this.setHpGr(70);
		this.setStrGr(35);
		this.setSkillGr(60);
		this.setSpeedGr(50);
		this.setLuckGr(30);
		this.setDefGr(20);
		this.setResGr(50);

		this.setStrCap(23);
		this.setSkillCap(25);
		this.setSpeedCap(28);
		this.setDefCap(23);
		this.setResCap(26);
	}
}