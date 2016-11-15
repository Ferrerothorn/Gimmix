package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronBow;

public class Hunter extends Unit {
	
	public Hunter() {
		this.setJob("Hunter");
		this.setWeapon(new IronBow());
		this.setHpBase(22);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(8);
		this.setSpeedBase(8);
		this.setLuckBase(5);
		this.setDefBase(5);
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
