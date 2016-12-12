package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.Fire;

public class FlameWizard extends Unit {

	public FlameWizard() {
		this.setJob("Flame Wizard");
		this.setWeapon(new Fire());
		this.setHpBase(23);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(5);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(4);
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
