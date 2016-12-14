package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronBow;

public class Hunter extends Unit {
	
	public Hunter() {
		this.setJob("Hunter");
		this.setWeapon(new IronBow());
		this.setHpBase(27);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(7);
		this.setSpeedBase(7);
		this.setLuckBase(4);
		this.setDefBase(6);
		this.setResBase(5);

		this.setHpGr(5);
		this.setStrGr(5);
		this.setSkillGr(5);
		this.setSpeedGr(5);
		this.setLuckGr(5);
		this.setDefGr(5);
		this.setResGr(5);
	}
}
