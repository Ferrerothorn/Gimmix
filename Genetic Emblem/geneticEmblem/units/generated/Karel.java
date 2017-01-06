package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.KillingEdge;

public class Karel extends Unit {

	public Karel() {
		this.setJob("Karel");
		this.setWeapon(new KillingEdge());
		this.setHpBase(12);
		this.setBaseCrit(15);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(10);
		this.setSpeedBase(7);
		this.setLuckBase(7);
		this.setDefBase(10);
		this.setResBase(8);

		this.setHpGr(70);
		this.setStrGr(30);
		this.setSkillGr(50);
		this.setSpeedGr(50);
		this.setLuckGr(30);
		this.setDefGr(10);
		this.setResGr(15);

		this.setStrCap(24);
		this.setSkillCap(29);
		this.setSpeedCap(30);
		this.setDefCap(22);
		this.setResCap(23);
	}
}