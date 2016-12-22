package geneticMaple.units.generated;

import geneticMaple.units.factory.Unit;
import geneticMaple.weapons.*;

public class Aran extends Unit {

	public Aran() {

		this.setJob("Aran");
		this.setWeapon(new IronLance());
		this.setHpBase(28);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(7);
		this.setSpeedBase(6);
		this.setLuckBase(4);
		this.setDefBase(7);
		this.setResBase(4);

		this.setHpGr(55);
		this.setStrGr(50);
		this.setSkillGr(45);
		this.setSpeedGr(40);
		this.setLuckGr(40);
		this.setDefGr(50);
		this.setResGr(35);
	}
}
