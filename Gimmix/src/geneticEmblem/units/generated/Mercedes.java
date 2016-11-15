package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Mercedes extends Unit { 

public Mercedes() {

    this.setJob("Mercedes");
    this.setWeapon(new DualBowgun());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(9);
    this.setSpeedBase(9);
    this.setLuckBase(5);
    this.setDefBase(4);
    this.setResBase(4);

    this.setHpGr(45);
    this.setStrGr(45);
    this.setSkillGr(60);
    this.setSpeedGr(70);
    this.setLuckGr(40);
    this.setDefGr(30);
    this.setResGr(30);

    this.setStrCap(24);
    this.setSkillCap(30);
    this.setSpeedCap(30);
    this.setDefCap(23);
    this.setResCap(23);
    }
}
