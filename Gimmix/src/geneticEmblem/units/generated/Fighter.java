package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronSword;

public class Fighter extends Unit {

	public Fighter() {
		this.setJob("Fighter");
		this.setWeapon(new IronSword());
		this.setStrBase(7);
		this.setSkillBase(7);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(6);
		this.setResBase(5);

		this.setHpGr(75);
		this.setStrGr(60);
		this.setSkillGr(40);
		this.setSpeedGr(45);
		this.setLuckGr(40);
		this.setDefGr(45);
		this.setResGr(15);

		this.setStrCap(29);
		this.setSkillCap(25);
		this.setSpeedCap(26);
		this.setDefCap(26);
		this.setResCap(24);

	}
	
}
