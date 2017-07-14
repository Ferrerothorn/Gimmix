package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronAxe;

public class Duessel extends Unit {

	public Duessel() {
		this.setJob("Duessel");
		this.setWeapon(new IronAxe());
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(3);
		this.setSkillBase(2);
		this.setSpeedBase(5);
		this.setLuckBase(3);
		this.setDefBase(6);
		this.setResBase(2);

		this.setHpGr(85);
		this.setStrGr(55);
		this.setSkillGr(40);
		this.setSpeedGr(30);
		this.setLuckGr(20);
		this.setDefGr(45);
		this.setResGr(30);

		this.setStrCap(28);
		this.setSkillCap(24);
		this.setSpeedCap(24);
		this.setDefCap(29);
		this.setResCap(25);
	}

}