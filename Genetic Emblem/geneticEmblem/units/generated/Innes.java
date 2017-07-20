package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronBow;

public class Innes extends Unit {

	public Innes() {
		this.setJob("Innes");
		this.setWeapon(new IronBow());
		this.setHpBase(17);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(5);
		this.setSpeedBase(6);
		this.setLuckBase(5);
		this.setDefBase(6);
		this.setResBase(4);

		this.setHpGr(75);
		this.setStrGr(40);
		this.setSkillGr(40);
		this.setSpeedGr(45);
		this.setLuckGr(45);
		this.setDefGr(20);
		this.setResGr(25);

		this.setStrCap(25);
		this.setSkillCap(30);
		this.setSpeedCap(28);
		this.setDefCap(25);
		this.setResCap(23);
	}

}