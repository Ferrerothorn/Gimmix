package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class KilnFiend extends Unit { 

public KilnFiend() {

    this.setJob("KilnFiend");

    this.setWeapon(new FireClaw());
    this.setHpBase(20);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(8);
    this.setSpeedBase(8);
    this.setLuckBase(2);
    this.setDefBase(5);
    this.setResBase(5);

    this.setHpGr(25);
    this.setStrGr(80);
    this.setSkillGr(40);
    this.setSpeedGr(80);
    this.setLuckGr(25);
    this.setDefGr(35);
    this.setResGr(30);

    this.setStrCap(27);
    this.setSkillCap(21);
    this.setSpeedCap(29);
    this.setDefCap(27);
    this.setResCap(26);
    }
}