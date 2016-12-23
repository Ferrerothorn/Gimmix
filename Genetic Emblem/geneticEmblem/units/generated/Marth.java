package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.SteelSword;

public class Marth extends Unit {

	public Marth() {
		this.setJob("Marth");
		this.setWeapon(new SteelSword());
		this.setHpBase(18);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(3);
		this.setSpeedBase(7);
		this.setLuckBase(7);
		this.setDefBase(7);
		this.setResBase(0);

		this.setHpGr(80);
		this.setStrGr(50);
		this.setSkillGr(40);
		this.setSpeedGr(60);
		this.setLuckGr(70);
		this.setDefGr(20);
		this.setResGr(2);

		this.setStrCap(25);
		this.setSkillCap(25);
		this.setSpeedCap(25);
		this.setDefCap(25);
		this.setResCap(25);
	}
}