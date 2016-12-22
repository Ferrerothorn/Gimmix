package geneticMaple.units.factory;

import geneticMaple.units.factory.Unit;
import geneticMaple.weapons.Weapon;

public class Custom extends Unit {

	public Custom(Weapon weapon, int baseHP, int strBase, int skillBase, int speedBase, int luckBase, int defBase,
			int resBase, int hpGr, int strGr, int skillGr, int speedGr, int luckGr, int defGr, int resGr) {
		this.setJob("Custom");
		this.setWeapon(weapon);
		this.setHpBase(baseHP);
		this.setCurrentHp(this.getHpBase());

		this.setStrBase(strBase);
		this.setSkillBase(skillBase);
		this.setSpeedBase(speedBase);
		this.setLuckBase(luckBase);
		this.setDefBase(defBase);
		this.setResBase(resBase);

		this.setHpGr(hpGr);
		this.setStrGr(strGr);
		this.setSkillGr(skillGr);
		this.setSpeedGr(speedGr);
		this.setLuckGr(luckGr);
		this.setDefGr(defGr);
		this.setResGr(resGr);
	}
}
