package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Henehoe extends Unit { 

public Henehoe() {

    this.setJob("Henehoe");
    this.setWeapon(new IronRake());
    this.setHpBase(26);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(6);
    this.setSpeedBase(7);
    this.setLuckBase(5);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(60);
    this.setStrGr(40);
    this.setSkillGr(30);
    this.setSpeedGr(55);
    this.setLuckGr(40);
    this.setDefGr(55);
    this.setResGr(40);

    this.setStrCap(26);
    this.setSkillCap(23);
    this.setSpeedCap(29);
    this.setDefCap(30);
    this.setResCap(22);
    }
}
