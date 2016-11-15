package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronDagger;

public class Bandit extends Unit {

	public Bandit() {
		this.setJob("Bandit");
		this.setWeapon(new IronDagger());
		this.setStrBase(7);
		this.setSkillBase(8);
		this.setSpeedBase(7);
		this.setLuckBase(6);
		this.setDefBase(5);
		this.setResBase(4);

		this.setHpGr(40);
		this.setStrGr(55);
		this.setSkillGr(55);
		this.setSpeedGr(55);
		this.setLuckGr(45);
		this.setDefGr(40);
		this.setResGr(30);

		this.setStrCap(27);
		this.setSkillCap(28);
		this.setSpeedCap(27);
		this.setDefCap(25);
		this.setResCap(23);

	}

}
