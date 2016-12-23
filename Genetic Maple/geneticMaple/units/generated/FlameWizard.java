package geneticMaple.units.generated;

import geneticMaple.units.factory.Unit;
import geneticMaple.weapons.FireMagic;

public class FlameWizard extends Unit {

	public FlameWizard() {
		this.setJob("Flame Wizard");
		this.setWeapon(new FireMagic());
		this.setHpBase(23);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(8);
		this.setSkillBase(5);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(4);
		this.setResBase(7);

		this.setHpGr(30);
		this.setStrGr(55);
		this.setSkillGr(30);
		this.setSpeedGr(60);
		this.setLuckGr(50);
		this.setDefGr(30);
		this.setResGr(60);
	}
}