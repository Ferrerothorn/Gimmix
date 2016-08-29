package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;

import geneticEmblem.weapons.*;

public class Mageslayer extends Unit { 

public Mageslayer() {

    this.setJob("Mageslayer");

    this.setWeapon(new BoltAxe());
    this.setHpBase(24);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(8);
    this.setSpeedBase(5);
    this.setLuckBase(7);
    this.setDefBase(3);
    this.setResBase(6);

    this.setHpGr(50);
    this.setStrGr(45);
    this.setSkillGr(35);
    this.setSpeedGr(30);
    this.setLuckGr(80);
    this.setDefGr(30);
    this.setResGr(50);

    this.setStrCap(30);
    this.setSkillCap(29);
    this.setSpeedCap(22);
    this.setDefCap(21);
    this.setResCap(27);
    }
}