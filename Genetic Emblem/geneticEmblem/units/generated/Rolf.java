package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronBow;

public class Rolf extends Unit {

	public Rolf() {
		this.setJob("Rolf");
		this.setWeapon(new IronBow());
		this.setHpBase(18);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(8);
		this.setSpeedBase(6);
		this.setLuckBase(4);
		this.setDefBase(6);
		this.setResBase(2);

		this.setHpGr(60);
		this.setStrGr(40);
		this.setSkillGr(45);
		this.setSpeedGr(50);
		this.setLuckGr(40);
		this.setDefGr(30);
		this.setResGr(25);

		this.setStrCap(25);
		this.setSkillCap(30);
		this.setSpeedCap(28);
		this.setDefCap(25);
		this.setResCap(23);
	}
}