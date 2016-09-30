package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;

import geneticEmblem.weapons.*;

public class Mercedes extends Unit { 

public Mercedes() {

    this.setJob("Mercedes");

    this.setWeapon(new IronBow());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(6);
    this.setSpeedBase(9);
    this.setLuckBase(4);
    this.setDefBase(6);
    this.setResBase(3);

    this.setHpGr(50);
    this.setStrGr(60);
    this.setSkillGr(30);
    this.setSpeedGr(55);
    this.setLuckGr(60);
    this.setDefGr(40);
    this.setResGr(25);

    this.setStrCap(30);
    this.setSkillCap(22);
    this.setSpeedCap(30);
    this.setDefCap(25);
    this.setResCap(21);
    }
}