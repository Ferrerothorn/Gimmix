package geneticEmblem.units.generated;

import geneticEmblem.units.ootb.Unit;
import geneticEmblem.weapons.*;

public class FirePoison extends Unit {

	public FirePoison() {
		this.setJob("Fire/Poison");
		this.setWeapon(new Fire());
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(7);
		this.setSpeedBase(9);
		this.setLuckBase(3);
		this.setDefBase(3);
		this.setResBase(6);

		this.setHpGr(50);
		this.setStrGr(55);
		this.setSkillGr(30);
		this.setSpeedGr(70);
		this.setLuckGr(30);
		this.setDefGr(30);
		this.setResGr(45);

		this.setStrCap(24);
		this.setSkillCap(21);
		this.setSpeedCap(29);
		this.setDefCap(24);
		this.setResCap(29);
	}
}
