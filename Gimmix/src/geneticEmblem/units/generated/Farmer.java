package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;

import geneticEmblem.weapons.*;

public class Farmer extends Unit { 

public Farmer() {

    this.setJob("Farmer");

    this.setWeapon(new IronRake());
    this.setHpBase(25);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(8);
    this.setSpeedBase(7);
    this.setLuckBase(2);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(55);
    this.setStrGr(50);
    this.setSkillGr(50);
    this.setSpeedGr(45);
    this.setLuckGr(45);
    this.setDefGr(30);
    this.setResGr(45);

    this.setStrCap(23);
    this.setSkillCap(29);
    this.setSpeedCap(25);
    this.setDefCap(23);
    this.setResCap(30);
    }
}
