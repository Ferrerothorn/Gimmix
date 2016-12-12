package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class DualBlade extends Unit {

	public DualBlade() {

		this.setJob("Dual Blade");
		this.setWeapon(new IronDagger());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(9);
		this.setSpeedBase(10);
		this.setLuckBase(6);
		this.setDefBase(4);
		this.setResBase(4);

		this.setHpGr(40);
		this.setStrGr(60);
		this.setSkillGr(60);
		this.setSpeedGr(60);
		this.setLuckGr(40);
		this.setDefGr(40);
		this.setResGr(30);
	}
}
