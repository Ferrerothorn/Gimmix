package geneticEmblem.units.ootb;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Soldier extends Unit {

	public Soldier() {
		this.setJob("Soldier");
		this.setWeapon(new IronLance());
		this.setHpBase(23);
		this.setCurrentHp(this.getHpBase());

		this.setStrBase(7);
		this.setSkillBase(8);
		this.setSpeedBase(8);
		this.setLuckBase(5);
		this.setDefBase(6);
		this.setResBase(2);

		this.setHpGr(52);
		this.setStrGr(52);
		this.setSkillGr(55);
		this.setSpeedGr(55);
		this.setLuckGr(30);
		this.setDefGr(52);
		this.setResGr(24);

		this.setStrCap(25);
		this.setSkillCap(28);
		this.setSpeedCap(26);
		this.setDefCap(28);
		this.setResCap(24);
	}

}
