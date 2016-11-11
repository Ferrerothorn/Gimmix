package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Fire;

public class FirePoison extends Unit {

	public FirePoison() {
		this.setJob("Fire / Poison");
		this.setWeapon(new Fire());
		this.setStrBase(7);
		this.setSkillBase(5);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(4);
		this.setResBase(9);

		this.setHpGr(40);
		this.setStrGr(40);
		this.setSkillGr(45);
		this.setSpeedGr(60);
		this.setLuckGr(50);
		this.setDefGr(25);
		this.setResGr(60);

		this.setStrCap(26);
		this.setSkillCap(26);
		this.setSpeedCap(26);
		this.setDefCap(24);
		this.setResCap(28);
	}
	
}
