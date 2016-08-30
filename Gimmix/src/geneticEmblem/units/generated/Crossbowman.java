package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Crossbowman extends Unit {

	public Crossbowman() {

		this.setJob("Crossbowman");

		this.setWeapon(new DualBowgun());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(9);
		this.setSpeedBase(9);
		this.setLuckBase(6);
		this.setDefBase(5);
		this.setResBase(3);

		this.setHpGr(40);
		this.setStrGr(65);
		this.setSkillGr(30);
		this.setSpeedGr(55);
		this.setLuckGr(25);
		this.setDefGr(55);
		this.setResGr(50);

		this.setStrCap(26);
		this.setSkillCap(25);
		this.setSpeedCap(27);
		this.setDefCap(28);
		this.setResCap(21);
	}
}