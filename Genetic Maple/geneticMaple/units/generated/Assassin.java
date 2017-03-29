package geneticMaple.units.generated;

import geneticMaple.units.factory.Unit;
import geneticMaple.weapons.Claw;

public class Assassin extends Unit {

	public Assassin() {
		this.setJob("Assassin");
		this.setWeapon(new Claw());
		this.setHpBase(25);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(8);
		this.setSpeedBase(8);
		this.setLuckBase(7);
		this.setDefBase(3);
		this.setResBase(2);

		this.setHpGr(40);
		this.setStrGr(55);
		this.setSkillGr(45);
		this.setSpeedGr(55);
		this.setLuckGr(60);
		this.setDefGr(30);
		this.setResGr(30);
	}
}
