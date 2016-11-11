package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Lightning;

public class IceLightning extends Unit {

	public IceLightning() {
		this.setJob("Ice / Lightning");
		this.setWeapon(new Lightning());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(4);
		this.setSpeedBase(7);
		this.setLuckBase(7);
		this.setDefBase(3);
		this.setResBase(8);

		this.setHpGr(40);
		this.setStrGr(55);
		this.setSkillGr(45);
		this.setSpeedGr(60);
		this.setLuckGr(40);
		this.setDefGr(25);
		this.setResGr(55);

		this.setStrCap(28);
		this.setSkillCap(25);
		this.setSpeedCap(26);
		this.setDefCap(22);
		this.setResCap(29);

	}
	
}
