package geneticEmblem.units.banlist;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.SteelSword;

public class Anna extends Unit {

	public Anna() {
		this.setJob("Anna");
		this.setWeapon(new SteelSword());
		this.setHpBase(19);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(4);
		this.setSkillBase(10);
		this.setSpeedBase(10);
		this.setLuckBase(9);
		this.setDefBase(1);
		this.setResBase(2);

		this.setHpGr(80);
		this.setStrGr(40);
		this.setSkillGr(60);
		this.setSpeedGr(55);
		this.setLuckGr(80);
		this.setDefGr(35);
		this.setResGr(40);

		this.setStrCap(34);
		this.setSkillCap(46);
		this.setSpeedCap(43);
		this.setDefCap(29);
		this.setResCap(40);
	}
}