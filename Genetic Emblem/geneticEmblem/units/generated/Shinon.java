package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.IronBow;

public class Shinon extends Unit {

	public Shinon() {
		this.setJob("Shinon");
		this.setWeapon(new IronBow());
		this.setBaseCrit(15);
		this.setHpBase(17);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(-4);
		this.setSkillBase(3);
		this.setSpeedBase(0);
		this.setLuckBase(2);
		this.setDefBase(-1);
		this.setResBase(-2);

		this.setHpGr(75);
		this.setStrGr(65);
		this.setSkillGr(70);
		this.setSpeedGr(65);
		this.setLuckGr(35);
		this.setDefGr(50);
		this.setResGr(40);

		this.setStrCap(25);
		this.setSkillCap(30);
		this.setSpeedCap(28);
		this.setDefCap(25);
		this.setResCap(23);
	}
}