package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class NightWalker extends Unit { 

public NightWalker() {

    this.setJob("Night Walker");
    this.setWeapon(new DarkClaw());
    this.setHpBase(21);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(8);
    this.setSpeedBase(8);
    this.setLuckBase(5);
    this.setDefBase(4);
    this.setResBase(4);

    this.setHpGr(40);
    this.setStrGr(50);
    this.setSkillGr(55);
    this.setSpeedGr(60);
    this.setLuckGr(55);
    this.setDefGr(30);
    this.setResGr(30);

    this.setStrCap(26);
    this.setSkillCap(28);
    this.setSpeedCap(28);
    this.setDefCap(24);
    this.setResCap(24);
    }
}
