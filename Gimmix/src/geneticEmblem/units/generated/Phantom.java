package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Phantom extends Unit { 

public Phantom() {

    this.setJob("Phantom");
    this.setWeapon(new Cane());
    this.setHpBase(24);
    this.setCurrentHp(this.getHpBase());
    
    this.setStrBase(6);
    this.setSkillBase(6);
    this.setSpeedBase(8);
    this.setLuckBase(6);
    this.setDefBase(5);
    this.setResBase(5);

	this.setHpGr(5);
	this.setStrGr(5);
	this.setSkillGr(5);
	this.setSpeedGr(5);
	this.setLuckGr(5);
	this.setDefGr(5);
	this.setResGr(5);
    }
}
