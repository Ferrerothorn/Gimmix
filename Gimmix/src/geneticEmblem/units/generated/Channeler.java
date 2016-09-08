package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Channeler extends Unit { 

public Channeler() {

    this.setJob("Channeler");
    this.setWeapon(new Channel());
    this.setHpBase(26);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(7);
    this.setSpeedBase(5);
    this.setLuckBase(6);
    this.setDefBase(7);
    this.setResBase(5);

    this.setHpGr(40);
    this.setStrGr(40);
    this.setSkillGr(60);
    this.setSpeedGr(40);
    this.setLuckGr(60);
    this.setDefGr(60);
    this.setResGr(20);

    this.setStrCap(30);
    this.setSkillCap(26);
    this.setSpeedCap(24);
    this.setDefCap(30);
    this.setResCap(20);
    }
}
