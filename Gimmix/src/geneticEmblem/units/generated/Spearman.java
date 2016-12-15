package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Spearman extends Unit {

	public Spearman() {
		this.setJob("Spearman");
		this.setWeapon(new IronLance());
		this.setHpBase(28);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(5);
		this.setDefBase(8);
		this.setResBase(3);

		this.setHpGr(50);
		this.setStrGr(55);
		this.setSkillGr(50);
		this.setSpeedGr(40);
		this.setLuckGr(40);
		this.setDefGr(60);
		this.setResGr(35);
	}
}
