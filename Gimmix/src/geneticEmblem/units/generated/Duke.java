package geneticEmblem.units.generated;

import geneticEmblem.units.ootb.Unit;

import geneticEmblem.weapons.*;

public class Duke extends Unit { 

public Duke() {

    this.setJob("Duke");

    this.setWeapon(new Shine());
    this.setHpBase(20);
    this.setCurrentHp(this.getHpBase());
    this.setBaseCrit(10);
    this.setStrBase(9);
    this.setSkillBase(5);
    this.setSpeedBase(6);
    this.setLuckBase(7);
    this.setDefBase(4);
    this.setResBase(6);

    this.setHpGr(35);
    this.setStrGr(40);
    this.setSkillGr(60);
    this.setSpeedGr(20);
    this.setLuckGr(70);
    this.setDefGr(30);
    this.setResGr(55);

    this.setStrCap(29);
    this.setSkillCap(30);
    this.setSpeedCap(22);
    this.setDefCap(24);
    this.setResCap(24);
    }
}