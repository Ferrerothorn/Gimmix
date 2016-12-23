package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.SteelSword;

public class Mia extends Unit {

	public Mia() {
		this.setJob("Mia");
		this.setWeapon(new SteelSword());
		this.setBaseCrit(15);
		this.setHpBase(19);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(8);
		this.setSpeedBase(10);
		this.setLuckBase(4);
		this.setDefBase(6);
		this.setResBase(1);

		this.setHpGr(50);
		this.setStrGr(40);
		this.setSkillGr(45);
		this.setSpeedGr(60);
		this.setLuckGr(45);
		this.setDefGr(20);
		this.setResGr(25);

		this.setStrCap(22);
		this.setSkillCap(29);
		this.setSpeedCap(30);
		this.setDefCap(22);
		this.setResCap(25);
	}
}