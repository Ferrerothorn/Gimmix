package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.RedBreath;

public class Ena extends Unit {

	public Ena() {
		this.setJob("Ena");
		this.setWeapon(new RedBreath());
		this.setHpBase(23);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(10);
		this.setSkillBase(3);
		this.setSpeedBase(-2);
		this.setLuckBase(2);
		this.setDefBase(11);
		this.setResBase(12);

		this.setHpGr(100);
		this.setStrGr(35);
		this.setSkillGr(50);
		this.setSpeedGr(60);
		this.setLuckGr(40);
		this.setDefGr(40);
		this.setResGr(30);

		this.setStrCap(35);
		this.setSkillCap(31);
		this.setSpeedCap(31);
		this.setDefCap(36);
		this.setResCap(30);
	}
}