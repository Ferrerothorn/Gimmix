package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronDagger;

public class Bandit extends Unit {

	public Bandit() {
		this.setJob("Bandit");
		this.setWeapon(new IronDagger());
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
		this.setSkillGr(45);
		this.setSpeedGr(60);
		this.setLuckGr(40);
		this.setDefGr(45);
		this.setResGr(40);
	}
}
