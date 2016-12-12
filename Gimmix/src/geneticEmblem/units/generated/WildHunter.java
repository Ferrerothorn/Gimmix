package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class WildHunter extends Unit {

	public WildHunter() {
		this.setJob("Wild Hunter");
		this.setWeapon(new Panther());
		this.setHpBase(27);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(9);
		this.setSpeedBase(8);
		this.setLuckBase(5);
		this.setDefBase(6);
		this.setResBase(4);

		this.setHpGr(50);
		this.setStrGr(60);
		this.setSkillGr(55);
		this.setSpeedGr(50);
		this.setLuckGr(40);
		this.setDefGr(45);
		this.setResGr(30);
	}

}
