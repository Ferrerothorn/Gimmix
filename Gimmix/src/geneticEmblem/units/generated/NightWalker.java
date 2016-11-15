package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class NightWalker extends Unit { 

public NightWalker() {

    this.setJob("Night Walker");
    this.setWeapon(new DarkClaw());
    this.setHpBase(21);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(9);
    this.setSpeedBase(9);
    this.setLuckBase(5);
    this.setDefBase(3);
    this.setResBase(2);

    this.setHpGr(30);
    this.setStrGr(65);
    this.setSkillGr(65);
    this.setSpeedGr(65);
    this.setLuckGr(40);
    this.setDefGr(35);
    this.setResGr(20);

    this.setStrCap(26);
    this.setSkillCap(28);
    this.setSpeedCap(28);
    this.setDefCap(24);
    this.setResCap(24);
    }
}
