package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Bandit extends Unit { 

public Bandit() {

    this.setJob("Bandit");
    this.setWeapon(new ShadowBlade());
    this.setHpBase(25);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(9);
    this.setSpeedBase(8);
    this.setLuckBase(3);
    this.setDefBase(5);
    this.setResBase(3);

    this.setHpGr(55);
    this.setStrGr(45);
    this.setSkillGr(55);
    this.setSpeedGr(30);
    this.setLuckGr(75);
    this.setDefGr(30);
    this.setResGr(30);

    this.setStrCap(29);
    this.setSkillCap(25);
    this.setSpeedCap(25);
    this.setDefCap(29);
    this.setResCap(22);
    }
}
