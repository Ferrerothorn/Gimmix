package geneticEmblem.units.ootb;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Aran extends Unit {

	public Aran() {
		this.setJob("Aran");
		this.setWeapon(new PoleAxe());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());

		this.setStrBase(9);
		this.setSkillBase(7);
		this.setSpeedBase(6);
		this.setLuckBase(6);
		this.setDefBase(7);
		this.setResBase(2);

		this.setHpGr(75);
		this.setStrGr(60);
		this.setSkillGr(35);
		this.setSpeedGr(45);
		this.setLuckGr(30);
		this.setDefGr(45);
		this.setResGr(25);

		this.setStrCap(30);
		this.setSkillCap(27);
		this.setSpeedCap(30);
		this.setDefCap(23);
		this.setResCap(21);
	}
}