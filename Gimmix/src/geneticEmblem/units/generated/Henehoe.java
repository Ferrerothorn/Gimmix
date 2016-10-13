package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Henehoe extends Unit { 

public Henehoe() {

    this.setJob("Henehoe");
    this.setWeapon(new IronRake());
    this.setHpBase(20);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(5);
    this.setSpeedBase(7);
    this.setLuckBase(7);
    this.setDefBase(4);
    this.setResBase(6);

    this.setHpGr(40);
    this.setStrGr(60);
    this.setSkillGr(25);
    this.setSpeedGr(40);
    this.setLuckGr(75);
    this.setDefGr(40);
    this.setResGr(40);

    this.setStrCap(30);
    this.setSkillCap(20);
    this.setSpeedCap(24);
    this.setDefCap(26);
    this.setResCap(30);
    }
}
