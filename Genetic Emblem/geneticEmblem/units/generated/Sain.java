package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.HandAxe;

public class Sain extends Unit {

	public Sain() {
		this.setJob("Sain");
		this.setTrait("Mounted");
		this.setHpBase(19);
		this.setCurrentHp(this.getHpBase());
		this.setWeapon(new HandAxe());
		this.setStrBase(8);
		this.setSkillBase(4);
		this.setSpeedBase(6);
		this.setLuckBase(4);
		this.setDefBase(6);
		this.setResBase(0);

		this.setHpGr(80);
		this.setStrGr(60);
		this.setSkillGr(35);
		this.setSpeedGr(40);
		this.setLuckGr(35);
		this.setDefGr(20);
		this.setResGr(20);

		this.setStrCap(25);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(25);
		this.setResCap(25);
	}
}