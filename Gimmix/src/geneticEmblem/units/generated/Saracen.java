package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Saracen extends Unit { 

public Saracen() {

    this.setJob("Saracen");
    this.setWeapon(new LightBrand());
    this.setHpBase(21);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(8);
    this.setSpeedBase(5);
    this.setLuckBase(7);
    this.setDefBase(6);
    this.setResBase(4);

    this.setHpGr(65);
    this.setStrGr(40);
    this.setSkillGr(50);
    this.setSpeedGr(35);
    this.setLuckGr(60);
    this.setDefGr(45);
    this.setResGr(25);

    this.setStrCap(22);
    this.setSkillCap(30);
    this.setSpeedCap(26);
    this.setDefCap(26);
    this.setResCap(23);
    }
}
