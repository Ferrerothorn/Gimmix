package geneticEmblem.units.banlist;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronAxe;

public class Camilla extends Unit {

	public Camilla() {
		this.setJob("Camilla");
		this.setWeapon(new IronAxe());
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(2);
		this.setSpeedBase(6);
		this.setLuckBase(6);
		this.setDefBase(7);
		this.setResBase(6);

		this.setHpGr(50);
		this.setStrGr(65);
		this.setSkillGr(65);
		this.setSpeedGr(65);
		this.setLuckGr(30);
		this.setDefGr(55);
		this.setResGr(45);

		this.setStrCap(33);
		this.setSkillCap(23);
		this.setSpeedCap(29);
		this.setDefCap(35);
		this.setResCap(26);
	}
}