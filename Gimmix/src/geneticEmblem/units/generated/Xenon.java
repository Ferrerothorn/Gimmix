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

		this.setHpGr(40);
		this.setStrGr(50);
		this.setSkillGr(60);
		this.setSpeedGr(55);
		this.setLuckGr(40);
		this.setDefGr(45);
		this.setResGr(40);
	}

}
