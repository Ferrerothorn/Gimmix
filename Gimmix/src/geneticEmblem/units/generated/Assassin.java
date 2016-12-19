package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronClaw;

public class Assassin extends Unit {

	public Assassin() {
		this.setJob("Assassin");
		this.setWeapon(new IronClaw());
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
