package geneticEmblem.units.ootb;

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
		this.setSkillBase(7);
		this.setSpeedBase(9);
		this.setLuckBase(6);
		this.setDefBase(3);
		this.setResBase(5);

		this.setHpGr(45);
		this.setStrGr(40);
		this.setSkillGr(45);
		this.setSpeedGr(60);
		this.setLuckGr(55);
		this.setDefGr(25);
		this.setResGr(40);

		this.setStrCap(23);
		this.setSkillCap(27);
		this.setSpeedCap(28);
		this.setDefCap(23);
		this.setResCap(27);
	}

}
