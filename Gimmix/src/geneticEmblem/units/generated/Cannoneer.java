package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Cannoneer extends Unit { 

public Cannoneer() {

    this.setJob("1.1930678572989677");
    this.setWeapon(new Cannon());
    this.setHpBase(26);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(7);
    this.setSpeedBase(6);
    this.setLuckBase(5);
    this.setDefBase(6);
    this.setResBase(5);

    this.setHpGr(40);
    this.setStrGr(55);
    this.setSkillGr(50);
    this.setSpeedGr(45);
    this.setLuckGr(30);
    this.setDefGr(50);
    this.setResGr(50);

    this.setStrCap(28);
    this.setSkillCap(25);
    this.setSpeedCap(26);
    this.setDefCap(26);
    this.setResCap(25);
    }
}
