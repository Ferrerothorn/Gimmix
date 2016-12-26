package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Fire;
import geneticEmblem.weapons.SteelSword;

public class Raven extends Unit {

	public Raven() {
		this.setJob("Raven");
		this.setWeapon(new SteelSword());
		this.setHpBase(22);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(9);
		this.setSpeedBase(11);
		this.setLuckBase(1);
		this.setDefBase(4);
		this.setResBase(0);

		this.setHpGr(85);
		this.setStrGr(55);
		this.setSkillGr(40);
		this.setSpeedGr(45);
		this.setLuckGr(35);
		this.setDefGr(25);
		this.setResGr(15);

		this.setStrCap(25);
		this.setSkillCap(30);
		this.setSpeedCap(26);
		this.setDefCap(25);
		this.setResCap(22);
	}
}