package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Oswin extends Unit {

	public Oswin() {
		this.setJob("Oswin");
		this.setWeapon(new IronLance());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(10);
		this.setSkillBase(7);
		this.setSpeedBase(3);
		this.setLuckBase(0);
		this.setDefBase(9);
		this.setResBase(1);

		this.setHpGr(90);
		this.setStrGr(40);
		this.setSkillGr(30);
		this.setSpeedGr(30);
		this.setLuckGr(35);
		this.setDefGr(55);
		this.setResGr(30);

		this.setStrCap(29);
		this.setSkillCap(27);
		this.setSpeedCap(24);
		this.setDefCap(30);
		this.setResCap(25);
	}
}