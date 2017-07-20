package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronLance;
import geneticEmblem.weapons.KillingEdge;

public class Ismaire extends Unit {

	public Ismaire() {
		this.setJob("Ismaire");
		this.setBaseCrit(15);
		this.setWeapon(new KillingEdge());
		this.setHpBase(14);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(4);
		this.setSpeedBase(9);
		this.setLuckBase(4);
		this.setDefBase(3);
		this.setResBase(9);

		this.setHpGr(75);
		this.setStrGr(30);
		this.setSkillGr(60);
		this.setSpeedGr(55);
		this.setLuckGr(30);
		this.setDefGr(20);
		this.setResGr(25);

		this.setStrCap(22);
		this.setSkillCap(29);
		this.setSpeedCap(30);
		this.setDefCap(22);
		this.setResCap(25);
	}
}