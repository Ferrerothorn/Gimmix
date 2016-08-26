package geneticEmblem.units.ootb;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Crusader extends Unit {

	public Crusader() {
		this.setJob("Crusader");
		this.setWeapon(new LightBrand());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());

		this.setStrBase(7);
		this.setSkillBase(9);
		this.setSpeedBase(8);
		this.setLuckBase(4);
		this.setDefBase(6);
		this.setResBase(2);

		this.setHpGr(65);
		this.setStrGr(45);
		this.setSkillGr(40);
		this.setSpeedGr(55);
		this.setLuckGr(45);
		this.setDefGr(35);
		this.setResGr(35);

		this.setStrCap(26);
		this.setSkillCap(28);
		this.setSpeedCap(27);
		this.setDefCap(25);
		this.setResCap(22);
	}

}
