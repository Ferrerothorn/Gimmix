package geneticMaple.units.generated;

import geneticMaple.units.factory.Unit;
import geneticMaple.weapons.*;

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

		this.setHpGr(60);
		this.setStrGr(55);
		this.setSkillGr(35);
		this.setSpeedGr(40);
		this.setLuckGr(30);
		this.setDefGr(55);
		this.setResGr(40);
	}
}
