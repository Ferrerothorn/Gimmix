package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.WindBow;

public class WindBreaker extends Unit {

	public WindBreaker() {
		this.setJob("Wind Breaker");
		this.setWeapon(new WindBow());
		this.setHpBase(23);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(8);
		this.setSpeedBase(8);
		this.setLuckBase(4);
		this.setDefBase(3);
		this.setResBase(6);

		this.setHpGr(45);
		this.setStrGr(50);
		this.setSkillGr(60);
		this.setSpeedGr(60);
		this.setLuckGr(40);
		this.setDefGr(40);
		this.setResGr(35);
	}
	
}
