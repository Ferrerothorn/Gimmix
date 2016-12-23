package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronAxe;

public class Kieran extends Unit {

	public Kieran() {
		this.setJob("Kieran");
		this.setWeapon(new IronAxe());
		this.setHpBase(23);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(6);
		this.setSkillBase(5);
		this.setSpeedBase(8);
		this.setLuckBase(5);
		this.setDefBase(6);
		this.setResBase(-2);

		this.setHpGr(60);
		this.setStrGr(50);
		this.setSkillGr(50);
		this.setSpeedGr(40);
		this.setLuckGr(25);
		this.setDefGr(40);
		this.setResGr(30);

		this.setStrCap(26);
		this.setSkillCap(26);
		this.setSpeedCap(27);
		this.setDefCap(27);
		this.setResCap(25);
	}
}