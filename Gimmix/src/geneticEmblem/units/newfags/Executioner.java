package geneticEmblem.units.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Executioner extends Unit { 

public Executioner() {

    this.setJob("Executioner");
    this.setWeapon(new DevilAxe());
    this.setHpBase(20);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(9);
    this.setSpeedBase(5);
    this.setLuckBase(6);
    this.setDefBase(3);
    this.setResBase(5);

    this.setHpGr(55);
    this.setStrGr(50);
    this.setSkillGr(75);
    this.setSpeedGr(20);
    this.setLuckGr(75);
    this.setDefGr(20);
    this.setResGr(25);

    this.setStrCap(24);
    this.setSkillCap(29);
    this.setSpeedCap(22);
    this.setDefCap(24);
    this.setResCap(28);
    }
}
