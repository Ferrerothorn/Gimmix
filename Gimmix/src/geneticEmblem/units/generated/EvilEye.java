package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class EvilEye extends Unit { 

public EvilEye() {

    this.setJob("Evil Eye");
    this.setWeapon(new DarkClaw());
    this.setHpBase(21);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(5);
    this.setSpeedBase(5);
    this.setLuckBase(7);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(60);
    this.setStrGr(55);
    this.setSkillGr(20);
    this.setSpeedGr(25);
    this.setLuckGr(60);
    this.setDefGr(50);
    this.setResGr(50);

    this.setStrCap(28);
    this.setSkillCap(25);
    this.setSpeedCap(29);
    this.setDefCap(22);
    this.setResCap(26);
    }
}
