package geneticEmblem.units.generated;

import geneticEmblem.units.ootb.Unit;
import geneticEmblem.weapons.Thunder;

public class IceLightning extends Unit { 

public IceLightning() { 
    this.setJob("Ice/Lightning");
    this.setWeapon(new Thunder());
    this.setHpBase(21);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(7);
    this.setSpeedBase(9);
    this.setLuckBase(6);
    this.setDefBase(7);
    this.setResBase(1);

    this.setHpGr(40);
    this.setStrGr(30);
    this.setSkillGr(45);
    this.setSpeedGr(35);
    this.setLuckGr(45);
    this.setDefGr(80);
    this.setResGr(35);

    this.setStrCap(25);
    this.setSkillCap(25);
    this.setSpeedCap(24);
    this.setDefCap(29);
    this.setResCap(26);
    }
}
