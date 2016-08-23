package geneticEmblem.units.generated;

import geneticEmblem.units.ootb.Unit;

import geneticEmblem.weapons.*;

public class Raider extends Unit { 

public Raider() {

    this.setJob("Raider");

    this.setWeapon(new IronSword());
    this.setHpBase(24);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(7);
    this.setSpeedBase(9);
    this.setLuckBase(6);
    this.setDefBase(4);
    this.setResBase(2);

    this.setHpGr(20);
    this.setStrGr(60);
    this.setSkillGr(55);
    this.setSpeedGr(20);
    this.setLuckGr(60);
    this.setDefGr(75);
    this.setResGr(20);

    this.setStrCap(28);
    this.setSkillCap(25);
    this.setSpeedCap(23);
    this.setDefCap(28);
    this.setResCap(24);
    }
}