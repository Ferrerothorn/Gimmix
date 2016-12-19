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

	this.setHpGr(35);
	this.setStrGr(45);
	this.setSkillGr(55);
	this.setSpeedGr(50);
	this.setLuckGr(50);
	this.setDefGr(40);
	this.setResGr(40);
    }
}
