package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronRake;

public class Henehoe extends Unit {
	
	public Henehoe() {
		this.setJob("Henehoe");
		this.setWeapon(new IronRake());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(5);
		this.setSpeedBase(7);
		this.setLuckBase(7);
		this.setDefBase(5);
		this.setResBase(7);

		this.setHpGr(45);
		this.setStrGr(45);
		this.setSkillGr(40);
		this.setSpeedGr(45);
		this.setLuckGr(45);
		this.setDefGr(40);
		this.setResGr(60);

		this.setStrCap(26);
		this.setSkillCap(26);
		this.setSpeedCap(26);
		this.setDefCap(26);
		this.setResCap(26);

	}

}
