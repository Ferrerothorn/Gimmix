package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;

import geneticEmblem.weapons.*;

public class Assassin extends Unit { 

public Assassin() {

    this.setJob("Assassin");

    this.setWeapon(new ShadowBlade());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(8);
    this.setSpeedBase(9);
    this.setLuckBase(3);
    this.setDefBase(5);
    this.setResBase(4);

    this.setHpGr(25);
    this.setStrGr(65);
    this.setSkillGr(65);
    this.setSpeedGr(75);
    this.setLuckGr(20);
    this.setDefGr(40);
    this.setResGr(30);

    this.setStrCap(28);
    this.setSkillCap(26);
    this.setSpeedCap(28);
    this.setDefCap(26);
    this.setResCap(20);
    }
}
