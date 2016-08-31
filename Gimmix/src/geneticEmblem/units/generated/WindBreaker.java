package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class WindBreaker extends Unit { 

public WindBreaker() {

    this.setJob("Wind Breaker");
    this.setWeapon(new WindBow());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(7);
    this.setSpeedBase(7);
    this.setLuckBase(3);
    this.setDefBase(7);
    this.setResBase(5);

    this.setHpGr(65);
    this.setStrGr(75);
    this.setSkillGr(35);
    this.setSpeedGr(35);
    this.setLuckGr(20);
    this.setDefGr(70);
    this.setResGr(20);

    this.setStrCap(30);
    this.setSkillCap(20);
    this.setSpeedCap(29);
    this.setDefCap(29);
    this.setResCap(20);
    }
}
