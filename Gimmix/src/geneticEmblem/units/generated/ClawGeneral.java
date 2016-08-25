package geneticEmblem.units.generated;

import geneticEmblem.units.ootb.Unit;

import geneticEmblem.weapons.*;

public class ClawGeneral extends Unit { 

public ClawGeneral() {

    this.setJob("Claw General");

    this.setWeapon(new SharpClaw());
    this.setHpBase(25);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(9);
    this.setSpeedBase(5);
    this.setLuckBase(2);
    this.setDefBase(7);
    this.setResBase(5);

    this.setHpGr(20);
    this.setStrGr(70);
    this.setSkillGr(55);
    this.setSpeedGr(25);
    this.setLuckGr(25);
    this.setDefGr(70);
    this.setResGr(45);

    this.setStrCap(21);
    this.setSkillCap(26);
    this.setSpeedCap(25);
    this.setDefCap(29);
    this.setResCap(26);
    }
}