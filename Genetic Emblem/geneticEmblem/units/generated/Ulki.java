package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Beak;

public class Ulki extends Unit {

	public Ulki() {
		this.setJob("Ulki");
		this.setWeapon(new Beak());
		
		this.setHpBase(15);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(-1);
		this.setSkillBase(-3);
		this.setSpeedBase(-4);
		this.setLuckBase(1);
		this.setDefBase(5);
		this.setResBase(3);

		this.setHpGr(100);
		this.setStrGr(60);
		this.setSkillGr(65);
		this.setSpeedGr(60);
		this.setLuckGr(35);
		this.setDefGr(35);
		this.setResGr(25);

		this.setStrCap(26);
		this.setSkillCap(35);
		this.setSpeedCap(36);
		this.setDefCap(26);
		this.setResCap(26);
	}
}