package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Marauder extends Unit { 

public Marauder() {

    this.setJob("Marauder");
    this.setWeapon(new Machete());
    this.setHpBase(21);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(8);
    this.setSpeedBase(5);
    this.setLuckBase(3);
    this.setDefBase(7);
    this.setResBase(5);

    this.setHpGr(20);
    this.setStrGr(80);
    this.setSkillGr(55);
    this.setSpeedGr(20);
    this.setLuckGr(60);
    this.setDefGr(45);
    this.setResGr(40);

    this.setStrCap(27);
    this.setSkillCap(25);
    this.setSpeedCap(21);
    this.setDefCap(27);
    this.setResCap(27);
    }
}
