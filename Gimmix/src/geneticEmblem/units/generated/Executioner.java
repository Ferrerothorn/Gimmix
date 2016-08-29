package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;

import geneticEmblem.weapons.*;

public class Executioner extends Unit { 

public Executioner() {

    this.setJob("Executioner");

    this.setWeapon(new DevilAxe());
    this.setHpBase(23);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(7);
    this.setSpeedBase(5);
    this.setLuckBase(7);
    this.setDefBase(6);
    this.setResBase(5);

    this.setHpGr(45);
    this.setStrGr(80);
    this.setSkillGr(35);
    this.setSpeedGr(40);
    this.setLuckGr(80);
    this.setDefGr(20);
    this.setResGr(20);

    this.setStrCap(27);
    this.setSkillCap(28);
    this.setSpeedCap(28);
    this.setDefCap(25);
    this.setResCap(23);
    }
}