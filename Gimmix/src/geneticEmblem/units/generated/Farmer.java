package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Farmer extends Unit { 

public Farmer() {

    this.setJob("Farmer");
    this.setWeapon(new IronRake());
    this.setHpBase(20);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(9);
    this.setSpeedBase(8);
    this.setLuckBase(4);
    this.setDefBase(5);
    this.setResBase(5);

    this.setHpGr(75);
    this.setStrGr(40);
    this.setSkillGr(55);
    this.setSpeedGr(30);
    this.setLuckGr(60);
    this.setDefGr(30);
    this.setResGr(30);

    this.setStrCap(24);
    this.setSkillCap(30);
    this.setSpeedCap(25);
    this.setDefCap(24);
    this.setResCap(24);
    }
}
