package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class NightWalker extends Unit { 

public NightWalker() {

    this.setJob("Night Walker");
    this.setWeapon(new IronClaw());
    this.setHpBase(23);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(8);
    this.setSpeedBase(8);
    this.setLuckBase(5);
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
