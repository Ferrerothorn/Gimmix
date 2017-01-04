package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Lightning;

public class Lucius extends Unit {

	public Lucius() {
		this.setJob("Lucius");
		this.setWeapon(new Lightning());
		this.setHpBase(17);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(5);
		this.setSpeedBase(9);
		this.setLuckBase(2);
		this.setDefBase(1);
		this.setResBase(5);

		this.setHpGr(55);
		this.setStrGr(60);
		this.setSkillGr(50);
		this.setSpeedGr(40);
		this.setLuckGr(20);
		this.setDefGr(10);
		this.setResGr(60);

		this.setStrCap(25);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(22);
		this.setResCap(30);
	}

}