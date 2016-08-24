package geneticEmblem.units.generated;

import geneticEmblem.units.ootb.Unit;

import geneticEmblem.weapons.*;

public class SnapcasterMage extends Unit {

	public SnapcasterMage() {

		this.setJob("Snapcaster Mage");

		this.setWeapon(new Thunder());
		this.setHpBase(25);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(8);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(7);
		this.setResBase(5);

		this.setHpGr(50);
		this.setStrGr(55);
		this.setSkillGr(30);
		this.setSpeedGr(45);
		this.setLuckGr(65);
		this.setDefGr(40);
		this.setResGr(25);

		this.setStrCap(29);
		this.setSkillCap(24);
		this.setSpeedCap(29);
		this.setDefCap(25);
		this.setResCap(20);
	}
}