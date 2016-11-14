package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class DemonAvenger extends Unit {

	public DemonAvenger() {

		this.setJob("Demon Avenger");
		this.setWeapon(new IronShield());
		this.setHpBase(24);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(7);
		this.setSpeedBase(5);
		this.setLuckBase(4);
		this.setDefBase(6);
		this.setResBase(8);

		this.setHpGr(80);
		this.setStrGr(40);
		this.setSkillGr(40);
		this.setSpeedGr(30);
		this.setLuckGr(20);
		this.setDefGr(50);
		this.setResGr(60);

		this.setStrCap(25);
		this.setSkillCap(28);
		this.setSpeedCap(26);
		this.setDefCap(25);
		this.setResCap(26);
	}
}
