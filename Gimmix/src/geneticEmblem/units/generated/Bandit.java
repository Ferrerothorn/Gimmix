package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Bandit extends Unit { 

public Bandit() {

    this.setJob("Bandit");
    this.setWeapon(new IronAxe());
    this.setHpBase(25);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(6);
    this.setSpeedBase(7);
    this.setLuckBase(5);
    this.setDefBase(7);
    this.setResBase(6);

    this.setHpGr(45);
    this.setStrGr(45);
    this.setSkillGr(30);
    this.setSpeedGr(60);
    this.setLuckGr(60);
    this.setDefGr(40);
    this.setResGr(40);

    this.setStrCap(25);
    this.setSkillCap(26);
    this.setSpeedCap(29);
    this.setDefCap(25);
    this.setResCap(24);
    }
}
