package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Horseslayer;

public class Seth extends Unit {

	public Seth() {
		this.setJob("Seth");
		this.setWeapon(new Horseslayer());
		this.setHpBase(13);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(4);
		this.setSpeedBase(3);
		this.setLuckBase(8);
		this.setDefBase(3);
		this.setResBase(2);

		this.setHpGr(90);
		this.setStrGr(50);
		this.setSkillGr(45);
		this.setSpeedGr(45);
		this.setLuckGr(25);
		this.setDefGr(40);
		this.setResGr(30);

		this.setStrCap(25);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(25);
		this.setResCap(25);
	}

}