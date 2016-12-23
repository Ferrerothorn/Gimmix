package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronSword;

public class Marisa extends Unit {

	public Marisa() {
		this.setJob("Marisa");
		this.setWeapon(new IronSword());
		this.setHpBase(20);
		this.setBaseCrit(15);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(10);
		this.setSpeedBase(11);
		this.setLuckBase(7);
		this.setDefBase(3);
		this.setResBase(2);

		this.setHpGr(75);
		this.setStrGr(30);
		this.setSkillGr(55);
		this.setSpeedGr(60);
		this.setLuckGr(50);
		this.setDefGr(15);
		this.setResGr(25);

		this.setStrCap(22);
		this.setSkillCap(29);
		this.setSpeedCap(30);
		this.setDefCap(22);
		this.setResCap(25);
	}
}