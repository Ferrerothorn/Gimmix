package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class General extends Unit {

	public General() {
		this.setJob("General");
		this.setWeapon(new IronLance());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(8);
		this.setSkillBase(8);
		this.setSpeedBase(5);
		this.setLuckBase(5);
		this.setDefBase(8);
		this.setResBase(2);

		this.setHpGr(60);
		this.setStrGr(55);
		this.setSkillGr(45);
		this.setSpeedGr(35);
		this.setLuckGr(40);
		this.setDefGr(60);
		this.setResGr(25);

		this.setStrCap(27);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(30);
		this.setResCap(24);
	}

}
