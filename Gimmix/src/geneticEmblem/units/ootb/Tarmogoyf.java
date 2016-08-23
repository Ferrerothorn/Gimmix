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
		this.setSkillBase(5);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(7);
		this.setResBase(6);

		this.setHpGr(55);
		this.setStrGr(45);
		this.setSkillGr(40);
		this.setSpeedGr(40);
		this.setLuckGr(40);
		this.setDefGr(45);
		this.setResGr(45);

		this.setStrCap(26);
		this.setSkillCap(25);
		this.setSpeedCap(23);
		this.setDefCap(29);
		this.setResCap(28);
	}

}
