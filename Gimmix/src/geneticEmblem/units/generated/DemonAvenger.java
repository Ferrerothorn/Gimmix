package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Avenger;

public class DemonAvenger extends Unit {

	public DemonAvenger() {
		this.setJob("Demon Avenger");
		this.setWeapon(new Avenger());
	    this.setHpBase(26);
	    this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(5);
		this.setSpeedBase(6);
		this.setLuckBase(4);
		this.setDefBase(8);
		this.setResBase(6);

		this.setHpGr(80);
		this.setStrGr(45);
		this.setSkillGr(35);
		this.setSpeedGr(40);
		this.setLuckGr(35);
		this.setDefGr(65);
		this.setResGr(20);

		this.setStrCap(27);
		this.setSkillCap(24);
		this.setSpeedCap(24);
		this.setDefCap(28);
		this.setResCap(27);

	}
	
}
