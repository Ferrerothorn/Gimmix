package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;

import geneticEmblem.weapons.*;

public class Kaiser extends Unit { 

public Kaiser() {

    this.setJob("Kaiser");

    this.setWeapon(new BoltAxe());
    this.setHpBase(21);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(8);
    this.setSpeedBase(7);
    this.setLuckBase(3);
    this.setDefBase(7);
    this.setResBase(4);

    this.setHpGr(40);
    this.setStrGr(60);
    this.setSkillGr(40);
    this.setSpeedGr(40);
    this.setLuckGr(45);
    this.setDefGr(60);
    this.setResGr(35);

    this.setStrCap(27);
    this.setSkillCap(26);
    this.setSpeedCap(23);
    this.setDefCap(28);
    this.setResCap(23);
    }
}