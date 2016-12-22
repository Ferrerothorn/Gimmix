package geneticMaple.units.generated;

import geneticMaple.units.factory.Unit;
import geneticMaple.weapons.*;

public class Beggar extends Unit {

	public Beggar() {

		this.setJob("Beggar");
		this.setWeapon(new IronRake());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(6);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(6);
		this.setResBase(5);

		this.setHpGr(45);
		this.setStrGr(55);
		this.setSkillGr(50);
		this.setSpeedGr(60);
		this.setLuckGr(30);
		this.setDefGr(45);
		this.setResGr(30);
	}
}
