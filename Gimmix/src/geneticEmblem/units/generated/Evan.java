package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Dragon;

public class Evan extends Unit {

	public Evan() {
		this.setJob("Evan");
		this.setWeapon(new Dragon());
	    this.setHpBase(25);
	    this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(6);
		this.setSpeedBase(7);
		this.setLuckBase(4);
		this.setDefBase(5);
		this.setResBase(7);

		this.setHpGr(45);
		this.setStrGr(60);
		this.setSkillGr(45);
		this.setSpeedGr(50);
		this.setLuckGr(45);
		this.setDefGr(35);
		this.setResGr(50);
	}
	
}
