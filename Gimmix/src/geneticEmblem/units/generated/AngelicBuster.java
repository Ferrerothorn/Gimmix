package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.SoulShooter;

public class AngelicBuster extends Unit {

	public AngelicBuster() {
		this.setJob("Angelic Buster");
		this.setWeapon(new SoulShooter());
	    this.setHpBase(25);
	    this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(8);
		this.setSpeedBase(7);
		this.setLuckBase(3);
		this.setDefBase(5);
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
