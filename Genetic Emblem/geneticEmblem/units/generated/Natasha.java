package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Lightning;

public class Natasha extends Unit {

	public Natasha() {
		this.setJob("Natasha");
		this.setTrait("Mounted");
		this.setWeapon(new Lightning());
		this.setHpBase(18);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(2);
		this.setSkillBase(4);
		this.setSpeedBase(8);
		this.setLuckBase(6);
		this.setDefBase(2);
		this.setResBase(6);

		this.setHpGr(50);
		this.setStrGr(60);
		this.setSkillGr(25);
		this.setSpeedGr(40);
		this.setLuckGr(60);
		this.setDefGr(15);
		this.setResGr(55);

		this.setStrCap(25);
		this.setSkillCap(24);
		this.setSpeedCap(25);
		this.setDefCap(24);
		this.setResCap(28);
	}

}