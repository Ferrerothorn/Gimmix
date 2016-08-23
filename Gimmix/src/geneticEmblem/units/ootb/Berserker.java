package geneticEmblem.units.ootb;

import geneticEmblem.weapons.*;

public class Berserker extends Unit {

	public Berserker() {
		this.setJob("Berserker");
		this.setWeapon(new IronAxe());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(10);

		this.setStrBase(10);
		this.setSkillBase(7);
		this.setSpeedBase(8);
		this.setLuckBase(5);
		this.setDefBase(5);
		this.setResBase(1);

		this.setHpGr(75);
		this.setStrGr(60);
		this.setSkillGr(35);
		this.setSpeedGr(50);
		this.setLuckGr(30);
		this.setDefGr(35);
		this.setResGr(25);

		this.setStrCap(30);
		this.setSkillCap(29);
		this.setSpeedCap(28);
		this.setDefCap(23);
		this.setResCap(21);
	}
}