package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.WindBow;

public class WindBreaker extends Unit {

	public WindBreaker() {
		this.setJob("Wind Breaker");
		this.setWeapon(new WindBow());
		this.setHpBase(23);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(9);
		this.setSpeedBase(9);
		this.setLuckBase(5);
		this.setDefBase(5);
		this.setResBase(5);

		this.setHpGr(45);
		this.setStrGr(50);
		this.setSkillGr(60);
		this.setSpeedGr(60);
		this.setLuckGr(40);
		this.setDefGr(40);
		this.setResGr(35);
	}
	
}
