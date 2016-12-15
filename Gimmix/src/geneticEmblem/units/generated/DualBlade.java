package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class DualBlade extends Unit {

	public DualBlade() {

		this.setJob("Dual Blade");
		this.setWeapon(new IronDagger());
		this.setHpBase(23);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(8);
		this.setSpeedBase(8);
		this.setLuckBase(6);
		this.setDefBase(3);
		this.setResBase(3);

		this.setHpGr(30);
		this.setStrGr(60);
		this.setSkillGr(60);
		this.setSpeedGr(60);
		this.setLuckGr(60);
		this.setDefGr(30);
		this.setResGr(30);
	}
}
