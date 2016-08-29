package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;

import geneticEmblem.weapons.*;

public class Defender extends Unit { 

public Defender() {

    this.setJob("Defender");

    this.setWeapon(new IronGear());
    this.setHpBase(26);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(7);
    this.setSpeedBase(5);
    this.setLuckBase(3);
    this.setDefBase(7);
    this.setResBase(6);

    this.setHpGr(65);
    this.setStrGr(40);
    this.setSkillGr(30);
    this.setSpeedGr(30);
    this.setLuckGr(50);
    this.setDefGr(65);
    this.setResGr(40);

    this.setStrCap(25);
    this.setSkillCap(23);
    this.setSpeedCap(30);
    this.setDefCap(27);
    this.setResCap(24);
    }
}