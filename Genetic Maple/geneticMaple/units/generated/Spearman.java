package geneticMaple.units.generated;

import geneticMaple.units.factory.Unit;
import geneticMaple.weapons.Spear;

public class Spearman extends Unit {

	public Spearman() {
		this.setJob("Spearman");
		this.setWeapon(new Spear());
		this.setHpBase(28);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(5);
		this.setDefBase(8);
		this.setResBase(3);

		this.setHpGr(55);
		this.setStrGr(55);
		this.setSkillGr(45);
		this.setSpeedGr(40);
		this.setLuckGr(40);
		this.setDefGr(40);
		this.setResGr(30);
	}
}
