package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronClaw;

public class Assassin extends Unit {

	public Assassin() {
		this.setJob("Assassin");
		this.setWeapon(new IronClaw());
		this.setStrBase(6);
		this.setSkillBase(9);
		this.setSpeedBase(9);
		this.setLuckBase(6);
		this.setDefBase(3);
		this.setResBase(4);

		this.setHpGr(35);
		this.setStrGr(45);
		this.setSkillGr(60);
		this.setSpeedGr(70);
		this.setLuckGr(60);
		this.setDefGr(25);
		this.setResGr(25);

		this.setStrCap(25);
		this.setSkillCap(30);
		this.setSpeedCap(30);
		this.setDefCap(22);
		this.setResCap(23);

	}
	
}
