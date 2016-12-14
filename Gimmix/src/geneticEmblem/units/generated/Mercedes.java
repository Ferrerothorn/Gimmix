package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Mercedes extends Unit { 

public Mercedes() {

    this.setJob("Mercedes");
    this.setWeapon(new DualBowgun());
    this.setHpBase(23);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(8);
    this.setSpeedBase(8);
    this.setLuckBase(4);
    this.setDefBase(4);
    this.setResBase(6);

	this.setHpGr(5);
	this.setStrGr(5);
	this.setSkillGr(5);
	this.setSpeedGr(5);
	this.setLuckGr(5);
	this.setDefGr(5);
	this.setResGr(5);
    }
}
