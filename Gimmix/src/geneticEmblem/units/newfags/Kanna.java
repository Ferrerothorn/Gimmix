package geneticEmblem.units.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Kanna extends Unit { 

public Kanna() {

    this.setJob("Kanna");
    this.setWeapon(new Shade());
    this.setHpBase(20);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(9);
    this.setSpeedBase(5);
    this.setLuckBase(4);
    this.setDefBase(5);
    this.setResBase(5);

    this.setHpGr(65);
    this.setStrGr(55);
    this.setSkillGr(40);
    this.setSpeedGr(25);
    this.setLuckGr(30);
    this.setDefGr(60);
    this.setResGr(45);

    this.setStrCap(30);
    this.setSkillCap(28);
    this.setSpeedCap(27);
    this.setDefCap(24);
    this.setResCap(20);
    }
}
