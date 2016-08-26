package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Duke extends Unit { 

public Duke() {

    this.setJob("Duke");

    this.setWeapon(new Shine());
    this.setHpBase(23);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(8);
    this.setSpeedBase(8);
    this.setLuckBase(4);
    this.setDefBase(7);
    this.setResBase(3);

    this.setHpGr(65);
    this.setStrGr(50);
    this.setSkillGr(45);
    this.setSpeedGr(40);
    this.setLuckGr(80);
    this.setDefGr(20);
    this.setResGr(20);

    this.setStrCap(27);
    this.setSkillCap(30);
    this.setSpeedCap(27);
    this.setDefCap(26);
    this.setResCap(21);
    }
}