package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Lightning;

public class Serra extends Unit {

	public Serra() {
		this.setJob("Serra");
		this.setWeapon(new Lightning());
		this.setHpBase(17);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(2);
		this.setSkillBase(5);
		this.setSpeedBase(8);
		this.setLuckBase(6);
		this.setDefBase(2);
		this.setResBase(5);

		this.setHpGr(50);
		this.setStrGr(50);
		this.setSkillGr(30);
		this.setSpeedGr(40);
		this.setLuckGr(60);
		this.setDefGr(15);
		this.setResGr(55);

		this.setStrCap(25);
		this.setSkillCap(25);
		this.setSpeedCap(26);
		this.setDefCap(21);
		this.setResCap(30);
	}
}