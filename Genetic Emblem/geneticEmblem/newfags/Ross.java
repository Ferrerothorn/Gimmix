package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronAxe;

public class Ross extends Unit {

	public Ross() {
		this.setJob("Ross");
		this.setWeapon(new IronAxe());
		this.setHpBase(0);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(0);
		this.setSkillBase(0);
		this.setSpeedBase(0);
		this.setLuckBase(0);
		this.setDefBase(0);
		this.setResBase(0);

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