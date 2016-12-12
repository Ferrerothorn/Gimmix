package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Gunslinger extends Unit {

	public Gunslinger() {

		this.setJob("Gunslinger");
		this.setWeapon(new IronGun());
		this.setHpBase(24);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(7);
		this.setSpeedBase(8);
		this.setLuckBase(5);
		this.setDefBase(5);
		this.setResBase(4);

		this.setHpGr(45);
		this.setStrGr(55);
		this.setSkillGr(60);
		this.setSpeedGr(55);
		this.setLuckGr(40);
		this.setDefGr(45);
		this.setResGr(30);
	}
}
