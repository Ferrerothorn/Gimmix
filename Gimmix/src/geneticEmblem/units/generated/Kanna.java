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

		this.setHpGr(40);
		this.setStrGr(65);
		this.setSkillGr(50);
		this.setSpeedGr(70);
		this.setLuckGr(40);
		this.setDefGr(20);
		this.setResGr(45);
	}
}
