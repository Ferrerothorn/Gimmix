package geneticEmblem.units.ootb;

import geneticEmblem.weapons.*;

public class NomadTrooper extends Unit {

	public NomadTrooper() {
		this.setJob("Nomad Trooper");
		this.setWeapon(new IronGear());
		this.setHpBase(22);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(6);
		this.setSkillBase(7);
		this.setSpeedBase(9);
		this.setLuckBase(5);
		this.setDefBase(6);
		this.setResBase(3);

		this.setHpGr(60);
		this.setStrGr(50);
		this.setSkillGr(40);
		this.setSpeedGr(60);
		this.setLuckGr(40);
		this.setDefGr(35);
		this.setResGr(25);

		this.setStrCap(25);
		this.setSkillCap(28);
		this.setSpeedCap(30);
		this.setDefCap(24);
		this.setResCap(23);
	}

}
