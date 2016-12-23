package geneticMaple.units.generated;

import geneticMaple.weapons.Axe;
import geneticMaple.units.factory.Unit;

public class DemonSlayer extends Unit {

	public DemonSlayer() {
		this.setJob("Demon Slayer");
		this.setWeapon(new Axe());
		this.setHpBase(28);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(6);
		this.setSpeedBase(5);
		this.setLuckBase(3);
		this.setDefBase(8);
		this.setResBase(7);

		this.setHpGr(55);
		this.setStrGr(50);
		this.setSkillGr(40);
		this.setSpeedGr(45);
		this.setLuckGr(30);
		this.setDefGr(55);
		this.setResGr(45);
	}
}
