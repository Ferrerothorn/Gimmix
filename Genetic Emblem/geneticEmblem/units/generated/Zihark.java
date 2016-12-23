package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.SteelSword;

public class Zihark extends Unit {

	public Zihark() {
		this.setJob("Zihark");
		this.setWeapon(new SteelSword());
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(9);
		this.setSpeedBase(10);
		this.setLuckBase(2);
		this.setDefBase(4);
		this.setResBase(-2);

		this.setHpGr(55);
		this.setStrGr(45);
		this.setSkillGr(50);
		this.setSpeedGr(60);
		this.setLuckGr(40);
		this.setDefGr(30);
		this.setResGr(20);

		this.setStrCap(24);
		this.setSkillCap(29);
		this.setSpeedCap(30);
		this.setDefCap(24);
		this.setResCap(22);
	}
}