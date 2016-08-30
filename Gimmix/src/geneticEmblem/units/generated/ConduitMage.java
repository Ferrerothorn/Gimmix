package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;

import geneticEmblem.weapons.*;

public class ConduitMage extends Unit { 

public ConduitMage() {

    this.setJob("Conduit Mage");

    this.setWeapon(new Fire());
    this.setHpBase(26);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(6);
    this.setSpeedBase(7);
    this.setLuckBase(4);
    this.setDefBase(7);
    this.setResBase(4);

    this.setHpGr(45);
    this.setStrGr(60);
    this.setSkillGr(25);
    this.setSpeedGr(35);
    this.setLuckGr(60);
    this.setDefGr(60);
    this.setResGr(35);

    this.setStrCap(30);
    this.setSkillCap(23);
    this.setSpeedCap(30);
    this.setDefCap(26);
    this.setResCap(21);
    }
}