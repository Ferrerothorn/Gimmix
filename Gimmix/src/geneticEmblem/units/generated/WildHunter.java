package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class WildHunter extends Unit {
	
	public WildHunter() {
		this.setJob("Wild Hunter");
		this.setWeapon(new Panther());
		this.setHpBase(23);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(7);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(6);
		this.setResBase(4);

		this.setHpGr(50);
		this.setStrGr(45);
		this.setSkillGr(60);
		this.setSpeedGr(60);
		this.setLuckGr(40);
		this.setDefGr(30);
		this.setResGr(35);

		this.setStrCap(25);
		this.setSkillCap(30);
		this.setSpeedCap(29);
		this.setDefCap(23);
		this.setResCap(23);
	}

}
