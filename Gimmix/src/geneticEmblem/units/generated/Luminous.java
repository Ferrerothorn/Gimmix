package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Luminosity;

public class Luminous extends Unit {

	public Luminous() {
		this.setJob("Luminous");
		this.setWeapon(new Luminosity());
	    this.setHpBase(22);
	    this.setCurrentHp(this.getHpBase());
		this.setStrBase(10);
		this.setSkillBase(6);
		this.setSpeedBase(8);
		this.setLuckBase(5);
		this.setDefBase(5);
		this.setResBase(7);

		this.setHpGr(40);
		this.setStrGr(65);
		this.setSkillGr(45);
		this.setSpeedGr(55);
		this.setLuckGr(40);
		this.setDefGr(35);
		this.setResGr(50);

		this.setStrCap(30);
		this.setSkillCap(25);
		this.setSpeedCap(26);
		this.setDefCap(22);
		this.setResCap(27);

	}
	
}
