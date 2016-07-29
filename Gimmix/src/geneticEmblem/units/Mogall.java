package geneticEmblem.units;

import geneticEmblem.weapons.*;

public class Mogall extends Unit {

	public Mogall() {
		this.setJob("Mogall");
		this.setWeapon(new Flux());
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(8);
		this.setSkillBase(4);
		this.setSpeedBase(8);
		this.setLuckBase(3);
		this.setDefBase(4);
		this.setResBase(8);

		this.setHpGr(45);
		this.setStrGr(55);
		this.setSkillGr(35);
		this.setSpeedGr(55);
		this.setLuckGr(30);
		this.setDefGr(20);
		this.setResGr(55);

		this.setStrCap(29);
		this.setSkillCap(26);
		this.setSpeedCap(26);
		this.setDefCap(20);
		this.setResCap(29);
	}
}
