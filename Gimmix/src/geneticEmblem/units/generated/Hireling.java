package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Hireling extends Unit { 

public Hireling() {

    this.setJob("Hireling");
    this.setWeapon(new MurderersGun());
    this.setHpBase(23);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(8);
    this.setSpeedBase(9);
    this.setLuckBase(2);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(55);
    this.setStrGr(45);
    this.setSkillGr(65);
    this.setSpeedGr(45);
    this.setLuckGr(60);
    this.setDefGr(30);
    this.setResGr(20);

    this.setStrCap(28);
    this.setSkillCap(30);
    this.setSpeedCap(26);
    this.setDefCap(23);
    this.setResCap(20);
    }
}
