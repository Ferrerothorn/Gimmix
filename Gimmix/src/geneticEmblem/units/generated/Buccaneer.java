package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Buccaneer extends Unit { 

public Buccaneer() {

    this.setJob("Buccaneer");

    this.setWeapon(new IronGun());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(7);
    this.setSpeedBase(9);
    this.setLuckBase(2);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(35);
    this.setStrGr(55);
    this.setSkillGr(40);
    this.setSpeedGr(80);
    this.setLuckGr(45);
    this.setDefGr(40);
    this.setResGr(25);

    this.setStrCap(30);
    this.setSkillCap(26);
    this.setSpeedCap(28);
    this.setDefCap(24);
    this.setResCap(21);
    }
}