package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Bishop extends Unit { 

public Bishop() {

    this.setJob("Bishop");
    this.setWeapon(new HolyArrow());
    this.setHpBase(24);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(9);
    this.setSpeedBase(7);
    this.setLuckBase(7);
    this.setDefBase(2);
    this.setResBase(5);

    this.setHpGr(80);
    this.setStrGr(45);
    this.setSkillGr(45);
    this.setSpeedGr(45);
    this.setLuckGr(55);
    this.setDefGr(25);
    this.setResGr(25);

    this.setStrCap(28);
    this.setSkillCap(29);
    this.setSpeedCap(27);
    this.setDefCap(20);
    this.setResCap(26);
    }
}
