package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Staff;

public class BattleMage extends Unit {

	public BattleMage() {
		this.setJob("Battle Mage");
		this.setWeapon(new Staff());		
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(6);
		this.setSpeedBase(8);
		this.setLuckBase(6);
		this.setDefBase(5);
		this.setResBase(6);

		this.setHpGr(50);
		this.setStrGr(45);
		this.setSkillGr(40);
		this.setSpeedGr(45);
		this.setLuckGr(44);
		this.setDefGr(40);
		this.setResGr(55);

		this.setStrCap(27);
		this.setSkillCap(26);
		this.setSpeedCap(26);
		this.setDefCap(26);
		this.setResCap(25);

	}

}
