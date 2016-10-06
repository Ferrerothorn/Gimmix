package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Spearman extends Unit { 

public Spearman() {

    this.setJob("Spearman");
    this.setWeapon(new IronLance());
    this.setHpBase(23);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(7);
    this.setSpeedBase(7);
    this.setLuckBase(4);
    this.setDefBase(7);
    this.setResBase(5);

    this.setHpGr(65);
    this.setStrGr(40);
    this.setSkillGr(35);
    this.setSpeedGr(35);
    this.setLuckGr(70);
    this.setDefGr(50);
    this.setResGr(25);

    this.setStrCap(28);
    this.setSkillCap(24);
    this.setSpeedCap(26);
    this.setDefCap(28);
    this.setResCap(24);
    }
}
