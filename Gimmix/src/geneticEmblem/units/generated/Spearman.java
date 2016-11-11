package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Spearman extends Unit {

	public Spearman() {
		this.setJob("Spearman");
		this.setWeapon(new IronLance());
		this.setHpBase(23);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(5);
		this.setSpeedBase(6);
		this.setLuckBase(6);
		this.setDefBase(6);
		this.setResBase(5);

		this.setHpGr(60);
		this.setStrGr(65);
		this.setSkillGr(45);
		this.setSpeedGr(40);
		this.setLuckGr(40);
		this.setDefGr(45);
		this.setResGr(25);

		this.setStrCap(30);
		this.setSkillCap(25);
		this.setSpeedCap(25);
		this.setDefCap(27);
		this.setResCap(23);

	}
	
}
