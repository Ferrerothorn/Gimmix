package geneticEmblem.units.generated;

import geneticEmblem.units.ootb.Unit;

import geneticEmblem.weapons.*;

public class Page extends Unit { 

public Page() {

    this.setJob("Page");

    this.setWeapon(new IronSword());
    this.setHpBase(21);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(7);
    this.setSpeedBase(6);
    this.setLuckBase(7);
    this.setDefBase(6);
    this.setResBase(5);

    this.setHpGr(75);
    this.setStrGr(45);
    this.setSkillGr(50);
    this.setSpeedGr(35);
    this.setLuckGr(30);
    this.setDefGr(55);
    this.setResGr(20);

    this.setStrCap(29);
    this.setSkillCap(24);
    this.setSpeedCap(24);
    this.setDefCap(29);
    this.setResCap(22);
    }
}