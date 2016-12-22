package geneticMaple.units.generated;

import geneticMaple.units.factory.Unit;
import geneticMaple.weapons.*;

public class Merchant extends Unit {

	public Merchant() {
		this.setJob("Merchant");
		this.setWeapon(new PumpkinLance());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(4);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(6);
		this.setResBase(8);

		this.setHpGr(40);
		this.setStrGr(50);
		this.setSkillGr(35);
		this.setSpeedGr(45);
		this.setLuckGr(40);
		this.setDefGr(40);
		this.setResGr(60);
	}
}
