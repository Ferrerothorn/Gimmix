package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Mercedes extends Unit { 

public Mercedes() {

    this.setJob("Mercedes");
    this.setWeapon(new DualBowgun());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(9);
    this.setSpeedBase(10);
    this.setLuckBase(5);
    this.setDefBase(5);
    this.setResBase(5);

    this.setHpGr(40);
    this.setStrGr(45);
    this.setSkillGr(60);
    this.setSpeedGr(65);
    this.setLuckGr(40);
    this.setDefGr(40);
    this.setResGr(40);
    }
}
