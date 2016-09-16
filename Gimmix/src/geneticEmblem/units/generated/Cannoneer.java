package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Cannoneer extends Unit { 

public Cannoneer() {

    this.setJob("Cannoneer");
    this.setWeapon(new Cannon());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(7);
    this.setSpeedBase(9);
    this.setLuckBase(3);
    this.setDefBase(6);
    this.setResBase(5);

    this.setHpGr(65);
    this.setStrGr(60);
    this.setSkillGr(40);
    this.setSpeedGr(40);
    this.setLuckGr(60);
    this.setDefGr(30);
    this.setResGr(25);

    this.setStrCap(29);
    this.setSkillCap(27);
    this.setSpeedCap(25);
    this.setDefCap(25);
    this.setResCap(25);
    }
}
