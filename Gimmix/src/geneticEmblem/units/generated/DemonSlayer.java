package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class DemonSlayer extends Unit { 

public DemonSlayer() {

    this.setJob("Demon Slayer");
    this.setWeapon(new IronSword());
    this.setHpBase(25);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(7);
    this.setSpeedBase(7);
    this.setLuckBase(5);
    this.setDefBase(8);
    this.setResBase(6);

    this.setHpGr(60);
    this.setStrGr(60);
    this.setSkillGr(50);
    this.setSpeedGr(45);
    this.setLuckGr(25);
    this.setDefGr(50);
    this.setResGr(40);
    }
}
