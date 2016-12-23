package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Fire;

public class Erk extends Unit {

	public Erk() {
		this.setJob("Erk");
		this.setWeapon(new Fire());
		this.setHpBase(17);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(6);
		this.setSpeedBase(7);
		this.setLuckBase(3);
		this.setDefBase(2);
		this.setResBase(4);

		this.setHpGr(65);
		this.setStrGr(40);
		this.setSkillGr(40);
		this.setSpeedGr(50);
		this.setLuckGr(30);
		this.setDefGr(20);
		this.setResGr(40);

		this.setStrCap(28);
		this.setSkillCap(30);
		this.setSpeedCap(26);
		this.setDefCap(21);
		this.setResCap(25);
	}
}