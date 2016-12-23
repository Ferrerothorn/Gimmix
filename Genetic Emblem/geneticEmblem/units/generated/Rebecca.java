package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronBow;

public class Rebecca extends Unit {

	public Rebecca() {
		this.setJob("Rebecca");
		this.setWeapon(new IronBow());
		this.setHpBase(27);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(4);
		this.setSkillBase(5);
		this.setSpeedBase(6);
		this.setLuckBase(4);
		this.setDefBase(3);
		this.setResBase(1);

		this.setHpGr(60);
		this.setStrGr(40);
		this.setSkillGr(50);
		this.setSpeedGr(60);
		this.setLuckGr(50);
		this.setDefGr(15);
		this.setResGr(30);

		this.setStrCap(24);
		this.setSkillCap(30);
		this.setSpeedCap(29);
		this.setDefCap(24);
		this.setResCap(24);
	}
}