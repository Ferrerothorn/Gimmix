package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.SteelSword;

public class Guy extends Unit {

	public Guy() {
		this.setJob("Guy");
		this.setWeapon(new SteelSword());
		this.setBaseCrit(15);
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(10);
		this.setSpeedBase(10);
		this.setLuckBase(4);
		this.setDefBase(5);
		this.setResBase(0);

		this.setHpGr(75);
		this.setStrGr(30);
		this.setSkillGr(50);
		this.setSpeedGr(70);
		this.setLuckGr(45);
		this.setDefGr(15);
		this.setResGr(25);

		this.setStrCap(24);
		this.setSkillCap(29);
		this.setSpeedCap(30);
		this.setDefCap(22);
		this.setResCap(23);
	}
}