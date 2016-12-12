package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Beginner extends Unit { 

public Beginner() {

    this.setJob("Beginner");
    this.setWeapon(new Stick());
	this.setHpBase(24);
	this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(7);
    this.setSpeedBase(7);
    this.setLuckBase(7);
    this.setDefBase(7);
    this.setResBase(6);

    this.setHpGr(48);
    this.setStrGr(49);
    this.setSkillGr(49);
    this.setSpeedGr(49);
    this.setLuckGr(45);
    this.setDefGr(45);
    this.setResGr(45);
    }
}
