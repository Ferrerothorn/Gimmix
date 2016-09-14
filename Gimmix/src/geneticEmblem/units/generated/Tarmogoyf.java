package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Tarmogoyf extends Unit { 

public Tarmogoyf() {

    this.setJob("Tarmogoyf");
    this.setWeapon(new SpikedShield());
    this.setHpBase(25);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(7);
    this.setSpeedBase(9);
    this.setLuckBase(6);
    this.setDefBase(4);
    this.setResBase(2);

    this.setHpGr(50);
    this.setStrGr(35);
    this.setSkillGr(25);
    this.setSpeedGr(60);
    this.setLuckGr(65);
    this.setDefGr(45);
    this.setResGr(40);

    this.setStrCap(29);
    this.setSkillCap(23);
    this.setSpeedCap(29);
    this.setDefCap(28);
    this.setResCap(22);
    }
}
