package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class SearingSpearman extends Unit { 

public SearingSpearman() {

    this.setJob("Searing Spearman");
    this.setWeapon(new ArcaneLance());
    this.setHpBase(25);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(9);
    this.setSpeedBase(9);
    this.setLuckBase(5);
    this.setDefBase(2);
    this.setResBase(4);

    this.setHpGr(25);
    this.setStrGr(65);
    this.setSkillGr(50);
    this.setSpeedGr(45);
    this.setLuckGr(65);
    this.setDefGr(25);
    this.setResGr(45);

    this.setStrCap(27);
    this.setSkillCap(28);
    this.setSpeedCap(26);
    this.setDefCap(22);
    this.setResCap(24);
    }
}
