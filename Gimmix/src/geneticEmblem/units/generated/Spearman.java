package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Spearman extends Unit {

	public Spearman() {
		this.setJob("Spearman");
		this.setWeapon(new IronLance());
		this.setStrBase(9);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(6);
		this.setDefBase(6);
		this.setResBase(4);

		this.setHpGr(70);
		this.setStrGr(85);
		this.setSkillGr(45);
		this.setSpeedGr(45);
		this.setLuckGr(25);
		this.setDefGr(40);
		this.setResGr(10);

		this.setStrCap(30);
		this.setSkillCap(25);
		this.setSpeedCap(25);
		this.setDefCap(27);
		this.setResCap(23);

	}
	
}
