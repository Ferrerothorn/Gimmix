package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronSword;

public class Fighter extends Unit {

	public Fighter() {
		this.setJob("Fighter");
		this.setWeapon(new IronSword());
		this.setHpBase(28);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(5);
		this.setDefBase(8);
		this.setResBase(2);

		this.setHpGr(65);
		this.setStrGr(60);
		this.setSkillGr(40);
		this.setSpeedGr(35);
		this.setLuckGr(35);
		this.setDefGr(60);
		this.setResGr(35);
	}	
}
