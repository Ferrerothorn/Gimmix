package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Lieutenant extends Unit { 

public Lieutenant() {

    this.setJob("Lieutenant");
    this.setWeapon(new Sunlance());
    this.setHpBase(26);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(7);
    this.setSpeedBase(6);
    this.setLuckBase(5);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(80);
    this.setStrGr(65);
    this.setSkillGr(35);
    this.setSpeedGr(20);
    this.setLuckGr(30);
    this.setDefGr(70);
    this.setResGr(20);

    this.setStrCap(29);
    this.setSkillCap(25);
    this.setSpeedCap(24);
    this.setDefCap(27);
    this.setResCap(22);
    }
}
