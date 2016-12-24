package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronAxe;

public class Charlotte extends Unit {

	public Charlotte() {
		this.setJob("Charlotte");
		this.setWeapon(new IronAxe());
		this.setHpBase(19);
		this.setBaseCrit(15);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(6);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(6);
		this.setResBase(2);

		this.setHpGr(95);
		this.setStrGr(80);
		this.setSkillGr(50);
		this.setSpeedGr(65);
		this.setLuckGr(45);
		this.setDefGr(20);
		this.setResGr(5);

		this.setStrCap(40);
		this.setSkillCap(32);
		this.setSpeedCap(33);
		this.setDefCap(27);
		this.setResCap(25);
	}
}