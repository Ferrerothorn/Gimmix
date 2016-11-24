package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class DemonSlayer extends Unit { 

public DemonSlayer() {

    this.setJob("Demon Slayer");
    this.setWeapon(new IronSword());
    this.setHpBase(26);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(7);
    this.setSpeedBase(7);
    this.setLuckBase(5);
    this.setDefBase(6);
    this.setResBase(4);

    this.setHpGr(60);
    this.setStrGr(55);
    this.setSkillGr(60);
    this.setSpeedGr(45);
    this.setLuckGr(25);
    this.setDefGr(40);
    this.setResGr(35);

    this.setStrCap(29);
    this.setSkillCap(25);
    this.setSpeedCap(30);
    this.setDefCap(24);
    this.setResCap(22);
    }
}
