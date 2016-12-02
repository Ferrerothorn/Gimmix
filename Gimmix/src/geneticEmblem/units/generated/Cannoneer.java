package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Cannoneer extends Unit { 

public Cannoneer() {

    this.setJob("Cannoneer");
    this.setWeapon(new Cannon());
    this.setHpBase(24);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(7);
    this.setSpeedBase(7);
    this.setLuckBase(5);
    this.setDefBase(6);
    this.setResBase(4);

    this.setHpGr(50);
    this.setStrGr(60);
    this.setSkillGr(45);
    this.setSpeedGr(45);
    this.setLuckGr(30);
    this.setDefGr(50);
    this.setResGr(40);

    this.setStrCap(29);
    this.setSkillCap(26);
    this.setSpeedCap(25);
    this.setDefCap(25);
    this.setResCap(25);
    }
}
