package geneticEmblem.units.banlist;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Beak;

public class Tibarn extends Unit {

	public Tibarn() {
		this.setJob("Tibarn");
		this.setWeapon(new Beak());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(4);
		this.setSkillBase(5);
		this.setSpeedBase(0);
		this.setLuckBase(6);
		this.setDefBase(4);
		this.setResBase(6);

		this.setHpGr(100);
		this.setStrGr(70);
		this.setSkillGr(70);
		this.setSpeedGr(65);
		this.setLuckGr(50);
		this.setDefGr(60);
		this.setResGr(25);

		this.setStrCap(33);
		this.setSkillCap(35);
		this.setSpeedCap(36);
		this.setDefCap(32);
		this.setResCap(29);
	}
}