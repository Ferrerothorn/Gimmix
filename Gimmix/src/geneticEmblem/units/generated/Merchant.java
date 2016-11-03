package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Merchant extends Unit {

	public Merchant() {
		this.setJob("Merchant");
		this.setWeapon(new PumpkinLance());
		this.setStrBase(7);
		this.setSkillBase(9);
		this.setSpeedBase(7);
		this.setLuckBase(6);
		this.setDefBase(4);
		this.setResBase(4);

		this.setHpGr(30);
		this.setStrGr(45);
		this.setSkillGr(55);
		this.setSpeedGr(60);
		this.setLuckGr(70);
		this.setDefGr(30);
		this.setResGr(30);

		this.setStrCap(22);
		this.setSkillCap(28);
		this.setSpeedCap(28);
		this.setDefCap(26);
		this.setResCap(26);

	}
	
}
