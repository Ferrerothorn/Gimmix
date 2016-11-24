package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Kaiser extends Unit {

	public Kaiser() {

		this.setJob("Kaiser");
		this.setWeapon(new Greatsword());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(7);
		this.setSpeedBase(6);
		this.setLuckBase(5);
		this.setDefBase(7);
		this.setResBase(4);

		this.setHpGr(60);
		this.setStrGr(55);
		this.setSkillGr(55);
		this.setSpeedGr(40);
		this.setLuckGr(25);
		this.setDefGr(50);
		this.setResGr(35);

		this.setStrCap(29);
		this.setSkillCap(26);
		this.setSpeedCap(27);
		this.setDefCap(25);
		this.setResCap(23);
	}
}
