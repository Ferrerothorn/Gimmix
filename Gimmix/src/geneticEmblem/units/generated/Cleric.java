package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Cleric extends Unit {

	public Cleric() {

		this.setJob("Cleric");
		this.setWeapon(new HolyArrow());
		this.setHpBase(25);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(5);
		this.setSpeedBase(7);
		this.setLuckBase(6);
		this.setDefBase(4);
		this.setResBase(8);

		this.setHpGr(5);
		this.setStrGr(5);
		this.setSkillGr(5);
		this.setSpeedGr(5);
		this.setLuckGr(5);
		this.setDefGr(5);
		this.setResGr(5);
	}
}
