package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Beginner extends Unit { 

public Beginner() {

    this.setJob("Beginner");
    this.setWeapon(new Stick());
	this.setHpBase(26);
	this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(6);
    this.setSpeedBase(7);
    this.setLuckBase(5);
    this.setDefBase(7);
    this.setResBase(5);

    this.setHpGr(48);
    this.setStrGr(49);
    this.setSkillGr(49);
    this.setSpeedGr(49);
    this.setLuckGr(45);
    this.setDefGr(45);
    this.setResGr(45);
    }
}
