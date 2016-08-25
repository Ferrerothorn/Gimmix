package geneticEmblem.units.ootb;

import geneticEmblem.weapons.*;

public class KilnFiend extends Unit {

	public KilnFiend() {
		this.setJob("Kiln Fiend");
		this.setWeapon(new FireClaw());
		this.setHpBase(22);
		this.setCurrentHp(this.getHpBase());

		this.setStrBase(6);
		this.setSkillBase(9);
		this.setSpeedBase(9);
		this.setLuckBase(5);
		this.setDefBase(4);
		this.setResBase(3);

		this.setHpGr(45);
		this.setStrGr(50);
		this.setSkillGr(55);
		this.setSpeedGr(60);
		this.setLuckGr(40);
		this.setDefGr(35);
		this.setResGr(25);

		this.setStrCap(26);
		this.setSkillCap(25);
		this.setSpeedCap(30);
		this.setDefCap(25);
		this.setResCap(22);
	}
}
