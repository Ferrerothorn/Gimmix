package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronSword;

public class Fighter extends Unit {

	public Fighter() {
		this.setJob("Fighter");
		this.setWeapon(new IronSword());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(10);
		this.setSkillBase(7);
		this.setSpeedBase(6);
		this.setLuckBase(6);
		this.setDefBase(8);
		this.setResBase(4);

		this.setHpGr(60);
		this.setStrGr(65);
		this.setSkillGr(55);
		this.setSpeedGr(40);
		this.setLuckGr(30);
		this.setDefGr(55);
		this.setResGr(25);
	}	
}
