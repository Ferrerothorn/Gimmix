package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;

import geneticEmblem.weapons.*;

public class Dandy extends Unit { 

public Dandy() {

    this.setJob("Dandy");

    this.setWeapon(new Rapier());
    this.setHpBase(25);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(9);
    this.setSpeedBase(5);
    this.setLuckBase(3);
    this.setDefBase(5);
    this.setResBase(6);

    this.setHpGr(30);
    this.setStrGr(55);
    this.setSkillGr(65);
    this.setSpeedGr(45);
    this.setLuckGr(35);
    this.setDefGr(45);
    this.setResGr(45);

    this.setStrCap(26);
    this.setSkillCap(30);
    this.setSpeedCap(23);
    this.setDefCap(21);
    this.setResCap(27);
    }
}