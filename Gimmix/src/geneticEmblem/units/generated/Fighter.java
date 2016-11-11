package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronSword;

public class Fighter extends Unit {

	public Fighter() {
		this.setJob("Fighter");
		this.setWeapon(new IronSword());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(6);
		this.setDefBase(7);
		this.setResBase(5);

		this.setHpGr(70);
		this.setStrGr(60);
		this.setSkillGr(40);
		this.setSpeedGr(40);
		this.setLuckGr(40);
		this.setDefGr(50);
		this.setResGr(20);

		this.setStrCap(29);
		this.setSkillCap(25);
		this.setSpeedCap(25);
		this.setDefCap(27);
		this.setResCap(24);

	}
	
}
