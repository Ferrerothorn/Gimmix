package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Henehoe extends Unit { 

public Henehoe() {

    this.setJob("Henehoe");
    this.setWeapon(new RedWhip());
    this.setHpBase(24);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(6);
    this.setSpeedBase(7);
    this.setLuckBase(5);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(50);
    this.setStrGr(45);
    this.setSkillGr(55);
    this.setSpeedGr(45);
    this.setLuckGr(35);
    this.setDefGr(45);
    this.setResGr(45);

    this.setStrCap(26);
    this.setSkillCap(23);
    this.setSpeedCap(29);
    this.setDefCap(30);
    this.setResCap(22);
    }
}
