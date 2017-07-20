package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Flux;

public class Knoll extends Unit {

	public Knoll() {
		this.setJob("Knoll");
		this.setWeapon(new Flux());
		this.setHpBase(15);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(5);
		this.setSpeedBase(5);
		this.setLuckBase(-2);
		this.setDefBase(1);
		this.setResBase(6);

		this.setHpGr(70);
		this.setStrGr(50);
		this.setSkillGr(40);
		this.setSpeedGr(35);
		this.setLuckGr(20);
		this.setDefGr(10);
		this.setResGr(45);

		this.setStrCap(29);
		this.setSkillCap(26);
		this.setSpeedCap(26);
		this.setDefCap(21);
		this.setResCap(28);
	}

}