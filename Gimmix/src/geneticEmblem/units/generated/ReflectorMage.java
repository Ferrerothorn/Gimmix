package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class ReflectorMage extends Unit {

	public ReflectorMage() {
		this.setJob("Reflector Mage");
		this.setWeapon(new DivineShield());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(20);

		this.setStrBase(5);
		this.setSkillBase(7);
		this.setSpeedBase(8);
		this.setLuckBase(6);
		this.setDefBase(5);
		this.setResBase(5);

		this.setHpGr(44);
		this.setStrGr(45);
		this.setSkillGr(48);
		this.setSpeedGr(63);
		this.setLuckGr(50);
		this.setDefGr(30);
		this.setResGr(40);

		this.setStrCap(21);
		this.setSkillCap(28);
		this.setSpeedCap(30);
		this.setDefCap(24);
		this.setResCap(26);
	}

}
