package geneticEmblem.units.banlist;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Beak;

public class Naesala extends Unit {

	public Naesala() {
		this.setJob("Naesala");
		this.setWeapon(new Beak());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(3);
		this.setSkillBase(1);
		this.setSpeedBase(4);
		this.setLuckBase(12);
		this.setDefBase(1);
		this.setResBase(3);

		this.setHpGr(100);
		this.setStrGr(60);
		this.setSkillGr(70);
		this.setSpeedGr(75);
		this.setLuckGr(20);
		this.setDefGr(55);
		this.setResGr(35);

		this.setStrCap(29);
		this.setSkillCap(34);
		this.setSpeedCap(37);
		this.setDefCap(27);
		this.setResCap(32);
	}
}