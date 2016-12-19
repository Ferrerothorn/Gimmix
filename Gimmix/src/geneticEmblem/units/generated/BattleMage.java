package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Staff;

public class BattleMage extends Unit {

	public BattleMage() {
		this.setJob("Battle Mage");
		this.setWeapon(new Staff());
		this.setHpBase(27);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(4);
		this.setSpeedBase(6);
		this.setLuckBase(5);
		this.setDefBase(6);
		this.setResBase(7);

		this.setHpGr(50);
		this.setStrGr(45);
		this.setSkillGr(35);
		this.setSpeedGr(45);
		this.setLuckGr(35);
		this.setDefGr(45);
		this.setResGr(60);
	}
}
