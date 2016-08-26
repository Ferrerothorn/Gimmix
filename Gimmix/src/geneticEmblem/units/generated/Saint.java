package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Saint extends Unit {

	public Saint() {

		this.setJob("Saint");

		this.setWeapon(new Shine());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(7);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(3);
		this.setResBase(6);

		this.setHpGr(60);
		this.setStrGr(45);
		this.setSkillGr(50);
		this.setSpeedGr(50);
		this.setLuckGr(55);
		this.setDefGr(30);
		this.setResGr(30);

		this.setStrCap(24);
		this.setSkillCap(29);
		this.setSpeedCap(24);
		this.setDefCap(22);
		this.setResCap(29);
	}
}