package geneticEmblem.units.ootb;

import geneticEmblem.weapons.*;

public class Tarmogoyf extends Unit {

	public Tarmogoyf() {
		this.setJob("Tarmogoyf");
		this.setWeapon(new SharpClaw());
		this.setHpBase(25);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(10);

		this.setStrBase(6);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(4);
		this.setDefBase(7);
		this.setResBase(7);

		this.setHpGr(55);
		this.setStrGr(45);
		this.setSkillGr(35);
		this.setSpeedGr(35);
		this.setLuckGr(40);
		this.setDefGr(50);
		this.setResGr(50);

		this.setStrCap(26);
		this.setSkillCap(25);
		this.setSpeedCap(23);
		this.setDefCap(29);
		this.setResCap(28);
	}

}
