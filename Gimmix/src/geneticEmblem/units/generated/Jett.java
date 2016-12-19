package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.RayGun;

public class Jett extends Unit {

	public Jett() {
		this.setJob("Jett");
		this.setWeapon(new RayGun());
	    this.setHpBase(24);
	    this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(7);
		this.setSpeedBase(6);
		this.setLuckBase(3);
		this.setDefBase(7);
		this.setResBase(7);

		this.setHpGr(35);
		this.setStrGr(40);
		this.setSkillGr(40);
		this.setSpeedGr(40);
		this.setLuckGr(40);
		this.setDefGr(60);
		this.setResGr(60);
	}
}
