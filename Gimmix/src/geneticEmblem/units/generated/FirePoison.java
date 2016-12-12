package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class FirePoison extends Unit {

	public FirePoison() {
		this.setJob("Fire / Poison");
		this.setWeapon(new Flux());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(6);
		this.setSpeedBase(9);
		this.setLuckBase(6);
		this.setDefBase(5);
		this.setResBase(8);

		this.setHpGr(40);
		this.setStrGr(55);
		this.setSkillGr(45);
		this.setSpeedGr(55);
		this.setLuckGr(40);
		this.setDefGr(40);
		this.setResGr(55);
	}
}
