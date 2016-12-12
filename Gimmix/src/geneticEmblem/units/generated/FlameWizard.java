package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Fire;

public class FlameWizard extends Unit {

	public FlameWizard() {
		this.setJob("Flame Wizard");
		this.setWeapon(new Fire());
		this.setHpBase(21);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(10);
		this.setSkillBase(6);
		this.setSpeedBase(9);
		this.setLuckBase(6);
		this.setDefBase(3);
		this.setResBase(7);

		this.setHpGr(40);
		this.setStrGr(60);
		this.setSkillGr(40);
		this.setSpeedGr(60);
		this.setLuckGr(55);
		this.setDefGr(30);
		this.setResGr(45);
	}
}
