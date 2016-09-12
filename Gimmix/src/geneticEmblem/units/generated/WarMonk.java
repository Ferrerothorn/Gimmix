package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class WarMonk extends Unit { 

public WarMonk() {

    this.setJob("War Monk");
    this.setWeapon(new BlessedAxe());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(9);
    this.setSpeedBase(6);
    this.setLuckBase(3);
    this.setDefBase(6);
    this.setResBase(4);

    this.setHpGr(30);
    this.setStrGr(65);
    this.setSkillGr(70);
    this.setSpeedGr(20);
    this.setLuckGr(75);
    this.setDefGr(40);
    this.setResGr(20);

    this.setStrCap(28);
    this.setSkillCap(28);
    this.setSpeedCap(25);
    this.setDefCap(25);
    this.setResCap(21);
    }
}
