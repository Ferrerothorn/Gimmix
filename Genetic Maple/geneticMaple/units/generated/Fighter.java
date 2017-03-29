package geneticMaple.units.generated;

import geneticMaple.units.factory.Unit;
import geneticMaple.weapons.Sword;

public class Fighter extends Unit {

	public Fighter() {
		this.setJob("Fighter");
		this.setWeapon(new Sword());
		this.setHpBase(28);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(5);
		this.setDefBase(8);
		this.setResBase(2);

		this.setHpGr(60);
		this.setStrGr(60);
		this.setSkillGr(40);
		this.setSpeedGr(35);
		this.setLuckGr(30);
		this.setDefGr(60);
		this.setResGr(30);
	}	
}
