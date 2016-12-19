package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Beggar extends Unit {

	public Beggar() {

		this.setJob("Beggar");
		this.setWeapon(new IronRake());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(6);
		this.setDefBase(6);
		this.setResBase(6);

		this.setHpGr(45);
		this.setStrGr(50);
		this.setSkillGr(50);
		this.setSpeedGr(50);
		this.setLuckGr(40);
		this.setDefGr(40);
		this.setResGr(40);
	}
}
