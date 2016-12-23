package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronSword;

public class Joshua extends Unit {

	public Joshua() {
		this.setJob("Joshua");
		this.setWeapon(new IronSword());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(15);
		this.setStrBase(6);
		this.setSkillBase(11);
		this.setSpeedBase(12);
		this.setLuckBase(6);
		this.setDefBase(4);
		this.setResBase(1);

		this.setHpGr(80);
		this.setStrGr(35);
		this.setSkillGr(55);
		this.setSpeedGr(55);
		this.setLuckGr(30);
		this.setDefGr(20);
		this.setResGr(20);

		this.setStrCap(24);
		this.setSkillCap(29);
		this.setSpeedCap(30);
		this.setDefCap(22);
		this.setResCap(23);
	}
}