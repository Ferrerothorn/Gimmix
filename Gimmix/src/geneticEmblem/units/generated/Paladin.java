package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;

import geneticEmblem.weapons.*;

public class Paladin extends Unit { 

public Paladin() {

    this.setJob("Paladin");

    this.setWeapon(new ArcaneLance());
    this.setHpBase(25);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(5);
    this.setSkillBase(8);
    this.setSpeedBase(6);
    this.setLuckBase(6);
    this.setDefBase(7);
    this.setResBase(5);

    this.setHpGr(30);
    this.setStrGr(45);
    this.setSkillGr(60);
    this.setSpeedGr(60);
    this.setLuckGr(65);
    this.setDefGr(35);
    this.setResGr(25);

    this.setStrCap(27);
    this.setSkillCap(30);
    this.setSpeedCap(26);
    this.setDefCap(24);
    this.setResCap(24);
    }
}