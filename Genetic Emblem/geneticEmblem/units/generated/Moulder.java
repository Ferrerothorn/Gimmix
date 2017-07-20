package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;
import geneticEmblem.weapons.Shine;

public class Moulder extends Unit {

	public Moulder() {
		this.setJob("Moulder");
		this.setWeapon(new Shine());
		this.setHpBase(19);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(3);
		this.setSkillBase(5);
		this.setSpeedBase(8);
		this.setLuckBase(1);
		this.setDefBase(2);
		this.setResBase(5);

		this.setHpGr(70);
		this.setStrGr(40);
		this.setSkillGr(50);
		this.setSpeedGr(40);
		this.setLuckGr(20);
		this.setDefGr(25);
		this.setResGr(25);

		this.setStrCap(28);
		this.setSkillCap(30);
		this.setSpeedCap(26);
		this.setDefCap(21);
		this.setResCap(25);
	}

}