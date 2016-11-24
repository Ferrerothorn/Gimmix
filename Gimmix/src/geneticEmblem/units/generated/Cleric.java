package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Cleric extends Unit { 

public Cleric() {

    this.setJob("Cleric");
    this.setWeapon(new HolyArrow());
    this.setHpBase(23);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(6);
    this.setSpeedBase(7);
    this.setLuckBase(5);
    this.setDefBase(6);
    this.setResBase(7);

    this.setHpGr(55);
    this.setStrGr(70);
    this.setSkillGr(25);
    this.setSpeedGr(60);
    this.setLuckGr(30);
    this.setDefGr(35);
    this.setResGr(45);

    this.setStrCap(24);
    this.setSkillCap(27);
    this.setSpeedCap(24);
    this.setDefCap(27);
    this.setResCap(28);
    }
}
