package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Wind;

public class Soren extends Unit {

	public Soren() {
		this.setJob("Soren");
		this.setWeapon(new Wind());
		this.setHpBase(18);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(8);
		this.setSpeedBase(8);
		this.setLuckBase(5);
		this.setDefBase(2);
		this.setResBase(7);

		this.setHpGr(45);
		this.setStrGr(60);
		this.setSkillGr(55);
		this.setSpeedGr(40);
		this.setLuckGr(30);
		this.setDefGr(15);
		this.setResGr(55);

		this.setStrCap(30);
		this.setSkillCap(28);
		this.setSpeedCap(28);
		this.setDefCap(20);
		this.setResCap(28);
	}
}