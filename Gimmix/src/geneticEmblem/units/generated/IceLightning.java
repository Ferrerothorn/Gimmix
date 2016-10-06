package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class IceLightning extends Unit { 

public IceLightning() {

    this.setJob("IceLightning");
    this.setWeapon(new Thunder());
    this.setHpBase(23);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(7);
    this.setSpeedBase(6);
    this.setLuckBase(2);
    this.setDefBase(7);
    this.setResBase(6);

    this.setHpGr(45);
    this.setStrGr(75);
    this.setSkillGr(55);
    this.setSpeedGr(30);
    this.setLuckGr(40);
    this.setDefGr(40);
    this.setResGr(35);

    this.setStrCap(29);
    this.setSkillCap(28);
    this.setSpeedCap(20);
    this.setDefCap(29);
    this.setResCap(22);
    }
}
