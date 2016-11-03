package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.HuntersGear;

public class WildHunter extends Unit {

	public WildHunter() {
		this.setJob("Wild Hunter");
		this.setWeapon(new HuntersGear());
		this.setStrBase(8);
		this.setSkillBase(6);
		this.setSpeedBase(7);
		this.setLuckBase(6);
		this.setDefBase(7);
		this.setResBase(3);

		this.setHpGr(60);
		this.setStrGr(60);
		this.setSkillGr(45);
		this.setSpeedGr(50);
		this.setLuckGr(35);
		this.setDefGr(35);
		this.setResGr(35);

		this.setStrCap(27);
		this.setSkillCap(25);
		this.setSpeedCap(25);
		this.setDefCap(27);
		this.setResCap(26);

	}
	
}
