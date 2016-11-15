package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class DualBlade extends Unit { 

public DualBlade() {

    this.setJob("Dual Blade");
    this.setWeapon(new IronDagger());
    this.setHpBase(21);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(8);
    this.setSpeedBase(8);
    this.setLuckBase(4);
    this.setDefBase(5);
    this.setResBase(4);

    this.setHpGr(40);
    this.setStrGr(55);
    this.setSkillGr(55);
    this.setSpeedGr(55);
    this.setLuckGr(40);
    this.setDefGr(45);
    this.setResGr(30);

    this.setStrCap(30);
    this.setSkillCap(21);
    this.setSpeedCap(26);
    this.setDefCap(27);
    this.setResCap(26);
    }
}
