package geneticEmblem.units.generated;

import geneticEmblem.units.ootb.Unit;

import geneticEmblem.weapons.*;

public class Pirate extends Unit { 

public Pirate() {

    this.setJob("Pirate");

    this.setWeapon(new IronGun());
    this.setHpBase(26);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(6);
    this.setSpeedBase(8);
    this.setLuckBase(4);
    this.setDefBase(7);
    this.setResBase(6);

    this.setHpGr(35);
    this.setStrGr(25);
    this.setSkillGr(20);
    this.setSpeedGr(80);
    this.setLuckGr(75);
    this.setDefGr(40);
    this.setResGr(35);

    this.setStrCap(24);
    this.setSkillCap(22);
    this.setSpeedCap(30);
    this.setDefCap(29);
    this.setResCap(24);
    }
}