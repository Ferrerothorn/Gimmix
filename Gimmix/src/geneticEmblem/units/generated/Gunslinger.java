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

		this.setHpGr(40);
		this.setStrGr(45);
		this.setSkillGr(65);
		this.setSpeedGr(60);
		this.setLuckGr(30);
		this.setDefGr(40);
		this.setResGr(35);
	}
}
