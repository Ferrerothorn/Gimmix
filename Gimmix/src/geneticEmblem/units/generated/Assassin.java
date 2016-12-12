package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronClaw;

public class Assassin extends Unit {

	public Assassin() {
		this.setJob("Assassin");
		this.setWeapon(new IronClaw());
	    this.setHpBase(21);
	    this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(9);
		this.setSpeedBase(9);
		this.setLuckBase(6);
		this.setDefBase(5);
		this.setResBase(3);

		this.setHpGr(40);
		this.setStrGr(60);
		this.setSkillGr(60);
		this.setSpeedGr(60);
		this.setLuckGr(40);
		this.setDefGr(40);
		this.setResGr(30);
	}
}
