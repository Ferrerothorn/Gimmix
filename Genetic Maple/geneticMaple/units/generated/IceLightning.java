package geneticMaple.units.generated;

import geneticMaple.units.factory.Unit;
import geneticMaple.weapons.Lightning;

public class IceLightning extends Unit {

	public IceLightning() {
		this.setJob("Ice / Lightning");
		this.setWeapon(new Lightning());
		this.setHpBase(24);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(5);
		this.setSpeedBase(7);
		this.setLuckBase(4);
		this.setDefBase(3);
		this.setResBase(8);

		this.setHpGr(35);
		this.setStrGr(50);
		this.setSkillGr(30);
		this.setSpeedGr(60);
		this.setLuckGr(55);
		this.setDefGr(30);
		this.setResGr(55);
	}
}
