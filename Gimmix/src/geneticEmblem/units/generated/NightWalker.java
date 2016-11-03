package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Flux;

public class NightWalker extends Unit {

	public NightWalker() {
		this.setJob("Night Walker");
		this.setWeapon(new Flux());
		this.setStrBase(7);
		this.setSkillBase(8);
		this.setSpeedBase(9);
		this.setLuckBase(5);
		this.setDefBase(4);
		this.setResBase(4);

		this.setHpGr(35);
		this.setStrGr(45);
		this.setSkillGr(60);
		this.setSpeedGr(60);
		this.setLuckGr(60);
		this.setDefGr(30);
		this.setResGr(30);

		this.setStrCap(25);
		this.setSkillCap(30);
		this.setSpeedCap(30);
		this.setDefCap(22);
		this.setResCap(23);

	}
	
}
