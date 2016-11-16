package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Lightning;

public class IceLightning extends Unit {

	public IceLightning() {
		this.setJob("Ice / Lightning");
		this.setWeapon(new Lightning());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(5);
		this.setSpeedBase(8);
		this.setLuckBase(7);
		this.setDefBase(2);
		this.setResBase(6);

		this.setHpGr(35);
		this.setStrGr(60);
		this.setSkillGr(40);
		this.setSpeedGr(60);
		this.setLuckGr(60);
		this.setDefGr(25);
		this.setResGr(40);

		this.setStrCap(28);
		this.setSkillCap(25);
		this.setSpeedCap(26);
		this.setDefCap(22);
		this.setResCap(29);

	}
	
}
