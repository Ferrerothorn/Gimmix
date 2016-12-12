package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Spearman extends Unit {

	public Spearman() {
		this.setJob("Spearman");
		this.setWeapon(new IronLance());
		this.setHpBase(28);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(10);
		this.setSkillBase(7);
		this.setSpeedBase(7);
		this.setLuckBase(7);
		this.setDefBase(7);
		this.setResBase(3);

		this.setHpGr(60);
		this.setStrGr(80);
		this.setSkillGr(50);
		this.setSpeedGr(40);
		this.setLuckGr(25);
		this.setDefGr(45);
		this.setResGr(30);
	}
}
