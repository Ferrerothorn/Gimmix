package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.LightBrand;

public class Mihile extends Unit {
	public Mihile() {
		this.setJob("Mihile");
		this.setWeapon(new LightBrand());
		this.setStrBase(8);
		this.setSkillBase(8);
		this.setSpeedBase(6);
		this.setLuckBase(4);
		this.setDefBase(6);
		this.setResBase(5);

		this.setHpGr(55);
		this.setStrGr(60);
		this.setSkillGr(40);
		this.setSpeedGr(40);
		this.setLuckGr(30);
		this.setDefGr(65);
		this.setResGr(30);

		this.setStrCap(27);
		this.setSkillCap(25);
		this.setSpeedCap(25);
		this.setDefCap(28);
		this.setResCap(25);
	}
}