package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Gunmaster extends Unit { 

public Gunmaster() {

    this.setJob("Gunmaster");

    this.setWeapon(new IronGun());
    this.setHpBase(26);
    this.setCurrentHp(this.getHpBase());
    this.setBaseCrit(10);
    
    this.setStrBase(5);
    this.setSkillBase(9);
    this.setSpeedBase(9);
    this.setLuckBase(4);
    this.setDefBase(5);
    this.setResBase(5);

    this.setHpGr(25);
    this.setStrGr(45);
    this.setSkillGr(65);
    this.setSpeedGr(75);
    this.setLuckGr(35);
    this.setDefGr(40);
    this.setResGr(35);

    this.setStrCap(24);
    this.setSkillCap(27);
    this.setSpeedCap(30);
    this.setDefCap(20);
    this.setResCap(27);
    }
}