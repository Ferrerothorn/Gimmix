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

		this.setHpGr(5);
		this.setStrGr(5);
		this.setSkillGr(5);
		this.setSpeedGr(5);
		this.setLuckGr(5);
		this.setDefGr(5);
		this.setResGr(5);
	}
}
