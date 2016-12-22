package geneticMaple.units.generated;

import geneticMaple.units.factory.Unit;
import geneticMaple.weapons.*;

public class Captain extends Unit {

	public Captain() {

		this.setJob("Captain");
		this.setWeapon(new IronGun());
		this.setHpBase(25);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(7);
		this.setSpeedBase(7);
		this.setLuckBase(4);
		this.setDefBase(7);
		this.setResBase(4);

		this.setHpGr(40);
		this.setStrGr(50);
		this.setSkillGr(60);
		this.setSpeedGr(40);
		this.setLuckGr(35);
		this.setDefGr(50);
		this.setResGr(40);
	}
}
