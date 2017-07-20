package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Fimbulvetr;
import geneticEmblem.weapons.IronLance;

public class Saleh extends Unit {

	public Saleh() {
		this.setJob("Saleh");
		this.setWeapon(new Fimbulvetr());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(10);
		this.setSkillBase(13);
		this.setSpeedBase(6);
		this.setLuckBase(3);
		this.setDefBase(2);
		this.setResBase(6);

		this.setHpGr(50);
		this.setStrGr(30);
		this.setSkillGr(25);
		this.setSpeedGr(40);
		this.setLuckGr(40);
		this.setDefGr(30);
		this.setResGr(35);

		this.setStrCap(28);
		this.setSkillCap(30);
		this.setSpeedCap(26);
		this.setDefCap(21);
		this.setResCap(25);
	}

}