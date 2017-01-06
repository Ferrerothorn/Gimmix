package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Knife;

public class Sothe extends Unit {

	public Sothe() {
		this.setJob("Sothe");
		this.setWeapon(new Knife());
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(7);
		this.setSpeedBase(11);
		this.setLuckBase(5);
		this.setDefBase(4);
		this.setResBase(0);

		this.setHpGr(67);
		this.setStrGr(61);
		this.setSkillGr(78);
		this.setSpeedGr(72);
		this.setLuckGr(61);
		this.setDefGr(39);
		this.setResGr(33);

		this.setStrCap(22);
		this.setSkillCap(26);
		this.setSpeedCap(30);
		this.setDefCap(20);
		this.setResCap(15);
	}
}