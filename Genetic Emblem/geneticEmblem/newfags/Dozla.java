package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Dozla extends Unit {

	public Dozla() {
		this.setJob("Dozla");
		this.setWeapon(new IronLance());
		this.setHpBase(0);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(0);
		this.setSkillBase(0);
		this.setSpeedBase(0);
		this.setLuckBase(0);
		this.setDefBase(0);
		this.setResBase(0);

		this.setHpGr(85);
		this.setStrGr(50);
		this.setSkillGr(35);
		this.setSpeedGr(40);
		this.setLuckGr(30);
		this.setDefGr(30);
		this.setResGr(25);

		this.setStrCap(30);
		this.setSkillCap(29);
		this.setSpeedCap(28);
		this.setDefCap(23);
		this.setResCap(21);
	}
}