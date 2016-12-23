package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Flux;

public class Canas extends Unit {

	public Canas() {
		this.setJob("Canas");
		this.setWeapon(new Flux());
		this.setHpBase(16);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(5);
		this.setDefBase(3);
		this.setResBase(5);

		this.setHpGr(70);
		this.setStrGr(45);
		this.setSkillGr(40);
		this.setSpeedGr(35);
		this.setLuckGr(25);
		this.setDefGr(25);
		this.setResGr(45);

		this.setStrCap(29);
		this.setSkillCap(26);
		this.setSpeedCap(26);
		this.setDefCap(21);
		this.setResCap(28);
	}

}