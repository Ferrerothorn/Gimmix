package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class DualBlade extends Unit { 

public DualBlade() {

    this.setJob("Dual Blade");
    this.setWeapon(new IronDagger());
    this.setHpBase(20);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(6);
    this.setSpeedBase(8);
    this.setLuckBase(2);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(40);
    this.setStrGr(65);
    this.setSkillGr(75);
    this.setSpeedGr(55);
    this.setLuckGr(40);
    this.setDefGr(20);
    this.setResGr(25);

    this.setStrCap(30);
    this.setSkillCap(21);
    this.setSpeedCap(26);
    this.setDefCap(27);
    this.setResCap(26);
    }
}
