package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class WildHunter extends Unit {

	public WildHunter() {
		this.setJob("Wild Hunter");
		this.setWeapon(new Panther());
		this.setHpBase(27);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(4);
		this.setDefBase(7);
		this.setResBase(5);

		this.setHpGr(50);
		this.setStrGr(60);
		this.setSkillGr(55);
		this.setSpeedGr(50);
		this.setLuckGr(40);
		this.setDefGr(45);
		this.setResGr(30);
	}

}
