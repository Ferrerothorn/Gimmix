package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronAxe;

public class Boyd extends Unit {

	public Boyd() {
		this.setJob("Boyd");
		this.setWeapon(new IronAxe());
		this.setHpBase(29);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(4);
		this.setSpeedBase(6);
		this.setLuckBase(4);
		this.setDefBase(5);
		this.setResBase(0);

		this.setHpGr(75);
		this.setStrGr(60);
		this.setSkillGr(50);
		this.setSpeedGr(45);
		this.setLuckGr(35);
		this.setDefGr(25);
		this.setResGr(25);

		this.setStrCap(30);
		this.setSkillCap(28);
		this.setSpeedCap(27);
		this.setDefCap(25);
		this.setResCap(20);
	}
}