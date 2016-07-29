package geneticEmblem.units;

import geneticEmblem.weapons.*;

public class Necromancer extends Unit {

	public Necromancer() {
		this.setJob("Necromancer");
		this.setWeapon(new Flux());
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(9);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(5);
		this.setDefBase(4);
		this.setResBase(7);

		this.setHpGr(45);
		this.setStrGr(50);
		this.setSkillGr(50);
		this.setSpeedGr(50);
		this.setLuckGr(30);
		this.setDefGr(45);
		this.setResGr(60);

		this.setStrCap(30);
		this.setSkillCap(25);
		this.setSpeedCap(25);
		this.setDefCap(30);
		this.setResCap(30);
	}
}
