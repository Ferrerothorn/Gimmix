package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.SteelSword;

public class Makalov extends Unit {

	public Makalov() {
		this.setJob("Makalov");
		this.setWeapon(new SteelSword());
		this.setTrait("Mounted");
		this.setHpBase(25);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(4);
		this.setSkillBase(3);
		this.setSpeedBase(6);
		this.setLuckBase(6);
		this.setDefBase(6);
		this.setResBase(0);

		this.setHpGr(60);
		this.setStrGr(55);
		this.setSkillGr(45);
		this.setSpeedGr(50);
		this.setLuckGr(25);
		this.setDefGr(45);
		this.setResGr(20);

		this.setStrCap(26);
		this.setSkillCap(26);
		this.setSpeedCap(27);
		this.setDefCap(27);
		this.setResCap(25);
	}
}