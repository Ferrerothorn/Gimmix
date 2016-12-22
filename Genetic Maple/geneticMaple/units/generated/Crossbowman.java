package geneticMaple.units.generated;

import geneticMaple.units.factory.Unit;
import geneticMaple.weapons.*;

public class Crossbowman extends Unit {

	public Crossbowman() {

		this.setJob("Crossbowman");
		this.setWeapon(new IronCrossbow());
		this.setHpBase(27);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(7);
		this.setSpeedBase(5);
		this.setLuckBase(3);
		this.setDefBase(7);
		this.setResBase(6);

		this.setHpGr(55);
		this.setStrGr(50);
		this.setSkillGr(60);
		this.setSpeedGr(40);
		this.setLuckGr(30);
		this.setDefGr(45);
		this.setResGr(35);
	}
}
