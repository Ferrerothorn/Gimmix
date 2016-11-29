package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.RayGun;

public class Jett extends Unit {

	public Jett() {
		this.setJob("Jett");
		this.setWeapon(new RayGun());
	    this.setHpBase(24);
	    this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(7);
		this.setSpeedBase(7);
		this.setLuckBase(6);
		this.setDefBase(6);
		this.setResBase(5);

		this.setHpGr(50);
		this.setStrGr(50);
		this.setSkillGr(45);
		this.setSpeedGr(50);
		this.setLuckGr(35);
		this.setDefGr(45);
		this.setResGr(45);

		this.setStrCap(27);
		this.setSkillCap(26);
		this.setSpeedCap(26);
		this.setDefCap(26);
		this.setResCap(25);

	}

}
