package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronRake;

public class Henehoe extends Unit {
	
	public Henehoe() {
		this.setJob("Henehoe");
		this.setWeapon(new IronRake());
		this.setStrBase(6);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(9);
		this.setDefBase(5);
		this.setResBase(5);

		this.setHpGr(45);
		this.setStrGr(45);
		this.setSkillGr(45);
		this.setSpeedGr(45);
		this.setLuckGr(50);
		this.setDefGr(45);
		this.setResGr(45);

		this.setStrCap(26);
		this.setSkillCap(26);
		this.setSpeedCap(26);
		this.setDefCap(26);
		this.setResCap(26);

	}

}
