package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;

import geneticEmblem.weapons.*;

public class WindBreaker extends Unit { 

public WindBreaker() {

    this.setJob("WindBreaker");

    this.setWeapon(new WindBow());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(8);
    this.setSpeedBase(7);
    this.setLuckBase(7);
    this.setDefBase(3);
    this.setResBase(3);

    this.setHpGr(20);
    this.setStrGr(65);
    this.setSkillGr(65);
    this.setSpeedGr(35);
    this.setLuckGr(65);
    this.setDefGr(35);
    this.setResGr(35);

    this.setStrCap(29);
    this.setSkillCap(28);
    this.setSpeedCap(28);
    this.setDefCap(21);
    this.setResCap(21);
    }
}