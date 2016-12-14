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

	this.setHpGr(5);
	this.setStrGr(5);
	this.setSkillGr(5);
	this.setSpeedGr(5);
	this.setLuckGr(5);
	this.setDefGr(5);
	this.setResGr(5);
    }
}
