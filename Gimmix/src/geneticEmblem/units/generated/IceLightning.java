package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Lightning;

public class IceLightning extends Unit {

	public IceLightning() {
		this.setJob("Ice / Lightning");
		this.setWeapon(new Lightning());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(10);
		this.setSkillBase(5);
		this.setSpeedBase(10);
		this.setLuckBase(7);
		this.setDefBase(2);
		this.setResBase(7);

		this.setHpGr(35);
		this.setStrGr(60);
		this.setSkillGr(45);
		this.setSpeedGr(60);
		this.setLuckGr(60);
		this.setDefGr(25);
		this.setResGr(45);
	}
}
