package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronAxe;

public class Ross extends Unit {

	public Ross() {
		this.setJob("Ross");
		this.setWeapon(new IronAxe());
		this.setHpBase(23);
		this.setBaseCrit(15);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(12);
		this.setSkillBase(5);
		this.setSpeedBase(3);
		this.setLuckBase(12);
		this.setDefBase(6);
		this.setResBase(2);

		this.setHpGr(70);
		this.setStrGr(50);
		this.setSkillGr(35);
		this.setSpeedGr(30);
		this.setLuckGr(40);
		this.setDefGr(25);
		this.setResGr(20);

		this.setStrCap(30);
		this.setSkillCap(28);
		this.setSpeedCap(26);
		this.setDefCap(26);
		this.setResCap(22);
	}

}