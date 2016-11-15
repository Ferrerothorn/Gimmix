package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronDagger;

public class Bandit extends Unit {

	public Bandit() {
		this.setJob("Bandit");
		this.setWeapon(new IronDagger());
	    this.setHpBase(21);
	    this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(7);
		this.setSpeedBase(7);
		this.setLuckBase(6);
		this.setDefBase(6);
		this.setResBase(5);

		this.setHpGr(45);
		this.setStrGr(50);
		this.setSkillGr(50);
		this.setSpeedGr(50);
		this.setLuckGr(40);
		this.setDefGr(50);
		this.setResGr(35);

		this.setStrCap(27);
		this.setSkillCap(28);
		this.setSpeedCap(27);
		this.setDefCap(25);
		this.setResCap(23);

	}

}
