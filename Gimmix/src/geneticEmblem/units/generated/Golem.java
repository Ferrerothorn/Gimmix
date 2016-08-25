package geneticEmblem.units.generated;

import geneticEmblem.units.ootb.Unit;

import geneticEmblem.weapons.*;

public class Golem extends Unit { 

public Golem() {

    this.setJob("Iron Golem");

    this.setWeapon(new DivineShield());
    this.setHpBase(24);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(5);
    this.setSkillBase(7);
    this.setSpeedBase(9);
    this.setLuckBase(4);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(60);
    this.setStrGr(35);
    this.setSkillGr(20);
    this.setSpeedGr(75);
    this.setLuckGr(20);
    this.setDefGr(30);
    this.setResGr(70);

    this.setStrCap(30);
    this.setSkillCap(21);
    this.setSpeedCap(26);
    this.setDefCap(23);
    this.setResCap(30);
    }
}