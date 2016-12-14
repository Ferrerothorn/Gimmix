package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Aran extends Unit { 

public Aran() {

    this.setJob("Aran");
    this.setWeapon(new IronLance());
    this.setHpBase(28);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(7);
    this.setSpeedBase(6);
    this.setLuckBase(4);
    this.setDefBase(7);
    this.setResBase(4);

	this.setHpGr(5);
	this.setStrGr(5);
	this.setSkillGr(5);
	this.setSpeedGr(5);
	this.setLuckGr(5);
	this.setDefGr(5);
	this.setResGr(5);
    }
}
