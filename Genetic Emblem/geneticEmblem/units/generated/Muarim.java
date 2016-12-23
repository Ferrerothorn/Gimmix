package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.TigerClaw;

public class Muarim extends Unit {

	public Muarim() {
		this.setJob("Muarim");
		this.setWeapon(new TigerClaw());
		this.setHpBase(37);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(10);
		this.setSkillBase(7);
		this.setSpeedBase(10);
		this.setLuckBase(8);
		this.setDefBase(7);
		this.setResBase(1);

		this.setHpGr(100);
		this.setStrGr(70);
		this.setSkillGr(70);
		this.setSpeedGr(55);
		this.setLuckGr(35);
		this.setDefGr(60);
		this.setResGr(45);

		this.setStrCap(30);
		this.setSkillCap(33);
		this.setSpeedCap(34);
		this.setDefCap(30);
		this.setResCap(24);
	}
}