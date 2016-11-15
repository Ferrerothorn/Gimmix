package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Kaiser extends Unit {

	public Kaiser() {

		this.setJob("Kaiser");
		this.setWeapon(new Greatsword());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(6);
		this.setDefBase(5);
		this.setResBase(5);

		this.setHpGr(25);
		this.setStrGr(65);
		this.setSkillGr(50);
		this.setSpeedGr(55);
		this.setLuckGr(75);
		this.setDefGr(30);
		this.setResGr(20);

		this.setStrCap(29);
		this.setSkillCap(26);
		this.setSpeedCap(27);
		this.setDefCap(25);
		this.setResCap(23);
	}
}
