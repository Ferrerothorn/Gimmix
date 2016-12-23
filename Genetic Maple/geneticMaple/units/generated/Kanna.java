package geneticMaple.units.generated;

import geneticMaple.units.factory.Unit;
import geneticMaple.weapons.Fan;

public class Kanna extends Unit {

	public Kanna() {
		this.setJob("Kanna");
		this.setWeapon(new Fan());
	    this.setHpBase(23);
	    this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(5);
		this.setSpeedBase(8);
		this.setLuckBase(6);
		this.setDefBase(3);
		this.setResBase(6);

		this.setHpGr(35);
		this.setStrGr(55);
		this.setSkillGr(40);
		this.setSpeedGr(55);
		this.setLuckGr(50);
		this.setDefGr(25);
		this.setResGr(55);
	}
}
