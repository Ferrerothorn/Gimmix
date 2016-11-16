package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Fire;

public class FlameWizard extends Unit {

	public FlameWizard() {
		this.setJob("Flame Wizard");
		this.setWeapon(new Fire());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(6);
		this.setSpeedBase(8);
		this.setLuckBase(6);
		this.setDefBase(3);
		this.setResBase(6);

		this.setHpGr(40);
		this.setStrGr(55);
		this.setSkillGr(40);
		this.setSpeedGr(55);
		this.setLuckGr(55);
		this.setDefGr(30);
		this.setResGr(45);

		this.setStrCap(26);
		this.setSkillCap(26);
		this.setSpeedCap(26);
		this.setDefCap(24);
		this.setResCap(28);
	}
	
}
