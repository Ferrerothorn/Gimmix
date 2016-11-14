package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Spearman extends Unit {

	public Spearman() {
		this.setJob("Spearman");
		this.setWeapon(new IronLance());
		this.setHpBase(24);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(7);
		this.setSpeedBase(7);
		this.setLuckBase(6);
		this.setDefBase(4);
		this.setResBase(5);

		this.setHpGr(60);
		this.setStrGr(60);
		this.setSkillGr(45);
		this.setSpeedGr(45);
		this.setLuckGr(45);
		this.setDefGr(45);
		this.setResGr(20);

		this.setStrCap(29);
		this.setSkillCap(26);
		this.setSpeedCap(26);
		this.setDefCap(25);
		this.setResCap(24);


	}
	
}
