package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronAxe;

public class Garcia extends Unit {

	public Garcia() {
		this.setJob("Garcia");
		this.setWeapon(new IronAxe());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(2);
		this.setDefBase(4);
		this.setResBase(1);

		this.setHpGr(80);
		this.setStrGr(65);
		this.setSkillGr(40);
		this.setSpeedGr(20);
		this.setLuckGr(40);
		this.setDefGr(25);
		this.setResGr(15);

		this.setStrCap(30);
		this.setSkillCap(28);
		this.setSpeedCap(26);
		this.setDefCap(26);
		this.setResCap(22);
	}

}