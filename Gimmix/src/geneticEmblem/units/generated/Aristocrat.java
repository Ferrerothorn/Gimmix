package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;

import geneticEmblem.weapons.*;

public class Aristocrat extends Unit { 

public Aristocrat() {

    this.setJob("Aristocrat");

    this.setWeapon(new Regenerate());
    this.setHpBase(24);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(8);
    this.setSpeedBase(9);
    this.setLuckBase(2);
    this.setDefBase(4);
    this.setResBase(6);

    this.setHpGr(30);
    this.setStrGr(80);
    this.setSkillGr(35);
    this.setSpeedGr(65);
    this.setLuckGr(30);
    this.setDefGr(35);
    this.setResGr(45);

    this.setStrCap(30);
    this.setSkillCap(27);
    this.setSpeedCap(27);
    this.setDefCap(23);
    this.setResCap(24);
    }
}
