package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Knife;

public class Volke extends Unit {

	public Volke() {
		this.setJob("Volke");
		this.setWeapon(new Knife());
		this.setHpBase(19);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(8);
		this.setSpeedBase(7);
		this.setLuckBase(4);
		this.setDefBase(5);
		this.setResBase(2);

		this.setHpGr(65);
		this.setStrGr(55);
		this.setSkillGr(55);
		this.setSpeedGr(65);
		this.setLuckGr(35);
		this.setDefGr(20);
		this.setResGr(10);

		this.setStrCap(23);
		this.setSkillCap(30);
		this.setSpeedCap(30);
		this.setDefCap(22);
		this.setResCap(20);
	}
}