package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Rapier;

public class Eliwood extends Unit {

	public Eliwood() {
		this.setJob("Eliwood");
		this.setWeapon(new Rapier());
		this.setTrait("Mounted");
		this.setHpBase(18);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(5);
		this.setSpeedBase(7);
		this.setLuckBase(7);
		this.setDefBase(5);
		this.setResBase(0);

		this.setHpGr(80);
		this.setStrGr(45);
		this.setSkillGr(50);
		this.setSpeedGr(40);
		this.setLuckGr(45);
		this.setDefGr(30);
		this.setResGr(35);

		this.setStrCap(27);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(23);
		this.setResCap(25);
	}
}