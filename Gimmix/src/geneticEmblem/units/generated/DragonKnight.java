package geneticEmblem.units.generated;


import geneticEmblem.units.factory.Unit;

import geneticEmblem.weapons.*;

public class DragonKnight extends Unit { 

public DragonKnight() {

    this.setJob("Dragon Knight");

    this.setWeapon(new SoulSpear());
    this.setHpBase(24);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(8);
    this.setSpeedBase(9);
    this.setLuckBase(3);
    this.setDefBase(4);
    this.setResBase(4);

    this.setHpGr(30);
    this.setStrGr(75);
    this.setSkillGr(35);
    this.setSpeedGr(45);
    this.setLuckGr(55);
    this.setDefGr(35);
    this.setResGr(45);

    this.setStrCap(30);
    this.setSkillCap(20);
    this.setSpeedCap(28);
    this.setDefCap(23);
    this.setResCap(26);
    }
}
