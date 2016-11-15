package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class FirePoison extends Unit {

	public FirePoison() {

		this.setJob("Fire / Poison");
		this.setWeapon(new Flux());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(6);
		this.setSpeedBase(8);
		this.setLuckBase(6);
		this.setDefBase(2);
		this.setResBase(7);

		this.setHpGr(40);
		this.setStrGr(60);
		this.setSkillGr(45);
		this.setSpeedGr(55);
		this.setLuckGr(50);
		this.setDefGr(25);
		this.setResGr(45);

		this.setStrCap(29);
		this.setSkillCap(24);
		this.setSpeedCap(26);
		this.setDefCap(23);
		this.setResCap(28);
	}
}
