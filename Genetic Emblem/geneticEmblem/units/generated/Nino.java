package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Fire;

public class Nino extends Unit {

	public Nino() {
		this.setJob("Nino");
		this.setWeapon(new Fire());
		this.setHpBase(17);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(6);
		this.setSpeedBase(9);
		this.setLuckBase(8);
		this.setDefBase(3);
		this.setResBase(5);

		this.setHpGr(55);
		this.setStrGr(50);
		this.setSkillGr(55);
		this.setSpeedGr(60);
		this.setLuckGr(45);
		this.setDefGr(15);
		this.setResGr(50);

		this.setStrCap(30);
		this.setSkillCap(28);
		this.setSpeedCap(26);
		this.setDefCap(21);
		this.setResCap(25);
	}
}