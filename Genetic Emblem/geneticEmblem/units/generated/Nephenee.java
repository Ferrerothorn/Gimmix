package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;

public class Nephenee extends Unit {

	public Nephenee() {
		this.setJob("Nephenee");
		this.setWeapon(new IronLance());
		
		this.setHpBase(19);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(7);
		this.setSpeedBase(8);
		this.setLuckBase(5);
		this.setDefBase(7);
		this.setResBase(2);

		this.setHpGr(55);
		this.setStrGr(40);
		this.setSkillGr(55);
		this.setSpeedGr(55);
		this.setLuckGr(25);
		this.setDefGr(35);
		this.setResGr(25);

		this.setStrCap(25);
		this.setSkillCap(28);
		this.setSpeedCap(26);
		this.setDefCap(28);
		this.setResCap(25);
	}
}