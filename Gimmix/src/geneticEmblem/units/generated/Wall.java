package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Wall extends Unit { 

public Wall() {

    this.setJob("Wall");

    this.setWeapon(new DivineShield());
    this.setHpBase(26);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(8);
    this.setSpeedBase(6);
    this.setLuckBase(3);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(80);
    this.setStrGr(40);
    this.setSkillGr(20);
    this.setSpeedGr(25);
    this.setLuckGr(25);
    this.setDefGr(70);
    this.setResGr(60);

    this.setStrCap(22);
    this.setSkillCap(28);
    this.setSpeedCap(30);
    this.setDefCap(30);
    this.setResCap(20);
    }
}