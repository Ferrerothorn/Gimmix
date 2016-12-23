package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronAxe;

public class Dart extends Unit {

	public Dart() {
		this.setJob("Dart");
		this.setWeapon(new IronAxe());
		this.setHpBase(29);
		this.setBaseCrit(15);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(7);
		this.setSpeedBase(4);
		this.setLuckBase(1);
		this.setDefBase(5);
		this.setResBase(0);

		this.setHpGr(70);
		this.setStrGr(65);
		this.setSkillGr(20);
		this.setSpeedGr(60);
		this.setLuckGr(35);
		this.setDefGr(20);
		this.setResGr(15);

		this.setStrCap(30);
		this.setSkillCap(29);
		this.setSpeedCap(28);
		this.setDefCap(23);
		this.setResCap(21);
	}
}