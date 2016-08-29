package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;

import geneticEmblem.weapons.*;

public class BlueMage extends Unit { 

public BlueMage() {

    this.setJob("BlueMage");

    this.setWeapon(new AquaSaber());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(7);
    this.setSpeedBase(6);
    this.setLuckBase(4);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(75);
    this.setStrGr(45);
    this.setSkillGr(25);
    this.setSpeedGr(25);
    this.setLuckGr(60);
    this.setDefGr(60);
    this.setResGr(30);

    this.setStrCap(30);
    this.setSkillCap(21);
    this.setSpeedCap(28);
    this.setDefCap(26);
    this.setResCap(26);
    }
}