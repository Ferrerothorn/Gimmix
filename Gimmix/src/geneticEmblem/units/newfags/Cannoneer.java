package geneticEmblem.units.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Cannoneer extends Unit { 

public Cannoneer() {

    this.setJob("Cannoneer");
    this.setWeapon(new Cannon());
    this.setHpBase(25);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(7);
    this.setSpeedBase(8);
    this.setLuckBase(4);
    this.setDefBase(5);
    this.setResBase(5);

    this.setHpGr(50);
    this.setStrGr(40);
    this.setSkillGr(25);
    this.setSpeedGr(55);
    this.setLuckGr(75);
    this.setDefGr(35);
    this.setResGr(40);

    this.setStrCap(29);
    this.setSkillCap(25);
    this.setSpeedCap(26);
    this.setDefCap(23);
    this.setResCap(26);
    }
}
