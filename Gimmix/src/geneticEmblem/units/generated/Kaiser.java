package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Kaiser extends Unit {

	public Kaiser() {

		this.setJob("Kaiser");
		this.setWeapon(new Greatsword());
		this.setHpBase(25);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(8);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(7);
		this.setResBase(5);

		this.setHpGr(55);
		this.setStrGr(65);
		this.setSkillGr(50);
		this.setSpeedGr(45);
		this.setLuckGr(30);
		this.setDefGr(50);
		this.setResGr(35);
	}
}
