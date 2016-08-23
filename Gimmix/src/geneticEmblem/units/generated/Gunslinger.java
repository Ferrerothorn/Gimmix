package geneticEmblem.units.generated;

import geneticEmblem.units.ootb.Unit;

import geneticEmblem.weapons.*;

public class Gunslinger extends Unit {

	public Gunslinger() {
		this.setJob("Gunslinger");
		this.setWeapon(new IronGun());
		this.setBaseCrit(10);
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(6);
		this.setSpeedBase(9);
		this.setLuckBase(6);
		this.setDefBase(5);
		this.setResBase(3);

		this.setHpGr(20);
		this.setStrGr(50);
		this.setSkillGr(65);
		this.setSpeedGr(50);
		this.setLuckGr(45);
		this.setDefGr(40);
		this.setResGr(40);

		this.setStrCap(26);
		this.setSkillCap(30);
		this.setSpeedCap(27);
		this.setDefCap(23);
		this.setResCap(22);
	}
}
