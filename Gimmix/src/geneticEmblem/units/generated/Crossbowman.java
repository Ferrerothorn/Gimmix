package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Crossbowman extends Unit { 

public Crossbowman() {

    this.setJob("Crossbowman");
    this.setWeapon(new SteelBow());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(6);
    this.setSpeedBase(6);
    this.setLuckBase(4);
    this.setDefBase(7);
    this.setResBase(6);

    this.setHpGr(50);
    this.setStrGr(75);
    this.setSkillGr(70);
    this.setSpeedGr(35);
    this.setLuckGr(40);
    this.setDefGr(30);
    this.setResGr(20);

    this.setStrCap(30);
    this.setSkillCap(29);
    this.setSpeedCap(27);
    this.setDefCap(23);
    this.setResCap(21);
    }
}
