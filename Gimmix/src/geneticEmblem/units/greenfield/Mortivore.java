package geneticEmblem.units.greenfield;

import geneticEmblem.units.ootb.Unit;

import geneticEmblem.weapons.*;

public class Mortivore extends Unit { 

public Mortivore() {

    this.setJob("Mortivore");

    this.setWeapon(new SharpClaw());
    this.setHpBase(26);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(5);
    this.setSpeedBase(8);
    this.setLuckBase(5);
    this.setDefBase(7);
    this.setResBase(6);

    this.setHpGr(30);
    this.setStrGr(40);
    this.setSkillGr(30);
    this.setSpeedGr(45);
    this.setLuckGr(80);
    this.setDefGr(45);
    this.setResGr(40);

    this.setStrCap(30);
    this.setSkillCap(27);
    this.setSpeedCap(26);
    this.setDefCap(26);
    this.setResCap(22);
    }
}