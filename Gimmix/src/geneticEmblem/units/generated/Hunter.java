package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronBow;

public class Hunter extends Unit {
	
	public Hunter() {
		this.setJob("Hunter");
		this.setWeapon(new IronBow());
		this.setStrBase(6);
		this.setSkillBase(9);
		this.setSpeedBase(8);
		this.setLuckBase(5);
		this.setDefBase(5);
		this.setResBase(4);

		this.setHpGr(40);
		this.setStrGr(50);
		this.setSkillGr(60);
		this.setSpeedGr(65);
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
