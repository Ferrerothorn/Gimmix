package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;

import geneticEmblem.weapons.*;

public class Demon extends Unit { 

public Demon() {

    this.setJob("Demon");

    this.setWeapon(new FireClaw());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(8);
    this.setSpeedBase(9);
    this.setLuckBase(2);
    this.setDefBase(6);
    this.setResBase(4);

    this.setHpGr(50);
    this.setStrGr(35);
    this.setSkillGr(35);
    this.setSpeedGr(70);
    this.setLuckGr(35);
    this.setDefGr(55);
    this.setResGr(40);

    this.setStrCap(22);
    this.setSkillCap(27);
    this.setSpeedCap(29);
    this.setDefCap(27);
    this.setResCap(22);
    }
}
