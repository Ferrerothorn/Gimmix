package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Page extends Unit { 

public Page() {

    this.setJob("Page");
    this.setWeapon(new IronSword());
	this.setHpBase(28);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(7);
    this.setSpeedBase(6);
    this.setLuckBase(3);
    this.setDefBase(8);
    this.setResBase(6);

	this.setHpGr(55);
	this.setStrGr(40);
	this.setSkillGr(40);
	this.setSpeedGr(35);
	this.setLuckGr(40);
	this.setDefGr(65);
	this.setResGr(40);
    }
}
