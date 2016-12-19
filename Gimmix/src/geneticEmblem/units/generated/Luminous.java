package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Luminosity;

public class Luminous extends Unit {

	public Luminous() {
		this.setJob("Luminous");
		this.setWeapon(new Luminosity());
	    this.setHpBase(24);
	    this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(5);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(3);
		this.setResBase(8);

		this.setHpGr(35);
		this.setStrGr(55);
		this.setSkillGr(35);
		this.setSpeedGr(50);
		this.setLuckGr(55);
		this.setDefGr(35);
		this.setResGr(50);
	}
}
