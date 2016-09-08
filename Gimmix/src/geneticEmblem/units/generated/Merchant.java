package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Merchant extends Unit { 

public Merchant() {

    this.setJob("Merchant");
    this.setWeapon(new Machete());
    this.setHpBase(21);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(6);
    this.setSpeedBase(6);
    this.setLuckBase(4);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(65);
    this.setStrGr(75);
    this.setSkillGr(55);
    this.setSpeedGr(25);
    this.setLuckGr(25);
    this.setDefGr(30);
    this.setResGr(45);

    this.setStrCap(29);
    this.setSkillCap(24);
    this.setSpeedCap(22);
    this.setDefCap(23);
    this.setResCap(30);
    }
}
