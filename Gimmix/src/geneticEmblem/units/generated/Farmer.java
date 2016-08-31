package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Farmer extends Unit { 

public Farmer() {

    this.setJob("Farmer");
    this.setWeapon(new Sunlance());
    this.setHpBase(26);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(5);
    this.setSkillBase(8);
    this.setSpeedBase(9);
    this.setLuckBase(4);
    this.setDefBase(6);
    this.setResBase(5);

    this.setHpGr(70);
    this.setStrGr(25);
    this.setSkillGr(50);
    this.setSpeedGr(55);
    this.setLuckGr(30);
    this.setDefGr(55);
    this.setResGr(35);

    this.setStrCap(21);
    this.setSkillCap(26);
    this.setSpeedCap(29);
    this.setDefCap(27);
    this.setResCap(26);
    }
}
