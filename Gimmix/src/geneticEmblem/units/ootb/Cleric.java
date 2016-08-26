package geneticEmblem.units.ootb;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Shine;

public class Cleric extends Unit {

	public Cleric() {
		this.setJob("Cleric");
		this.setWeapon(new Shine());
		this.setHpBase(22);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(6);
		this.setSkillBase(7);
		this.setSpeedBase(8);
		this.setLuckBase(7);
		this.setDefBase(2);
		this.setResBase(6);

		this.setHpGr(50);
		this.setStrGr(50);
		this.setSkillGr(40);
		this.setSpeedGr(40);
		this.setLuckGr(65);
		this.setDefGr(20);
		this.setResGr(55);

		this.setStrCap(25);
		this.setSkillCap(25);
		this.setSpeedCap(26);
		this.setDefCap(21);
		this.setResCap(30);
	}

}
