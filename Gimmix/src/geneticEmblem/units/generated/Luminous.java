package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Luminosity;

public class Luminous extends Unit {

	public Luminous() {
		this.setJob("Luminous");
		this.setWeapon(new Luminosity());
	    this.setHpBase(22);
	    this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(5);
		this.setDefBase(5);
		this.setResBase(6);

		this.setHpGr(40);
		this.setStrGr(65);
		this.setSkillGr(50);
		this.setSpeedGr(50);
		this.setLuckGr(35);
		this.setDefGr(30);
		this.setResGr(50);

		this.setStrCap(30);
		this.setSkillCap(25);
		this.setSpeedCap(26);
		this.setDefCap(22);
		this.setResCap(27);

	}
	
}
