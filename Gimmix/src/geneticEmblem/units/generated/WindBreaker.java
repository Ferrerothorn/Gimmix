package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class WindBreaker extends Unit { 

public WindBreaker() {

    this.setJob("WindBreaker");
    this.setWeapon(new WindBow());
    this.setHpBase(21);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(5);
    this.setSpeedBase(6);
    this.setLuckBase(4);
    this.setDefBase(7);
    this.setResBase(6);

    this.setHpGr(60);
    this.setStrGr(55);
    this.setSkillGr(40);
    this.setSpeedGr(50);
    this.setLuckGr(35);
    this.setDefGr(55);
    this.setResGr(25);

    this.setStrCap(26);
    this.setSkillCap(24);
    this.setSpeedCap(28);
    this.setDefCap(29);
    this.setResCap(22);
    }
}
