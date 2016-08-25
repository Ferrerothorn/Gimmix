package geneticEmblem.units.generated;

import geneticEmblem.units.ootb.Unit;

import geneticEmblem.weapons.*;

public class GoblinGunner extends Unit { 

public GoblinGunner() {

    this.setJob("Goblin Gunner");

    this.setWeapon(new IronGun());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(9);
    this.setSpeedBase(9);
    this.setLuckBase(2);
    this.setDefBase(2);
    this.setResBase(6);

    this.setHpGr(45);
    this.setStrGr(50);
    this.setSkillGr(40);
    this.setSpeedGr(50);
    this.setLuckGr(50);
    this.setDefGr(30);
    this.setResGr(45);

    this.setStrCap(30);
    this.setSkillCap(30);
    this.setSpeedCap(25);
    this.setDefCap(21);
    this.setResCap(22);
    }
}