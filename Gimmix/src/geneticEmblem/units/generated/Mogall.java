package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Mogall extends Unit {

	public Mogall() {
		this.setJob("Mogall");
		this.setWeapon(new Flux());
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(15);

		this.setStrBase(8);
		this.setSkillBase(5);
		this.setSpeedBase(8);
		this.setLuckBase(4);
		this.setDefBase(4);
		this.setResBase(7);

		this.setHpGr(45);
		this.setStrGr(60);
		this.setSkillGr(35);
		this.setSpeedGr(55);
		this.setLuckGr(40);
		this.setDefGr(30);
		this.setResGr(55);

		this.setStrCap(29);
		this.setSkillCap(26);
		this.setSpeedCap(26);
		this.setDefCap(20);
		this.setResCap(29);
	}
}
