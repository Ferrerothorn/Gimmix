package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Beginner extends Unit { 

public Beginner() {

    this.setJob("Beginner");
    this.setWeapon(new IronSword());
	this.setHpBase(24);
	this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(6);
    this.setSpeedBase(6);
    this.setLuckBase(7);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(45);
    this.setStrGr(45);
    this.setSkillGr(45);
    this.setSpeedGr(45);
    this.setLuckGr(50);
    this.setDefGr(45);
    this.setResGr(45);

    this.setStrCap(26);
    this.setSkillCap(26);
    this.setSpeedCap(26);
    this.setDefCap(26);
    this.setResCap(26);
    }
}
