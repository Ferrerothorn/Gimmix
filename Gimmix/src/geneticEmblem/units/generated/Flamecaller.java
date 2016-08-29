package geneticEmblem.units.generated;


import geneticEmblem.units.factory.Unit;

import geneticEmblem.weapons.*;

public class Flamecaller extends Unit { 

public Flamecaller() {

    this.setJob("Flamecaller");

    this.setWeapon(new Forblaze());
    this.setHpBase(20);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(8);
    this.setSpeedBase(8);
    this.setLuckBase(4);
    this.setDefBase(5);
    this.setResBase(6);

    this.setHpGr(45);
    this.setStrGr(35);
    this.setSkillGr(25);
    this.setSpeedGr(75);
    this.setLuckGr(35);
    this.setDefGr(50);
    this.setResGr(55);

    this.setStrCap(25);
    this.setSkillCap(26);
    this.setSpeedCap(28);
    this.setDefCap(23);
    this.setResCap(25);
    }
}