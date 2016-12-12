package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronDagger;

public class Bandit extends Unit {

	public Bandit() {
		this.setJob("Bandit");
		this.setWeapon(new IronDagger());
	    this.setHpBase(24);
	    this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(9);
		this.setSpeedBase(8);
		this.setLuckBase(6);
		this.setDefBase(7);
		this.setResBase(5);

		this.setHpGr(45);
		this.setStrGr(55);
		this.setSkillGr(45);
		this.setSpeedGr(60);
		this.setLuckGr(40);
		this.setDefGr(45);
		this.setResGr(40);
	}
}
