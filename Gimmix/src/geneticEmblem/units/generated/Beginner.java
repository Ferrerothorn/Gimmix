package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Beginner extends Unit { 

public Beginner() {

    this.setJob("Beginner");
    this.setWeapon(new IronSword());
	this.setHpBase(26);
	this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(5);
    this.setSpeedBase(6);
    this.setLuckBase(7);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(75);
    this.setStrGr(60);
    this.setSkillGr(25);
    this.setSpeedGr(25);
    this.setLuckGr(70);
    this.setDefGr(25);
    this.setResGr(40);

    this.setStrCap(28);
    this.setSkillCap(23);
    this.setSpeedCap(27);
    this.setDefCap(25);
    this.setResCap(27);
    }
}
