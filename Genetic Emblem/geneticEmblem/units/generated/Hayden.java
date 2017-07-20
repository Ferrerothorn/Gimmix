package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;
import geneticEmblem.weapons.SteelBow;

public class Hayden extends Unit {

	public Hayden() {
		this.setJob("Hayden");
		this.setTrait("Mounted");
		this.setWeapon(new SteelBow());
		this.setHpBase(24);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(5);
		this.setSpeedBase(6);
		this.setLuckBase(9);
		this.setDefBase(7);
		this.setResBase(7);

		this.setHpGr(70);
		this.setStrGr(40);
		this.setSkillGr(45);
		this.setSpeedGr(45);
		this.setLuckGr(40);
		this.setDefGr(25);
		this.setResGr(25);

		this.setStrCap(25);
		this.setSkillCap(28);
		this.setSpeedCap(30);
		this.setDefCap(24);
		this.setResCap(23);
	}

}