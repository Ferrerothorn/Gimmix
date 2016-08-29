package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;

import geneticEmblem.weapons.*;

public class Streetear extends Unit { 

public Streetear() {

    this.setJob("Streetear");

    this.setWeapon(new IronGear());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(6);
    this.setSpeedBase(8);
    this.setLuckBase(7);
    this.setDefBase(3);
    this.setResBase(6);

    this.setHpGr(45);
    this.setStrGr(45);
    this.setSkillGr(25);
    this.setSpeedGr(55);
    this.setLuckGr(65);
    this.setDefGr(35);
    this.setResGr(50);

    this.setStrCap(30);
    this.setSkillCap(23);
    this.setSpeedCap(27);
    this.setDefCap(22);
    this.setResCap(25);
    }
}