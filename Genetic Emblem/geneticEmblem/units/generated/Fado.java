package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.SteelSword;

public class Fado extends Unit {

	public Fado() {
		this.setJob("Fado");
		this.setWeapon(new SteelSword());
		this.setHpBase(22);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(0);
		this.setSpeedBase(-3);
		this.setLuckBase(-2);
		this.setDefBase(5);
		this.setResBase(4);

		this.setHpGr(85);
		this.setStrGr(55);
		this.setSkillGr(50);
		this.setSpeedGr(30);
		this.setLuckGr(25);
		this.setDefGr(45);
		this.setResGr(25);

		this.setStrCap(29);
		this.setSkillCap(27);
		this.setSpeedCap(24);
		this.setDefCap(30);
		this.setResCap(25);
	}

}