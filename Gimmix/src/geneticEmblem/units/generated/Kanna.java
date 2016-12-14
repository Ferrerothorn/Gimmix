package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.KannaFan;

public class Kanna extends Unit {

	public Kanna() {
		this.setJob("Kanna");
		this.setWeapon(new KannaFan());
	    this.setHpBase(23);
	    this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(4);
		this.setSpeedBase(8);
		this.setLuckBase(6);
		this.setDefBase(3);
		this.setResBase(6);

		this.setHpGr(5);
		this.setStrGr(5);
		this.setSkillGr(5);
		this.setSpeedGr(5);
		this.setLuckGr(5);
		this.setDefGr(5);
		this.setResGr(5);
	}
}
