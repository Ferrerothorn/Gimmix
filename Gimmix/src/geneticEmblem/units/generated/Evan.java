package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Dragon;

public class Evan extends Unit {

	public Evan() {
		this.setJob("Evan");
		this.setWeapon(new Dragon());
	    this.setHpBase(21);
	    this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(7);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(4);
		this.setResBase(7);

		this.setHpGr(35);
		this.setStrGr(60);
		this.setSkillGr(45);
		this.setSpeedGr(50);
		this.setLuckGr(45);
		this.setDefGr(35);
		this.setResGr(50);

		this.setStrCap(29);
		this.setSkillCap(26);
		this.setSpeedCap(26);
		this.setDefCap(21);
		this.setResCap(28);

	}
	
}
