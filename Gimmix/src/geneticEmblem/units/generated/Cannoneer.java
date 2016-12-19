package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Cannoneer extends Unit {

	public Cannoneer() {

		this.setJob("Cannoneer");
		this.setWeapon(new Cannon());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(4);
		this.setDefBase(7);
		this.setResBase(5);

		this.setHpGr(50);
		this.setStrGr(60);
		this.setSkillGr(40);
		this.setSpeedGr(40);
		this.setLuckGr(35);
		this.setDefGr(55);
		this.setResGr(35);
	}
}
