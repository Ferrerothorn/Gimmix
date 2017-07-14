package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Riev extends Unit {

	public Riev() {
		this.setJob("Riev");
		this.setWeapon(new IronLance());
		this.setHpBase(24);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(-1);
		this.setSkillBase(4);
		this.setSpeedBase(6);
		this.setLuckBase(4);
		this.setDefBase(9);
		this.setResBase(3);

		this.setHpGr(75);
		this.setStrGr(45);
		this.setSkillGr(50);
		this.setSpeedGr(40);
		this.setLuckGr(15);
		this.setDefGr(20);
		this.setResGr(45);

		this.setStrCap(25);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(22);
		this.setResCap(30);
	}

}