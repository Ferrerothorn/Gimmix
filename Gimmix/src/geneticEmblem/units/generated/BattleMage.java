package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Staff;

public class BattleMage extends Unit {

	public BattleMage() {
		this.setJob("Battle Mage");
		this.setWeapon(new Staff());		
		this.setHpBase(24);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(6);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(8);
		this.setResBase(7);

		this.setHpGr(45);
		this.setStrGr(50);
		this.setSkillGr(40);
		this.setSpeedGr(45);
		this.setLuckGr(40);
		this.setDefGr(50);
		this.setResGr(60);
	}

}
