package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.HolyArrow;

public class Cleric extends Unit {

	public Cleric() {
		this.setJob("Cleric");
		this.setWeapon(new HolyArrow());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(5);
		this.setSpeedBase(8);
		this.setLuckBase(6);
		this.setDefBase(6);
		this.setResBase(7);

		this.setHpGr(55);
		this.setStrGr(40);
		this.setSkillGr(40);
		this.setSpeedGr(40);
		this.setLuckGr(40);
		this.setDefGr(45);
		this.setResGr(60);

		this.setStrCap(24);
		this.setSkillCap(28);
		this.setSpeedCap(26);
		this.setDefCap(22);
		this.setResCap(30);

	}
	
}
