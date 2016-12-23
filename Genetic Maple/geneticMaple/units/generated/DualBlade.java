package geneticMaple.units.generated;

import geneticMaple.units.factory.Unit;
import geneticMaple.weapons.*;

public class DualBlade extends Unit {

	public DualBlade() {

		this.setJob("Dual Blade");
		this.setWeapon(new Dagger());
		this.setHpBase(23);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(8);
		this.setSpeedBase(8);
		this.setLuckBase(6);
		this.setDefBase(3);
		this.setResBase(3);

		this.setHpGr(30);
		this.setStrGr(55);
		this.setSkillGr(55);
		this.setSpeedGr(60);
		this.setLuckGr(55);
		this.setDefGr(30);
		this.setResGr(30);
	}
}