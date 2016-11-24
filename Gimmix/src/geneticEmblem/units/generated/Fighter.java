package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronSword;

public class Fighter extends Unit {

	public Fighter() {
		this.setJob("Fighter");
		this.setWeapon(new IronSword());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(7);
		this.setSpeedBase(6);
		this.setLuckBase(6);
		this.setDefBase(7);
		this.setResBase(3);

		this.setHpGr(60);
		this.setStrGr(65);
		this.setSkillGr(55);
		this.setSpeedGr(40);
		this.setLuckGr(25);
		this.setDefGr(50);
		this.setResGr(25);

		this.setStrCap(29);
		this.setSkillCap(25);
		this.setSpeedCap(25);
		this.setDefCap(27);
		this.setResCap(24);

	}
	
}
