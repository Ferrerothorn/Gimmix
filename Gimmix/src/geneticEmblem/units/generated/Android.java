package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Android extends Unit { 

public Android() {

    this.setJob("Android");
    this.setWeapon(new IronShield());
    this.setHpBase(20);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(6);
    this.setSpeedBase(6);
    this.setLuckBase(5);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(45);
    this.setStrGr(45);
    this.setSkillGr(25);
    this.setSpeedGr(45);
    this.setLuckGr(45);
    this.setDefGr(45);
    this.setResGr(70);

    this.setStrCap(26);
    this.setSkillCap(20);
    this.setSpeedCap(30);
    this.setDefCap(26);
    this.setResCap(29);
    }
}
