package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Beginner extends Unit { 

public Beginner() {

    this.setJob("Beginner");
    this.setWeapon(new IronSword());
	this.setHpBase(24);
	this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(7);
    this.setSpeedBase(7);
    this.setLuckBase(5);
    this.setDefBase(6);
    this.setResBase(5);

    this.setHpGr(50);
    this.setStrGr(50);
    this.setSkillGr(50);
    this.setSpeedGr(50);
    this.setLuckGr(40);
    this.setDefGr(40);
    this.setResGr(40);

    this.setStrCap(26);
    this.setSkillCap(26);
    this.setSpeedCap(26);
    this.setDefCap(26);
    this.setResCap(26);
    }
}
