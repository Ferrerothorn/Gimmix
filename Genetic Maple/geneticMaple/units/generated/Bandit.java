package geneticMaple.units.generated;

import geneticMaple.units.factory.Unit;
import geneticMaple.weapons.Dagger;

public class Bandit extends Unit {

	public Bandit() {
		this.setJob("Bandit");
		this.setWeapon(new Dagger());
	    this.setHpBase(26);
	    this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(6);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(6);
		this.setResBase(5);

		this.setHpGr(45);
		this.setStrGr(40);
		this.setSkillGr(50);
		this.setSpeedGr(50);
		this.setLuckGr(45);
		this.setDefGr(50);
		this.setResGr(35);
	}
}
