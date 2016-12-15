package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Beginner extends Unit {

	public Beginner() {

		this.setJob("Beginner");
		this.setWeapon(new Stick());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(6);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(7);
		this.setResBase(5);

		this.setHpGr(45);
		this.setStrGr(45);
		this.setSkillGr(45);
		this.setSpeedGr(50);
		this.setLuckGr(50);
		this.setDefGr(50);
		this.setResGr(45);
	}
}
