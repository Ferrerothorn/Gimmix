package geneticEmblem.units.generated;

import geneticEmblem.units.ootb.Unit;
import geneticEmblem.weapons.*;

public class Lancemaster extends Unit {

	public Lancemaster() {

		this.setJob("Lancemaster");

		this.setWeapon(new IronLance());
		this.setHpBase(23);
		this.setBaseCrit(10);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(7);
		this.setSpeedBase(9);
		this.setLuckBase(5);
		this.setDefBase(4);
		this.setResBase(4);

		this.setHpGr(50);
		this.setStrGr(50);
		this.setSkillGr(55);
		this.setSpeedGr(70);
		this.setLuckGr(40);
		this.setDefGr(25);
		this.setResGr(20);

		this.setStrCap(26);
		this.setSkillCap(26);
		this.setSpeedCap(29);
		this.setDefCap(29);
		this.setResCap(21);
	}
}