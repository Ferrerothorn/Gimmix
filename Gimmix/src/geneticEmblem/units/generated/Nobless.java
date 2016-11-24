package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Nobless extends Unit { 

public Nobless() {

    this.setJob("Nobless");
    this.setWeapon(new IronSword());
    this.setHpBase(23);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(7);
    this.setSpeedBase(9);
    this.setLuckBase(5);
    this.setDefBase(4);
    this.setResBase(5);

    this.setHpGr(65);
    this.setStrGr(40);
    this.setSkillGr(40);
    this.setSpeedGr(40);
    this.setLuckGr(55);
    this.setDefGr(40);
    this.setResGr(40);

    this.setStrCap(30);
    this.setSkillCap(22);
    this.setSpeedCap(21);
    this.setDefCap(28);
    this.setResCap(29);
    }
}
