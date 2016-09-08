package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Explorer extends Unit { 

public Explorer() {

    this.setJob("Explorer");
    this.setWeapon(new Machete());
    this.setHpBase(24);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(6);
    this.setSpeedBase(8);
    this.setLuckBase(4);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(50);
    this.setStrGr(50);
    this.setSkillGr(20);
    this.setSpeedGr(75);
    this.setLuckGr(45);
    this.setDefGr(45);
    this.setResGr(35);

    this.setStrCap(30);
    this.setSkillCap(24);
    this.setSpeedCap(26);
    this.setDefCap(26);
    this.setResCap(25);
    }
}
