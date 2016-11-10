package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class NightWalker extends Unit { 

public NightWalker() {

    this.setJob("Night Walker");
    this.setWeapon(new ShadowBlade());
    this.setHpBase(20);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(9);
    this.setSpeedBase(6);
    this.setLuckBase(4);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(40);
    this.setStrGr(40);
    this.setSkillGr(60);
    this.setSpeedGr(35);
    this.setLuckGr(60);
    this.setDefGr(30);
    this.setResGr(55);

    this.setStrCap(26);
    this.setSkillCap(28);
    this.setSpeedCap(25);
    this.setDefCap(24);
    this.setResCap(27);
    }
}
