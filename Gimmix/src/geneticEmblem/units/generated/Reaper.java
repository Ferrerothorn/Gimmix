package geneticEmblem.units.generated;

import geneticEmblem.units.ootb.Unit;
import geneticEmblem.weapons.*;


public class Reaper extends Unit { 


public Reaper() {

    this.setJob("Reaper");

    this.setWeapon(new Flux());
    this.setHpBase(25);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(7);
    this.setSpeedBase(6);
    this.setLuckBase(3);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(75);
    this.setStrGr(40);
    this.setSkillGr(50);
    this.setSpeedGr(80);
    this.setLuckGr(20);
    this.setDefGr(20);
    this.setResGr(25);

    this.setStrCap(25);
    this.setSkillCap(27);
    this.setSpeedCap(29);
    this.setDefCap(25);
    this.setResCap(25);
    }
}