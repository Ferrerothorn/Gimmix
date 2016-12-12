package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Cannoneer extends Unit { 

public Cannoneer() {

    this.setJob("Cannoneer");
    this.setWeapon(new Cannon());
    this.setHpBase(26);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(6);
    this.setSpeedBase(6);
    this.setLuckBase(4);
    this.setDefBase(7);
    this.setResBase(5);

    this.setHpGr(55);
    this.setStrGr(60);
    this.setSkillGr(45);
    this.setSpeedGr(45);
    this.setLuckGr(40);
    this.setDefGr(50);
    this.setResGr(35);
    }
}
