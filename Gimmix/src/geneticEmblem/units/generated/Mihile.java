package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Mihile extends Unit { 

public Mihile() {

    this.setJob("Mihile");
    this.setWeapon(new LightBrand());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(7);
    this.setSpeedBase(9);
    this.setLuckBase(4);
    this.setDefBase(6);
    this.setResBase(5);

    this.setHpGr(50);
    this.setStrGr(40);
    this.setSkillGr(75);
    this.setSpeedGr(50);
    this.setLuckGr(45);
    this.setDefGr(35);
    this.setResGr(25);

    this.setStrCap(29);
    this.setSkillCap(30);
    this.setSpeedCap(27);
    this.setDefCap(24);
    this.setResCap(20);
    }
}
