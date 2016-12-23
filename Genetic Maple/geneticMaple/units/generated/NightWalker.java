package geneticMaple.units.generated;

import geneticMaple.units.factory.Unit;
import geneticMaple.weapons.*;

public class NightWalker extends Unit { 

public NightWalker() {

    this.setJob("Night Walker");
    this.setWeapon(new Claw());
    this.setHpBase(23);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(8);
    this.setSpeedBase(8);
    this.setLuckBase(6);
    this.setDefBase(3);
    this.setResBase(3);

	this.setHpGr(35);
	this.setStrGr(55);
	this.setSkillGr(40);
	this.setSpeedGr(65);
	this.setLuckGr(50);
	this.setDefGr(35);
	this.setResGr(35);
    }
}
