package geneticEmblem.units.generated;

import geneticEmblem.units.ootb.Unit;
import geneticEmblem.weapons.Weapon;

public class Custom extends Unit {

	public Custom(Weapon newWeapon, int baseHP, int strBase, int skillBase, int speedBase, int luckBase,
			int defBase, int resBase, int hpGr, int strGr, int skillGr, int speedGr, int luckGr, int defGr, int resGr,
			int strCap, int speedCap, int skillCap, int defCap, int resCap) {
		this.setJob("Custom");
		this.setWeapon(newWeapon);
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

		this.setStrCap(strCap);
		this.setSkillCap(skillCap);
		this.setSpeedCap(speedCap);
		this.setDefCap(defCap);
		this.setResCap(resCap);
	}
}
