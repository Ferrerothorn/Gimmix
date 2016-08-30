package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Bael extends Unit { 

public Bael() {

    this.setJob("Bael");
    this.setWeapon(new DarkClaw());
    this.setHpBase(26);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(8);
    this.setSpeedBase(9);
    this.setLuckBase(2);
    this.setDefBase(4);
    this.setResBase(6);

    this.setHpGr(60);
    this.setStrGr(55);
    this.setSkillGr(20);
    this.setSpeedGr(70);
    this.setLuckGr(35);
    this.setDefGr(30);
    this.setResGr(50);

    this.setStrCap(24);
    this.setSkillCap(28);
    this.setSpeedCap(29);
    this.setDefCap(22);
    this.setResCap(26);
    }
}
