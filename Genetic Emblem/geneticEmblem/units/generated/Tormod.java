package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Fire;

public class Tormod extends Unit {

	public Tormod() {
		this.setJob("Tormod");
		this.setWeapon(new Fire());
		this.setHpBase(17);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(7);
		this.setSkillBase(7);
		this.setSpeedBase(6);
		this.setLuckBase(6);
		this.setDefBase(3);
		this.setResBase(6);

		this.setHpGr(50);
		this.setStrGr(45);
		this.setSkillGr(40);
		this.setSpeedGr(45);
		this.setLuckGr(35);
		this.setDefGr(25);
		this.setResGr(45);

		this.setStrCap(30);
		this.setSkillCap(28);
		this.setSpeedCap(28);
		this.setDefCap(20);
		this.setResCap(28);
	}
}