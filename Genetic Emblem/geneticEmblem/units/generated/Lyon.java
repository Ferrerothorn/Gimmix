package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Flux;

public class Lyon extends Unit {

	public Lyon() {
		this.setJob("Lyon");
		this.setWeapon(new Flux());
		this.setHpBase(16);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(0);
		this.setSpeedBase(0);
		this.setLuckBase(0);
		this.setDefBase(2);
		this.setResBase(1);

		this.setHpGr(85);
		this.setStrGr(50);
		this.setSkillGr(55);
		this.setSpeedGr(55);
		this.setLuckGr(30);
		this.setDefGr(45);
		this.setResGr(55);

		this.setStrCap(20);
		this.setSkillCap(30);
		this.setSpeedCap(30);
		this.setDefCap(20);
		this.setResCap(20);
	}

}