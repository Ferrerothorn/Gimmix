package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.SteelSword;

public class Colm extends Unit {

	public Colm() {
		this.setJob("Colm");
		this.setWeapon(new SteelSword());
		this.setHpBase(17);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(4);
		this.setSkillBase(4);
		this.setSpeedBase(9);
		this.setLuckBase(8);
		this.setDefBase(3);
		this.setResBase(1);

		this.setHpGr(75);
		this.setStrGr(40);
		this.setSkillGr(40);
		this.setSpeedGr(65);
		this.setLuckGr(45);
		this.setDefGr(25);
		this.setResGr(20);

		this.setStrCap(20);
		this.setSkillCap(30);
		this.setSpeedCap(30);
		this.setDefCap(20);
		this.setResCap(20);
	}

}