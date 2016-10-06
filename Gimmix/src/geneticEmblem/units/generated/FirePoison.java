package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class FirePoison extends Unit { 

public FirePoison() {

    this.setJob("FirePoison");
    this.setWeapon(new Fire());
    this.setHpBase(24);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(5);
    this.setSkillBase(7);
    this.setSpeedBase(8);
    this.setLuckBase(6);
    this.setDefBase(5);
    this.setResBase(6);

    this.setHpGr(75);
    this.setStrGr(20);
    this.setSkillGr(40);
    this.setSpeedGr(50);
    this.setLuckGr(70);
    this.setDefGr(20);
    this.setResGr(45);

    this.setStrCap(20);
    this.setSkillCap(27);
    this.setSpeedCap(29);
    this.setDefCap(23);
    this.setResCap(29);
    }
}
