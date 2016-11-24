package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronCrossbow;

public class Crossbowman extends Unit {
	
	public Crossbowman() {
		this.setJob("Crossbowman");
		this.setWeapon(new IronCrossbow());
		this.setHpBase(22);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(7);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(6);
		this.setResBase(4);

		this.setHpGr(55);
		this.setStrGr(50);
		this.setSkillGr(55);
		this.setSpeedGr(55);
		this.setLuckGr(40);
		this.setDefGr(35);
		this.setResGr(30);

		this.setStrCap(27);
		this.setSkillCap(28);
		this.setSpeedCap(27);
		this.setDefCap(24);
		this.setResCap(24);

	}

}
