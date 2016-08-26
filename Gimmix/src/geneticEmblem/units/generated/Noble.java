package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Noble extends Unit {

	public Noble() {
		this.setJob("Noble");
		this.setWeapon(new Rapier());
		this.setHpBase(24);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(7);
		this.setSpeedBase(5);
		this.setLuckBase(7);
		this.setDefBase(3);
		this.setResBase(6);

		this.setHpGr(35);
		this.setStrGr(60);
		this.setSkillGr(30);
		this.setSpeedGr(80);
		this.setLuckGr(45);
		this.setDefGr(25);
		this.setResGr(45);

		this.setStrCap(24);
		this.setSkillCap(23);
		this.setSpeedCap(28);
		this.setDefCap(24);
		this.setResCap(28);
	}
}