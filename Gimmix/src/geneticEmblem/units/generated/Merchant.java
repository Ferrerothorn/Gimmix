package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Merchant extends Unit {

	public Merchant() {
		this.setJob("Merchant");
		this.setWeapon(new PumpkinLance());
		this.setHpBase(24);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(7);
		this.setSpeedBase(9);
		this.setLuckBase(6);
		this.setDefBase(5);
		this.setResBase(4);

		this.setHpGr(40);
		this.setStrGr(40);
		this.setSkillGr(50);
		this.setSpeedGr(60);
		this.setLuckGr(50);
		this.setDefGr(40);
		this.setResGr(40);

		this.setStrCap(22);
		this.setSkillCap(28);
		this.setSpeedCap(28);
		this.setDefCap(26);
		this.setResCap(26);

	}
	
}
