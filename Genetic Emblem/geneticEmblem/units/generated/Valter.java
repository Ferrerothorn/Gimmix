package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;
import geneticEmblem.weapons.ShortSpear;

public class Valter extends Unit {

	public Valter() {
		this.setJob("Valter");
		this.setWeapon(new ShortSpear());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(1);
		this.setSpeedBase(2);
		this.setLuckBase(-1);
		this.setDefBase(7);
		this.setResBase(6);

		this.setHpGr(80);
		this.setStrGr(40);
		this.setSkillGr(55);
		this.setSpeedGr(50);
		this.setLuckGr(15);
		this.setDefGr(20);
		this.setResGr(20);

		this.setStrCap(25);
		this.setSkillCap(26);
		this.setSpeedCap(28);
		this.setDefCap(24);
		this.setResCap(22);
	}

}