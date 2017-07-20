package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Elfire;
import geneticEmblem.weapons.IronLance;

public class Selena extends Unit {

	public Selena() {
		this.setJob("Selena");
		this.setWeapon(new Elfire());
		this.setHpBase(13);
		this.setLv(1);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(1);
		this.setSkillBase(-3);
		this.setSpeedBase(4);
		this.setLuckBase(3);
		this.setDefBase(5);
		this.setResBase(8);

		this.setHpGr(85);
		this.setStrGr(40);
		this.setSkillGr(55);
		this.setSpeedGr(40);
		this.setLuckGr(25);
		this.setDefGr(20);
		this.setResGr(30);

		this.setStrCap(25);
		this.setSkillCap(24);
		this.setSpeedCap(25);
		this.setDefCap(24);
		this.setResCap(28);
	}

}