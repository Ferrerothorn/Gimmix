package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;

import geneticEmblem.weapons.*;

public class BurnMage extends Unit { 

public BurnMage() {

    this.setJob("Burn Mage");

    this.setWeapon(new Fire());
    this.setHpBase(23);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(8);
    this.setSpeedBase(5);
    this.setLuckBase(3);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(50);
    this.setStrGr(65);
    this.setSkillGr(25);
    this.setSpeedGr(40);
    this.setLuckGr(30);
    this.setDefGr(45);
    this.setResGr(65);

    this.setStrCap(25);
    this.setSkillCap(23);
    this.setSpeedCap(30);
    this.setDefCap(21);
    this.setResCap(30);
    }
}