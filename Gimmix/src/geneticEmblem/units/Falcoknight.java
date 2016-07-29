package geneticEmblem.units;

import geneticEmblem.weapons.*;

public class Falcoknight extends Unit {

	public Falcoknight() {
		this.setJob("Falcoknight");
		this.addTrait("Flying");
		this.setWeapon(new IronLance());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(6);
		this.setSkillBase(8);
		this.setSpeedBase(10);
		this.setLuckBase(7);
		this.setDefBase(4);
		this.setResBase(7);

		this.setHpGr(50);
		this.setStrGr(45);
		this.setSkillGr(45);
		this.setSpeedGr(60);
		this.setLuckGr(55);
		this.setDefGr(22);
		this.setResGr(40);

		this.setStrCap(23);
		this.setSkillCap(25);
		this.setSpeedCap(28);
		this.setDefCap(23);
		this.setResCap(26);
	}

}
