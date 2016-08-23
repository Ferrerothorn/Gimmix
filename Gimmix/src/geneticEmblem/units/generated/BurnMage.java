package geneticEmblem.units.generated;

import geneticEmblem.units.ootb.Unit;

import geneticEmblem.weapons.*;


public class BurnMage extends Unit { 

public BurnMage() {

    this.setJob("Burn Mage");

    this.setWeapon(new Fire());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(5);
    this.setSkillBase(9);
    this.setSpeedBase(8);
    this.setLuckBase(4);
    this.setDefBase(6);
    this.setResBase(5);

    this.setHpGr(35);
    this.setStrGr(70);
    this.setSkillGr(50);
    this.setSpeedGr(45);
    this.setLuckGr(35);
    this.setDefGr(55);
    this.setResGr(20);

    this.setStrCap(27);
    this.setSkillCap(26);
    this.setSpeedCap(28);
    this.setDefCap(25);
    this.setResCap(21);
    }
}