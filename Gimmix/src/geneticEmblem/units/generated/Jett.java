package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.RayGun;

public class Jett extends Unit {

	public Jett() {
		this.setJob("Jett");
		this.setWeapon(new RayGun());
	    this.setHpBase(24);
	    this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(8);
		this.setSpeedBase(8);
		this.setLuckBase(5);
		this.setDefBase(8);
		this.setResBase(4);

		this.setHpGr(50);
		this.setStrGr(55);
		this.setSkillGr(55);
		this.setSpeedGr(55);
		this.setLuckGr(30);
		this.setDefGr(40);
		this.setResGr(35);
	}
}
