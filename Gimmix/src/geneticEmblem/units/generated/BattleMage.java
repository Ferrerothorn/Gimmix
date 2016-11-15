package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Staff;

public class BattleMage extends Unit {

	public BattleMage() {
		this.setJob("Battle Mage");
		this.setWeapon(new Staff());
		this.setStrBase(7);
		this.setSkillBase(7);
		this.setSpeedBase(7);
		this.setLuckBase(4);
		this.setDefBase(6);
		this.setResBase(5);

		this.setHpGr(50);
		this.setStrGr(50);
		this.setSkillGr(50);
		this.setSpeedGr(50);
		this.setLuckGr(40);
		this.setDefGr(40);
		this.setResGr(40);

		this.setStrCap(27);
		this.setSkillCap(26);
		this.setSpeedCap(26);
		this.setDefCap(26);
		this.setResCap(25);

	}

}
