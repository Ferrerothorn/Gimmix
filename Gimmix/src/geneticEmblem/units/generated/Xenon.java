package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.RedWhip;

public class Xenon extends Unit {

	public Xenon() {
		this.setJob("Xenon");
		this.setWeapon(new RedWhip());
	    this.setHpBase(25);
	    this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(8);
		this.setSpeedBase(6);
		this.setLuckBase(4);
		this.setDefBase(6);
		this.setResBase(4);

		this.setHpGr(5);
		this.setStrGr(5);
		this.setSkillGr(5);
		this.setSpeedGr(5);
		this.setLuckGr(5);
		this.setDefGr(5);
		this.setResGr(5);
	}

}
