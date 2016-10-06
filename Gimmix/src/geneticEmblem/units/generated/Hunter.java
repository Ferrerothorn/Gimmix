package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Hunter extends Unit { 

public Hunter() {

    this.setJob("Hunter");
    this.setWeapon(new IronBow());
    this.setHpBase(25);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(7);
    this.setSpeedBase(5);
    this.setLuckBase(5);
    this.setDefBase(7);
    this.setResBase(5);

    this.setHpGr(40);
    this.setStrGr(40);
    this.setSkillGr(30);
    this.setSpeedGr(20);
    this.setLuckGr(75);
    this.setDefGr(60);
    this.setResGr(55);

    this.setStrCap(30);
    this.setSkillCap(26);
    this.setSpeedCap(22);
    this.setDefCap(29);
    this.setResCap(24);
    }
}
