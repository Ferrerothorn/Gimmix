package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Merchant extends Unit {

	public Merchant() {
		this.setJob("Merchant");
		this.setWeapon(new PumpkinLance());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(4);
		this.setSpeedBase(7);
		this.setLuckBase(6);
		this.setDefBase(5);
		this.setResBase(8);

		this.setHpGr(50);
		this.setStrGr(30);
		this.setSkillGr(50);
		this.setSpeedGr(40);
		this.setLuckGr(50);
		this.setDefGr(50);
		this.setResGr(60);
	}
}
