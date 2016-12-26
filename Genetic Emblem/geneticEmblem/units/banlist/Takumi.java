package geneticEmblem.units.banlist;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronBow;

public class Takumi extends Unit {

	public Takumi() {
		this.setJob("Takumi");
		this.setWeapon(new IronBow());
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(9);
		this.setSpeedBase(6);
		this.setLuckBase(8);
		this.setDefBase(6);
		this.setResBase(2);

		this.setHpGr(60);
		this.setStrGr(50);
		this.setSkillGr(80);
		this.setSpeedGr(55);
		this.setLuckGr(50);
		this.setDefGr(45);
		this.setResGr(20);

		this.setStrCap(31);
		this.setSkillCap(35);
		this.setSpeedCap(33);
		this.setDefCap(31);
		this.setResCap(28);
	}
}