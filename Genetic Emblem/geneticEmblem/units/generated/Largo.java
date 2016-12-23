package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronAxe;

public class Largo extends Unit {

	public Largo() {
		this.setJob("Largo");
		this.setWeapon(new IronAxe());
		this.setHpBase(18);
		this.setBaseCrit(15);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(3);
		this.setSkillBase(9);
		this.setSpeedBase(8);
		this.setLuckBase(4);
		this.setDefBase(4);
		this.setResBase(-2);

		this.setHpGr(80);
		this.setStrGr(70);
		this.setSkillGr(45);
		this.setSpeedGr(45);
		this.setLuckGr(30);
		this.setDefGr(25);
		this.setResGr(20);

		this.setStrCap(30);
		this.setSkillCap(24);
		this.setSpeedCap(28);
		this.setDefCap(25);
		this.setResCap(23);
	}
}