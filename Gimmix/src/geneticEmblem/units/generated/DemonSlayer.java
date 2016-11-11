package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class DemonSlayer extends Unit { 

public DemonSlayer() {

    this.setJob("Demon Slayer");
    this.setWeapon(new Saw());
    this.setHpBase(24);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(7);
    this.setSpeedBase(5);
    this.setLuckBase(4);
    this.setDefBase(7);
    this.setResBase(6);

    this.setHpGr(60);
    this.setStrGr(45);
    this.setSkillGr(30);
    this.setSpeedGr(35);
    this.setLuckGr(25);
    this.setDefGr(70);
    this.setResGr(55);

    this.setStrCap(29);
    this.setSkillCap(25);
    this.setSpeedCap(30);
    this.setDefCap(24);
    this.setResCap(22);
    }
}
