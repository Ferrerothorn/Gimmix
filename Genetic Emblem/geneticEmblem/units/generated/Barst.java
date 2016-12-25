package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronAxe;

public class Barst extends Unit {

	public Barst() {
		this.setJob("Barst");
		this.setWeapon(new IronAxe());
		this.setHpBase(22);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(5);
		this.setSpeedBase(8);
		this.setLuckBase(4);
		this.setDefBase(6);
		this.setResBase(0);

		this.setHpGr(80);
		this.setStrGr(40);
		this.setSkillGr(40);
		this.setSpeedGr(30);
		this.setLuckGr(40);
		this.setDefGr(15);
		this.setResGr(0);

		this.setStrCap(30);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(28);
		this.setResCap(20);
	}
}