package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.KannaFan;

public class Kanna extends Unit {

	public Kanna() {
		this.setJob("Kanna");
		this.setWeapon(new KannaFan());
	    this.setHpBase(21);
	    this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(6);
		this.setSpeedBase(9);
		this.setLuckBase(5);
		this.setDefBase(3);
		this.setResBase(6);

		this.setHpGr(40);
		this.setStrGr(60);
		this.setSkillGr(45);
		this.setSpeedGr(65);
		this.setLuckGr(40);
		this.setDefGr(20);
		this.setResGr(50);

		this.setStrCap(30);
		this.setSkillCap(24);
		this.setSpeedCap(30);
		this.setDefCap(21);
		this.setResCap(25);

	}
	
}
