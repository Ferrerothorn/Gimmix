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
		this.setSkillBase(10);
		this.setSpeedBase(6);
		this.setLuckBase(4);
		this.setDefBase(7);
		this.setResBase(6);

		this.setHpGr(40);
		this.setStrGr(55);
		this.setSkillGr(65);
		this.setSpeedGr(55);
		this.setLuckGr(40);
		this.setDefGr(40);
		this.setResGr(35);
	}
	
}
