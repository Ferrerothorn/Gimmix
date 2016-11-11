package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronBow;

public class Crossbowman extends Unit {
	
	public Crossbowman() {
		this.setJob("Crossbowman");
		this.setWeapon(new IronBow());
		this.setHpBase(22);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(7);
		this.setSpeedBase(6);
		this.setLuckBase(4);
		this.setDefBase(7);
		this.setResBase(5);

		this.setHpGr(40);
		this.setStrGr(65);
		this.setSkillGr(65);
		this.setSpeedGr(40);
		this.setLuckGr(25);
		this.setDefGr(45);
		this.setResGr(40);

		this.setStrCap(27);
		this.setSkillCap(28);
		this.setSpeedCap(27);
		this.setDefCap(24);
		this.setResCap(24);

	}

}
