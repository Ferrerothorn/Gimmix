package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.WindBow;

public class WindBreaker extends Unit {

	public WindBreaker() {
		this.setJob("Wind Breaker");
		this.setWeapon(new WindBow());
		this.setStrBase(6);
		this.setSkillBase(6);
		this.setSpeedBase(9);
		this.setLuckBase(7);
		this.setDefBase(5);
		this.setResBase(4);

		this.setHpGr(40);
		this.setStrGr(45);
		this.setSkillGr(65);
		this.setSpeedGr(65);
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
