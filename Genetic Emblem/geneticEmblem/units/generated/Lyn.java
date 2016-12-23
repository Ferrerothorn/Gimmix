package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronSword;

public class Lyn extends Unit {

	public Lyn() {
		this.setJob("Lyn");
		this.setWeapon(new IronSword());
		this.setHpBase(16);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(4);
		this.setSkillBase(7);
		this.setSpeedBase(9);
		this.setLuckBase(5);
		this.setDefBase(2);
		this.setResBase(0);

		this.setHpGr(70);
		this.setStrGr(40);
		this.setSkillGr(60);
		this.setSpeedGr(60);
		this.setLuckGr(55);
		this.setDefGr(20);
		this.setResGr(30);

		this.setStrCap(24);
		this.setSkillCap(29);
		this.setSpeedCap(30);
		this.setDefCap(22);
		this.setResCap(22);
	}
}