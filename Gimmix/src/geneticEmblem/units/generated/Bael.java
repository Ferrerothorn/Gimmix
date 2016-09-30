package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Bael extends Unit { 

public Bael() {

    this.setJob("Bael");
    this.setWeapon(new DarkClaw());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(7);
    this.setSpeedBase(7);
    this.setLuckBase(4);
    this.setDefBase(7);
    this.setResBase(5);

    this.setHpGr(45);
    this.setStrGr(60);
    this.setSkillGr(60);
    this.setSpeedGr(35);
    this.setLuckGr(40);
    this.setDefGr(50);
    this.setResGr(30);

    this.setStrCap(30);
    this.setSkillCap(28);
    this.setSpeedCap(28);
    this.setDefCap(22);
    this.setResCap(22);
    }
}
