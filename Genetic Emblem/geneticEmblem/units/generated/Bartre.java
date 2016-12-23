package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronAxe;

public class Bartre extends Unit {

	public Bartre() {
		this.setJob("Bartre");
		this.setWeapon(new IronAxe());
		this.setHpBase(28);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(5);
		this.setSpeedBase(3);
		this.setLuckBase(4);
		this.setDefBase(4);
		this.setResBase(0);

		this.setHpGr(85);
		this.setStrGr(50);
		this.setSkillGr(35);
		this.setSpeedGr(40);
		this.setLuckGr(30);
		this.setDefGr(30);
		this.setResGr(25);

		this.setStrCap(30);
		this.setSkillCap(28);
		this.setSpeedCap(26);
		this.setDefCap(26);
		this.setResCap(22);
	}
}