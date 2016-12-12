package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class DemonSlayer extends Unit { 

public DemonSlayer() {

    this.setJob("Demon Slayer");
    this.setWeapon(new IronAxe());
    this.setHpBase(28);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(6);
    this.setSpeedBase(5);
    this.setLuckBase(3);
    this.setDefBase(8);
    this.setResBase(7);

    this.setHpGr(60);
    this.setStrGr(60);
    this.setSkillGr(50);
    this.setSpeedGr(45);
    this.setLuckGr(25);
    this.setDefGr(50);
    this.setResGr(40);
    }
}
