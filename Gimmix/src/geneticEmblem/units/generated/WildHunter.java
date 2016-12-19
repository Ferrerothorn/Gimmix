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
		this.setStrGr(50);
		this.setSkillGr(60);
		this.setSpeedGr(45);
		this.setLuckGr(30);
		this.setDefGr(45);
		this.setResGr(35);
	}
}
