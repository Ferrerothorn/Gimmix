package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.SilverSword;

public class Kent extends Unit {

	public Kent() {
		this.setJob("Kent");
		this.setWeapon(new SilverSword());
		this.setTrait("Mounted");
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(6);
		this.setSpeedBase(7);
		this.setLuckBase(2);
		this.setDefBase(5);
		this.setResBase(1);

		this.setHpGr(85);
		this.setStrGr(40);
		this.setSkillGr(50);
		this.setSpeedGr(45);
		this.setLuckGr(20);
		this.setDefGr(25);
		this.setResGr(25);

		this.setStrCap(25);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(25);
		this.setResCap(25);
	}
}