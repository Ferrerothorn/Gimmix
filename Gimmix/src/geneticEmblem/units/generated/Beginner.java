package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Beginner extends Unit { 

public Beginner() {

    this.setJob("Beginner");
    this.setWeapon(new IronSword());
    this.setHpBase(25);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(8);
    this.setSpeedBase(8);
    this.setLuckBase(3);
    this.setDefBase(7);
    this.setResBase(4);

    this.setHpGr(50);
    this.setStrGr(45);
    this.setSkillGr(50);
    this.setSpeedGr(80);
    this.setLuckGr(35);
    this.setDefGr(35);
    this.setResGr(25);

    this.setStrCap(26);
    this.setSkillCap(26);
    this.setSpeedCap(29);
    this.setDefCap(24);
    this.setResCap(23);
    }
}
