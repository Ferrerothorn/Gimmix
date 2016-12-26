package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Fire;

public class Priscilla extends Unit {

	public Priscilla() {
		this.setJob("Priscilla");
		this.setWeapon(new Fire());
		this.setTrait("Mounted");
		this.setHpBase(15);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(5);
		this.setSpeedBase(7);
		this.setLuckBase(6);
		this.setDefBase(3);
		this.setResBase(5);

		this.setHpGr(45);
		this.setStrGr(40);
		this.setSkillGr(50);
		this.setSpeedGr(40);
		this.setLuckGr(65);
		this.setDefGr(15);
		this.setResGr(50);

		this.setStrCap(25);
		this.setSkillCap(24);
		this.setSpeedCap(25);
		this.setDefCap(24);
		this.setResCap(28);
	}
}