package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronBow;

public class Wil extends Unit {

	public Wil() {
		this.setJob("Wil");
		this.setWeapon(new IronBow());
		this.setHpBase(19);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(5);
		this.setSpeedBase(5);
		this.setLuckBase(6);
		this.setDefBase(5);
		this.setResBase(0);

		this.setHpGr(75);
		this.setStrGr(50);
		this.setSkillGr(50);
		this.setSpeedGr(40);
		this.setLuckGr(40);
		this.setDefGr(20);
		this.setResGr(25);

		this.setStrCap(25);
		this.setSkillCap(30);
		this.setSpeedCap(28);
		this.setDefCap(25);
		this.setResCap(23);
	}
}