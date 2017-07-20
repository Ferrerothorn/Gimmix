package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Spear;

public class Glen extends Unit {

	public Glen() {
		this.setJob("Glen");
		this.setWeapon(new Spear());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(3);
		this.setSpeedBase(0);
		this.setLuckBase(1);
		this.setDefBase(8);
		this.setResBase(-7);

		this.setHpGr(85);
		this.setStrGr(45);
		this.setSkillGr(50);
		this.setSpeedGr(45);
		this.setLuckGr(20);
		this.setDefGr(35);
		this.setResGr(40);

		this.setStrCap(27);
		this.setSkillCap(25);
		this.setSpeedCap(23);
		this.setDefCap(28);
		this.setResCap(22);
	}

}