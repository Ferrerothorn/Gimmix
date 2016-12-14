package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class DemonSlayer extends Unit {

	public DemonSlayer() {

		this.setJob("Demon Slayer");
		this.setWeapon(new IronAxe());
		this.setHpBase(28);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(6);
		this.setSpeedBase(5);
		this.setLuckBase(3);
		this.setDefBase(8);
		this.setResBase(7);

		this.setHpGr(5);
		this.setStrGr(5);
		this.setSkillGr(5);
		this.setSpeedGr(5);
		this.setLuckGr(5);
		this.setDefGr(5);
		this.setResGr(5);
	}
}
