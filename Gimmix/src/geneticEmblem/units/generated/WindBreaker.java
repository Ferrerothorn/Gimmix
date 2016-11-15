package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.WindBow;

public class WindBreaker extends Unit {

	public WindBreaker() {
		this.setJob("Wind Breaker");
		this.setWeapon(new WindBow());
		this.setHpBase(22);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(8);
		this.setSpeedBase(8);
		this.setLuckBase(5);
		this.setDefBase(5);
		this.setResBase(4);

		this.setHpGr(50);
		this.setStrGr(45);
		this.setSkillGr(60);
		this.setSpeedGr(60);
		this.setLuckGr(40);
		this.setDefGr(30);
		this.setResGr(35);

		this.setStrCap(24);
		this.setSkillCap(28);
		this.setSpeedCap(28);
		this.setDefCap(25);
		this.setResCap(25);

	}
	
}
