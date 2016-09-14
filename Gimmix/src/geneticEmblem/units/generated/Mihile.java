package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Mihile extends Unit { 

public Mihile() {

    this.setJob("Mihile");
    this.setWeapon(new BoltAxe());
    this.setHpBase(20);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(9);
    this.setSpeedBase(6);
    this.setLuckBase(3);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(50);
    this.setStrGr(40);
    this.setSkillGr(50);
    this.setSpeedGr(35);
    this.setLuckGr(25);
    this.setDefGr(60);
    this.setResGr(60);

    this.setStrCap(24);
    this.setSkillCap(27);
    this.setSpeedCap(25);
    this.setDefCap(30);
    this.setResCap(25);
    }
}
