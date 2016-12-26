package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronBow;

public class Astrid extends Unit {

	public Astrid() {
		this.setJob("Astrid");
		this.setWeapon(new IronBow());
		this.setTrait("Mounted");
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(6);
		this.setSpeedBase(7);
		this.setLuckBase(3);
		this.setDefBase(5);
		this.setResBase(4);

		this.setHpGr(45);
		this.setStrGr(40);
		this.setSkillGr(55);
		this.setSpeedGr(50);
		this.setLuckGr(40);
		this.setDefGr(30);
		this.setResGr(25);

		this.setStrCap(25);
		this.setSkillCap(26);
		this.setSpeedCap(27);
		this.setDefCap(27);
		this.setResCap(26);
	}
}