package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Cleric extends Unit { 

public Cleric() {

    this.setJob("Cleric");
    this.setWeapon(new HolyArrow());
    this.setHpBase(23);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(6);
    this.setSpeedBase(8);
    this.setLuckBase(6);
    this.setDefBase(6);
    this.setResBase(8);

    this.setHpGr(55);
    this.setStrGr(50);
    this.setSkillGr(45);
    this.setSpeedGr(50);
    this.setLuckGr(30);
    this.setDefGr(45);
    this.setResGr(55);
    }
}
