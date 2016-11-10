package geneticEmblem.units.newfags;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Striker extends Unit { 

public Striker() {

    this.setJob("Striker");
    this.setWeapon(new Knuckleduster());
    this.setHpBase(23);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(9);
    this.setSpeedBase(7);
    this.setLuckBase(7);
    this.setDefBase(7);
    this.setResBase(1);

    this.setHpGr(40);
    this.setStrGr(35);
    this.setSkillGr(60);
    this.setSpeedGr(30);
    this.setLuckGr(65);
    this.setDefGr(60);
    this.setResGr(30);

    this.setStrCap(26);
    this.setSkillCap(27);
    this.setSpeedCap(23);
    this.setDefCap(28);
    this.setResCap(26);
    }
}
