package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;
import geneticEmblem.weapons.SilverLance;

public class Syrene extends Unit {

	public Syrene() {
		this.setJob("Syrene");
		this.setWeapon(new SilverLance());
		this.setHpBase(14);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(4);
		this.setSkillBase(4);
		this.setSpeedBase(6);
		this.setLuckBase(1);
		this.setDefBase(6);
		this.setResBase(3);

		this.setHpGr(70);
		this.setStrGr(40);
		this.setSkillGr(50);
		this.setSpeedGr(60);
		this.setLuckGr(30);
		this.setDefGr(20);
		this.setResGr(50);

		this.setStrCap(23);
		this.setSkillCap(25);
		this.setSpeedCap(28);
		this.setDefCap(23);
		this.setResCap(26);
	}

}