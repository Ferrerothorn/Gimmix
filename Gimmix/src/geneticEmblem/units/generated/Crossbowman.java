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
		this.setLuckBase(5);
		this.setDefBase(7);
		this.setResBase(4);

		this.setHpGr(40);
		this.setStrGr(60);
		this.setSkillGr(50);
		this.setSpeedGr(50);
		this.setLuckGr(40);
		this.setDefGr(40);
		this.setResGr(40);

		this.setStrCap(27);
		this.setSkillCap(28);
		this.setSpeedCap(27);
		this.setDefCap(24);
		this.setResCap(24);

	}

}
