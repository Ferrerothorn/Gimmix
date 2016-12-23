package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.CatClaw;

public class Ranulf extends Unit {

	public Ranulf() {
		this.setJob("Ranulf");
		this.setWeapon(new CatClaw());
		this.setHpBase(37);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(15);
		this.setSkillBase(13);
		this.setSpeedBase(13);
		this.setLuckBase(10);
		this.setDefBase(14);
		this.setResBase(4);

		this.setHpGr(100);
		this.setStrGr(50);
		this.setSkillGr(55);
		this.setSpeedGr(55);
		this.setLuckGr(35);
		this.setDefGr(35);
		this.setResGr(20);

		this.setStrCap(29);
		this.setSkillCap(34);
		this.setSpeedCap(35);
		this.setDefCap(30);
		this.setResCap(24);
	}
}