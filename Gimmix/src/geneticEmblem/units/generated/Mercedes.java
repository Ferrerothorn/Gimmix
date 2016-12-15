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

	this.setHpGr(40);
	this.setStrGr(45);
	this.setSkillGr(55);
	this.setSpeedGr(60);
	this.setLuckGr(45);
	this.setDefGr(35);
	this.setResGr(50);
    }
}
