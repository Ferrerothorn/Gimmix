package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class TimeMage extends Unit { 

public TimeMage() {

    this.setJob("Time Mage");
    this.setWeapon(new Shade());
    this.setHpBase(23);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(6);
    this.setSpeedBase(6);
    this.setLuckBase(4);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(55);
    this.setStrGr(50);
    this.setSkillGr(50);
    this.setSpeedGr(45);
    this.setLuckGr(25);
    this.setDefGr(65);
    this.setResGr(30);

    this.setStrCap(29);
    this.setSkillCap(26);
    this.setSpeedCap(26);
    this.setDefCap(28);
    this.setResCap(22);
    }
}
