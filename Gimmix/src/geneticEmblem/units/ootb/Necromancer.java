package geneticEmblem.units.ootb;

import geneticEmblem.weapons.*;

public class Necromancer extends Unit {

	public Necromancer() {
		this.setJob("Necromancer");
		this.setWeapon(new Flux());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(8);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(5);
		this.setDefBase(4);
		this.setResBase(7);

		this.setHpGr(48);
		this.setStrGr(48);
		this.setSkillGr(48);
		this.setSpeedGr(48);
		this.setLuckGr(22);
		this.setDefGr(48);
		this.setResGr(48);

		this.setStrCap(27);
		this.setSkillCap(25);
		this.setSpeedCap(25);
		this.setDefCap(27);
		this.setResCap(27);
	}
}
