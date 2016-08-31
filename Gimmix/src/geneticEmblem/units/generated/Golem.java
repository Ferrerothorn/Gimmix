package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Golem extends Unit { 

public Golem() {

    this.setJob("Golem");

    this.setWeapon(new IronShield());
    this.setHpBase(24);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(5);
    this.setSkillBase(7);
    this.setSpeedBase(9);
    this.setLuckBase(4);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(60);
    this.setStrGr(35);
    this.setSkillGr(20);
    this.setSpeedGr(75);
    this.setLuckGr(25);
    this.setDefGr(35);
    this.setResGr(70);

    this.setStrCap(30);
    this.setSkillCap(21);
    this.setSpeedCap(26);
    this.setDefCap(23);
    this.setResCap(30);
    }
}