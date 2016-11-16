package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class FirePoison extends Unit {

	public FirePoison() {
		this.setJob("Fire / Poison");
		this.setWeapon(new Flux());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(6);
		this.setSpeedBase(8);
		this.setLuckBase(6);
		this.setDefBase(4);
		this.setResBase(6);

		this.setHpGr(45);
		this.setStrGr(50);
		this.setSkillGr(40);
		this.setSpeedGr(50);
		this.setLuckGr(50);
		this.setDefGr(35);
		this.setResGr(50);

		this.setStrCap(29);
		this.setSkillCap(24);
		this.setSpeedCap(26);
		this.setDefCap(23);
		this.setResCap(28);
	}
}
