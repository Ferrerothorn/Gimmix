package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Wyvern extends Unit { 

public Wyvern() {

    this.setJob("Wyvern");
    this.setWeapon(new Flamethrower());
    this.setHpBase(21);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(9);
    this.setSpeedBase(6);
    this.setLuckBase(3);
    this.setDefBase(7);
    this.setResBase(5);

    this.setHpGr(35);
    this.setStrGr(40);
    this.setSkillGr(60);
    this.setSpeedGr(35);
    this.setLuckGr(75);
    this.setDefGr(40);
    this.setResGr(35);

    this.setStrCap(25);
    this.setSkillCap(29);
    this.setSpeedCap(24);
    this.setDefCap(29);
    this.setResCap(22);
    }
}
