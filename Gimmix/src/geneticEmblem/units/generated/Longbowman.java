package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Longbowman extends Unit { 

public Longbowman() {

    this.setJob("Longbowman");
    this.setWeapon(new SteelBow());
    this.setHpBase(26);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(7);
    this.setSpeedBase(6);
    this.setLuckBase(5);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(50);
    this.setStrGr(70);
    this.setSkillGr(20);
    this.setSpeedGr(50);
    this.setLuckGr(65);
    this.setDefGr(20);
    this.setResGr(45);

    this.setStrCap(28);
    this.setSkillCap(29);
    this.setSpeedCap(29);
    this.setDefCap(22);
    this.setResCap(22);
    }
}
