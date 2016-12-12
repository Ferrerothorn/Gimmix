package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Mechanic extends Unit {

	public Mechanic() {

		this.setJob("Mechanic");
		this.setWeapon(new Machine());
		this.setHpBase(27);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(8);
		this.setSpeedBase(5);
		this.setLuckBase(3);
		this.setDefBase(8);
		this.setResBase(5);

		this.setHpGr(45);
		this.setStrGr(60);
		this.setSkillGr(45);
		this.setSpeedGr(40);
		this.setLuckGr(40);
		this.setDefGr(60);
		this.setResGr(40);
	}
}
