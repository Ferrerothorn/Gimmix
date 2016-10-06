package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Fighter extends Unit { 

public Fighter() {

    this.setJob("Fighter");
    this.setWeapon(new BoltAxe());
    this.setHpBase(20);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(8);
    this.setSpeedBase(5);
    this.setLuckBase(3);
    this.setDefBase(7);
    this.setResBase(6);

    this.setHpGr(50);
    this.setStrGr(40);
    this.setSkillGr(30);
    this.setSpeedGr(30);
    this.setLuckGr(65);
    this.setDefGr(65);
    this.setResGr(40);

    this.setStrCap(28);
    this.setSkillCap(25);
    this.setSpeedCap(30);
    this.setDefCap(23);
    this.setResCap(23);
    }
}
