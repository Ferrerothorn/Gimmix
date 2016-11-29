package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.SoulShooter;

public class AngelicBuster extends Unit {

	public AngelicBuster() {
		this.setJob("Angelic Buster");
		this.setWeapon(new SoulShooter());
	    this.setHpBase(24);
	    this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(9);
		this.setSpeedBase(6);
		this.setLuckBase(4);
		this.setDefBase(5);
		this.setResBase(5);

		this.setHpGr(40);
		this.setStrGr(45);
		this.setSkillGr(60);
		this.setSpeedGr(45);
		this.setLuckGr(40);
		this.setDefGr(40);
		this.setResGr(50);

		this.setStrCap(27);
		this.setSkillCap(30);
		this.setSpeedCap(25);
		this.setDefCap(24);
		this.setResCap(24);

	}
	
}
