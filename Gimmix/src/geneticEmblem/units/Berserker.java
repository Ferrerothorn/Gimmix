package geneticEmblem.units;

import geneticEmblem.weapons.*;

public class Berserker extends Unit {

	public Berserker() {
		this.setJob("Berserker");
		this.setWeapon(new IronAxe());
		this.setHpBase(27);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(15);

		this.setStrBase(8);
		this.setSkillBase(6);
		this.setSpeedBase(7);
		this.setLuckBase(4);
		this.setDefBase(4);
		this.setResBase(3);

		this.setHpGr(70);
		this.setStrGr(60);
		this.setSkillGr(35);
		this.setSpeedGr(50);
		this.setLuckGr(25);
		this.setDefGr(25);
		this.setResGr(25);

		this.setStrCap(30);
		this.setSkillCap(29);
		this.setSpeedCap(28);
		this.setDefCap(23);
		this.setResCap(21);
	}
}