package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronAxe;

public class Dorcas extends Unit {

	public Dorcas() {
		this.setJob("Dorcas");
		this.setWeapon(new IronAxe());
		this.setHpBase(28);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(2);
		this.setDefBase(3);
		this.setResBase(0);

		this.setHpGr(80);
		this.setStrGr(60);
		this.setSkillGr(40);
		this.setSpeedGr(20);
		this.setLuckGr(40);
		this.setDefGr(25);
		this.setResGr(15);

		this.setStrCap(30);
		this.setSkillCap(28);
		this.setSpeedCap(26);
		this.setDefCap(26);
		this.setResCap(22);
	}
}