package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronBow;

public class Hunter extends Unit {
	
	public Hunter() {
		this.setJob("Hunter");
		this.setWeapon(new IronBow());
		this.setHpBase(23);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(9);
		this.setSpeedBase(9);
		this.setLuckBase(6);
		this.setDefBase(5);
		this.setResBase(5);

		this.setHpGr(40);
		this.setStrGr(45);
		this.setSkillGr(60);
		this.setSpeedGr(55);
		this.setLuckGr(40);
		this.setDefGr(45);
		this.setResGr(45);
	}

}
