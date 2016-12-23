package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronAxe;

public class Hector extends Unit {

	public Hector() {
		this.setJob("Hector");
		this.setWeapon(new IronAxe());
		this.setHpBase(19);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(4);
		this.setSpeedBase(5);
		this.setLuckBase(3);
		this.setDefBase(8);
		this.setResBase(0);

		this.setHpGr(90);
		this.setStrGr(60);
		this.setSkillGr(45);
		this.setSpeedGr(35);
		this.setLuckGr(30);
		this.setDefGr(50);
		this.setResGr(25);

		this.setStrCap(30);
		this.setSkillCap(24);
		this.setSpeedCap(24);
		this.setDefCap(29);
		this.setResCap(20);
	}
}