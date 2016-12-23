package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Fire;

public class Pent extends Unit {

	public Pent() {
		this.setJob("Pent");
		this.setWeapon(new Fire());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(11);
		this.setSkillBase(16);
		this.setSpeedBase(7);
		this.setLuckBase(4);
		this.setDefBase(4);
		this.setResBase(7);

		this.setHpGr(50);
		this.setStrGr(30);
		this.setSkillGr(20);
		this.setSpeedGr(40);
		this.setLuckGr(40);
		this.setDefGr(30);
		this.setResGr(35);

		this.setStrCap(28);
		this.setSkillCap(30);
		this.setSpeedCap(26);
		this.setDefCap(21);
		this.setResCap(25);
	}
}