package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Brigand extends Unit {

	public Brigand() {

		this.setJob("Brigand");
		this.setWeapon(new IronAxe());
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(9);
		this.setSpeedBase(9);
		this.setLuckBase(4);
		this.setDefBase(5);
		this.setResBase(2);

		this.setHpGr(40);
		this.setStrGr(40);
		this.setSkillGr(35);
		this.setSpeedGr(75);
		this.setLuckGr(50);
		this.setDefGr(55);
		this.setResGr(25);

		this.setStrCap(22);
		this.setSkillCap(26);
		this.setSpeedCap(28);
		this.setDefCap(27);
		this.setResCap(28);
	}
}