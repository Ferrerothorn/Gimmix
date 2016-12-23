package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Flux;

public class Ewan extends Unit {

	public Ewan() {
		this.setJob("Ewan");
		this.setWeapon(new Flux());
		this.setHpBase(17);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(4);
		this.setSpeedBase(6);
		this.setLuckBase(7);
		this.setDefBase(1);
		this.setResBase(5);

		this.setHpGr(50);
		this.setStrGr(45);
		this.setSkillGr(40);
		this.setSpeedGr(35);
		this.setLuckGr(50);
		this.setDefGr(15);
		this.setResGr(40);

		this.setStrCap(29);
		this.setSkillCap(28);
		this.setSpeedCap(27);
		this.setDefCap(21);
		this.setResCap(26);
	}

}