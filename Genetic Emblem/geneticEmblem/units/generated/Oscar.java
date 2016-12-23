package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Oscar extends Unit {

	public Oscar() {
		this.setJob("Oscar");
		this.setWeapon(new IronLance());
		this.setHpBase(25);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(5);
		this.setSpeedBase(6);
		this.setLuckBase(4);
		this.setDefBase(7);
		this.setResBase(-1);

		this.setHpGr(55);
		this.setStrGr(45);
		this.setSkillGr(50);
		this.setSpeedGr(45);
		this.setLuckGr(30);
		this.setDefGr(35);
		this.setResGr(30);

		this.setStrCap(26);
		this.setSkillCap(26);
		this.setSpeedCap(27);
		this.setDefCap(27);
		this.setResCap(25);
	}
}