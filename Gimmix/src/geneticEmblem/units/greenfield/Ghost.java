package geneticEmblem.units.greenfield;

import geneticEmblem.units.ootb.Unit;

import geneticEmblem.weapons.*;

public class Ghost extends Unit { 

public Ghost() {

    this.setJob("Ghost");

    this.setWeapon(new LightBrand());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(7);
    this.setSpeedBase(5);
    this.setLuckBase(5);
    this.setDefBase(5);
    this.setResBase(6);

    this.setHpGr(55);
    this.setStrGr(45);
    this.setSkillGr(35);
    this.setSpeedGr(45);
    this.setLuckGr(50);
    this.setDefGr(35);
    this.setResGr(45);

    this.setStrCap(29);
    this.setSkillCap(26);
    this.setSpeedCap(29);
    this.setDefCap(20);
    this.setResCap(24);
    }
}