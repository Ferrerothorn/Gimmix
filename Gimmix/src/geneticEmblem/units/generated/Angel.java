package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Angel extends Unit { 

public Angel() {

    this.setJob("Angel");

    this.setWeapon(new Shine());
    this.setHpBase(20);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(5);
    this.setSpeedBase(8);
    this.setLuckBase(5);
    this.setDefBase(6);
    this.setResBase(4);

    this.setHpGr(40);
    this.setStrGr(70);
    this.setSkillGr(35);
    this.setSpeedGr(35);
    this.setLuckGr(80);
    this.setDefGr(25);
    this.setResGr(35);

    this.setStrCap(29);
    this.setSkillCap(24);
    this.setSpeedCap(30);
    this.setDefCap(25);
    this.setResCap(23);
    }
}