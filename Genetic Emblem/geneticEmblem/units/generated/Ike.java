package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronSword;

public class Ike extends Unit {

	public Ike() {
		this.setJob("Ike");
		this.setWeapon(new IronSword());
		this.setHpBase(19);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(6);
		this.setSpeedBase(7);
		this.setLuckBase(6);
		this.setDefBase(5);
		this.setResBase(0);

		this.setHpGr(75);
		this.setStrGr(50);
		this.setSkillGr(50);
		this.setSpeedGr(55);
		this.setLuckGr(35);
		this.setDefGr(40);
		this.setResGr(40);

		this.setStrCap(26);
		this.setSkillCap(27);
		this.setSpeedCap(28);
		this.setDefCap(24);
		this.setResCap(22);
	}
}