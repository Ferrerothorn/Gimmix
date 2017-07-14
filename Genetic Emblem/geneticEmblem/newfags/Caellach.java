package geneticEmblem.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronAxe;
import geneticEmblem.weapons.IronLance;

public class Caellach extends Unit {

	public Caellach() {
		this.setJob("Caellach");
		this.setWeapon(new IronAxe());
		this.setHpBase(22);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(4);
		this.setSkillBase(1);
		this.setSpeedBase(0);
		this.setLuckBase(8);
		this.setDefBase(6);
		this.setResBase(7);

		this.setHpGr(85);
		this.setStrGr(50);
		this.setSkillGr(45);
		this.setSpeedGr(45);
		this.setLuckGr(20);
		this.setDefGr(30);
		this.setResGr(20);

		this.setStrCap(25);
		this.setSkillCap(30);
		this.setSpeedCap(26);
		this.setDefCap(25);
		this.setResCap(22);
	}

}