package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Lightning;

public class Rhys extends Unit {

	public Rhys() {
		this.setJob("Rhys");
		this.setWeapon(new Lightning());
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(7);
		this.setSpeedBase(4);
		this.setLuckBase(6);
		this.setDefBase(0);
		this.setResBase(12);

		this.setHpGr(55);
		this.setStrGr(55);
		this.setSkillGr(25);
		this.setSpeedGr(40);
		this.setLuckGr(50);
		this.setDefGr(20);
		this.setResGr(60);

		this.setStrCap(29);
		this.setSkillCap(22);
		this.setSpeedCap(25);
		this.setDefCap(20);
		this.setResCap(30);
	}
}