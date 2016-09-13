package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Viking extends Unit {

	public Viking() {
		this.setJob("Viking");
		this.setWeapon(new BoltAxe());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());

		this.setStrBase(9);
		this.setSkillBase(7);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(6);
		this.setResBase(2);

		this.setHpGr(70);
		this.setStrGr(60);
		this.setSkillGr(45);
		this.setSpeedGr(45);
		this.setLuckGr(30);
		this.setDefGr(45);
		this.setResGr(25);

		this.setStrCap(30);
		this.setSkillCap(29);
		this.setSpeedCap(28);
		this.setDefCap(23);
		this.setResCap(21);
	}
}