package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.HolyArrow;

public class Cleric extends Unit {

	public Cleric() {
		this.setJob("Cleric");
		this.setWeapon(new HolyArrow());
		this.setStrBase(5);
		this.setSkillBase(4);
		this.setSpeedBase(8);
		this.setLuckBase(8);
		this.setDefBase(5);
		this.setResBase(7);

		this.setHpGr(35);
		this.setStrGr(40);
		this.setSkillGr(60);
		this.setSpeedGr(45);
		this.setLuckGr(60);
		this.setDefGr(20);
		this.setResGr(60);

		this.setStrCap(24);
		this.setSkillCap(28);
		this.setSpeedCap(26);
		this.setDefCap(22);
		this.setResCap(30);

	}
	
}
