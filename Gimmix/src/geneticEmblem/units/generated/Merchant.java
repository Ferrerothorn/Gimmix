package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Merchant extends Unit {

	public Merchant() {
		this.setJob("Merchant");
		this.setWeapon(new PumpkinLance());
		this.setHpBase(24);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(7);
		this.setSpeedBase(9);
		this.setLuckBase(6);
		this.setDefBase(7);
		this.setResBase(4);

		this.setHpGr(45);
		this.setStrGr(45);
		this.setSkillGr(50);
		this.setSpeedGr(55);
		this.setLuckGr(40);
		this.setDefGr(50);
		this.setResGr(45);
	}
}
