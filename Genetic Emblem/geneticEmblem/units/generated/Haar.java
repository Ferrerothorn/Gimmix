package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Knife;
import geneticEmblem.weapons.SteelAxe;

public class Haar extends Unit {

	public Haar() {
		this.setJob("Haar");
		this.setWeapon(new SteelAxe());
		this.setTrait("Mounted");
		this.setTrait("Flying");
		this.setHpBase(28);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(3);
		this.setSkillBase(1);
		this.setSpeedBase(7);
		this.setLuckBase(8);
		this.setDefBase(10);
		this.setResBase(4);

		this.setHpGr(65);
		this.setStrGr(60);
		this.setSkillGr(60);
		this.setSpeedGr(35);
		this.setLuckGr(15);
		this.setDefGr(35);
		this.setResGr(20);

		this.setStrCap(29);
		this.setSkillCap(28);
		this.setSpeedCap(26);
		this.setDefCap(29);
		this.setResCap(22);
	}
}