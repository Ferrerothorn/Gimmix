package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.RedWhip;

public class Xenon extends Unit {

	public Xenon() {
		this.setJob("Xenon");
		this.setWeapon(new RedWhip());
	    this.setHpBase(21);
	    this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(7);
		this.setSpeedBase(8);
		this.setLuckBase(4);
		this.setDefBase(5);
		this.setResBase(5);

		this.setHpGr(40);
		this.setStrGr(55);
		this.setSkillGr(55);
		this.setSpeedGr(55);
		this.setLuckGr(35);
		this.setDefGr(40);
		this.setResGr(40);

		this.setStrCap(27);
		this.setSkillCap(27);
		this.setSpeedCap(27);
		this.setDefCap(25);
		this.setResCap(24);

	}

}
