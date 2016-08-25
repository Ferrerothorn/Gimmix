package geneticEmblem.units.ootb;

import geneticEmblem.units.ootb.Unit;
import geneticEmblem.weapons.*;

public class PortalMage extends Unit {

	public PortalMage() {

		this.setJob("Portal Mage");

		this.setWeapon(new Flux());
		this.setHpBase(26);
		this.setCurrentHp(this.getHpBase());
		this.setStrBase(5);
		this.setSkillBase(6);
		this.setSpeedBase(6);
		this.setLuckBase(7);
		this.setDefBase(7);
		this.setResBase(6);

		this.setHpGr(75);
		this.setStrGr(40);
		this.setSkillGr(35);
		this.setSpeedGr(50);
		this.setLuckGr(20);
		this.setDefGr(50);
		this.setResGr(40);

		this.setStrCap(25);
		this.setSkillCap(25);
		this.setSpeedCap(25);
		this.setDefCap(29);
		this.setResCap(27);
	}
}