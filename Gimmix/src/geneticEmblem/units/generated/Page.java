package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Page extends Unit { 

public Page() {

    this.setJob("Page");
    this.setWeapon(new IronSword());
    this.setHpBase(20);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(7);
    this.setSpeedBase(6);
    this.setLuckBase(7);
    this.setDefBase(6);
    this.setResBase(3);

    this.setHpGr(50);
    this.setStrGr(55);
    this.setSkillGr(30);
    this.setSpeedGr(35);
    this.setLuckGr(70);
    this.setDefGr(60);
    this.setResGr(20);

    this.setStrCap(26);
    this.setSkillCap(26);
    this.setSpeedCap(28);
    this.setDefCap(28);
    this.setResCap(21);
    }
}
