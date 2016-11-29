package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Mechanic extends Unit {

	public Mechanic() {

		this.setJob("Mechanic");
		this.setWeapon(new Machine());
		this.setHpBase(25);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(8);
		this.setSpeedBase(5);
		this.setLuckBase(5);
		this.setDefBase(7);
		this.setResBase(5);

		this.setHpGr(45);
		this.setStrGr(55);
		this.setSkillGr(40);
		this.setSpeedGr(40);
		this.setLuckGr(40);
		this.setDefGr(60);
		this.setResGr(40);

		this.setStrCap(25);
		this.setSkillCap(30);
		this.setSpeedCap(23);
		this.setDefCap(27);
		this.setResCap(25);
	}
}
