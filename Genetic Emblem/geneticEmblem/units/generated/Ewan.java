package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Flux;

public class Ewan extends Unit {

	public Ewan() {
		this.setJob("Ewan");
		this.setWeapon(new Flux());
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(5);
		this.setSpeedBase(9);
		this.setLuckBase(9);
		this.setDefBase(2);
		this.setResBase(8);

		this.setHpGr(50);
		this.setStrGr(45);
		this.setSkillGr(40);
		this.setSpeedGr(35);
		this.setLuckGr(50);
		this.setDefGr(15);
		this.setResGr(40);

		this.setStrCap(29);
		this.setSkillCap(26);
		this.setSpeedCap(26);
		this.setDefCap(21);
		this.setResCap(28);
	}

}