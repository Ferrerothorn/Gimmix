package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Kaiser extends Unit {

	public Kaiser() {

		this.setJob("Kaiser");
		this.setWeapon(new Greatsword());
		this.setHpBase(28);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(5);
		this.setSpeedBase(6);
		this.setLuckBase(5);
		this.setDefBase(8);
		this.setResBase(3);

		this.setHpGr(55);
		this.setStrGr(65);
		this.setSkillGr(50);
		this.setSpeedGr(45);
		this.setLuckGr(30);
		this.setDefGr(50);
		this.setResGr(35);
	}
}
