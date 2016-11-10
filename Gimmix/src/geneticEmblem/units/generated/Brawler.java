package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Knuckleduster;

public class Brawler extends Unit {

	public Brawler() {
		this.setJob("Brawler");
		this.setWeapon(new Knuckleduster());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(9);
		this.setSkillBase(6);
		this.setSpeedBase(5);
		this.setLuckBase(5);
		this.setDefBase(7);
		this.setResBase(5);

		this.setHpGr(65);
		this.setStrGr(70);
		this.setSkillGr(45);
		this.setSpeedGr(40);
		this.setLuckGr(40);
		this.setDefGr(40);
		this.setResGr(20);

		this.setStrCap(29);
		this.setSkillCap(24);
		this.setSpeedCap(25);
		this.setDefCap(28);
		this.setResCap(24);

	}
}
