package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class NXHoe extends Unit { 

public NXHoe() {

    this.setJob("NXHoe");
    this.setWeapon(new Saw());
    this.setHpBase(24);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(8);
    this.setSpeedBase(8);
    this.setLuckBase(5);
    this.setDefBase(5);
    this.setResBase(5);

    this.setHpGr(50);
    this.setStrGr(65);
    this.setSkillGr(45);
    this.setSpeedGr(65);
    this.setLuckGr(35);
    this.setDefGr(30);
    this.setResGr(30);

    this.setStrCap(27);
    this.setSkillCap(20);
    this.setSpeedCap(30);
    this.setDefCap(23);
    this.setResCap(30);
    }
}
