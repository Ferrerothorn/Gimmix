package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Cremator extends Unit { 

public Cremator() {

    this.setJob("Cremator");
    this.setWeapon(new Forblaze());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(8);
    this.setSpeedBase(8);
    this.setLuckBase(2);
    this.setDefBase(5);
    this.setResBase(6);

    this.setHpGr(30);
    this.setStrGr(45);
    this.setSkillGr(50);
    this.setSpeedGr(75);
    this.setLuckGr(55);
    this.setDefGr(20);
    this.setResGr(45);

    this.setStrCap(29);
    this.setSkillCap(23);
    this.setSpeedCap(30);
    this.setDefCap(20);
    this.setResCap(27);
    }
}
