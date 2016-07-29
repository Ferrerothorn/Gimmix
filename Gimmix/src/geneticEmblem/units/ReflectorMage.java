package geneticEmblem.units;

import geneticEmblem.weapons.*;

public class ReflectorMage extends Unit {

	public ReflectorMage() {
		this.setJob("Reflector Mage");
		this.setWeapon(new DivineShield());
		this.setHpBase(28);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(7);
		this.setSkillBase(8);
		this.setSpeedBase(8);
		this.setLuckBase(6);
		this.setDefBase(5);
		this.setResBase(4);

		this.setHpGr(40);
		this.setStrGr(45);
		this.setSkillGr(55);
		this.setSpeedGr(60);
		this.setLuckGr(50);
		this.setDefGr(20);
		this.setResGr(40);

		this.setStrCap(22);
		this.setSkillCap(28);
		this.setSpeedCap(31);
		this.setDefCap(24);
		this.setResCap(26);
	}

}
