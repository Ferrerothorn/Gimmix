package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.HuntersGear;

public class WildHunter extends Unit {

	public WildHunter() {
		this.setJob("Wild Hunter");
		this.setWeapon(new HuntersGear());
		this.setHpBase(22);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(6);
		this.setSpeedBase(9);
		this.setLuckBase(5);
		this.setDefBase(7);
		this.setResBase(4);

		this.setHpGr(60);
		this.setStrGr(55);
		this.setSkillGr(50);
		this.setSpeedGr(50);
		this.setLuckGr(40);
		this.setDefGr(40);
		this.setResGr(25);

		this.setStrCap(27);
		this.setSkillCap(25);
		this.setSpeedCap(25);
		this.setDefCap(27);
		this.setResCap(26);

	}
	
}
