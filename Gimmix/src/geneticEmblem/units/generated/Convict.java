package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Convict extends Unit { 

public Convict() {

    this.setJob("Convict");
    this.setWeapon(new MurderersGun());
    this.setHpBase(20);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(8);
    this.setSpeedBase(6);
    this.setLuckBase(3);
    this.setDefBase(7);
    this.setResBase(4);

    this.setHpGr(70);
    this.setStrGr(50);
    this.setSkillGr(50);
    this.setSpeedGr(20);
    this.setLuckGr(40);
    this.setDefGr(70);
    this.setResGr(20);

    this.setStrCap(30);
    this.setSkillCap(27);
    this.setSpeedCap(26);
    this.setDefCap(23);
    this.setResCap(22);
    }
}
