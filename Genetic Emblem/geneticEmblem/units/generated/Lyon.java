package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Flux;

public class Lyon extends Unit {

	public Lyon() {
		this.setJob("Lyon");
		this.setWeapon(new Flux());
		this.setHpBase(18);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(-4);
		
		this.setSpeedBase(-6);
		this.setLuckBase(-5);
		this.setDefBase(3);
		this.setResBase(2);

		this.setHpGr(85);
		this.setStrGr(50);
		this.setSkillGr(55);
		this.setSpeedGr(55);
		this.setLuckGr(30);
		this.setDefGr(45);
		this.setResGr(55);

		this.setStrCap(30);
		this.setSkillCap(25);
		this.setSpeedCap(25);
		this.setDefCap(30);
		this.setResCap(30);
	}

}