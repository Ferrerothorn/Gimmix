package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.SteelSword;

public class Lowen extends Unit {

	public Lowen() {
		this.setJob("Lowen");
		this.setWeapon(new SteelSword());
		this.setHpBase(22);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(5);
		this.setSpeedBase(7);
		this.setLuckBase(3);
		this.setDefBase(7);
		this.setResBase(0);

		this.setHpGr(90);
		this.setStrGr(30);
		this.setSkillGr(30);
		this.setSpeedGr(30);
		this.setLuckGr(50);
		this.setDefGr(40);
		this.setResGr(30);

		this.setStrCap(25);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(25);
		this.setResCap(25);
	}
}