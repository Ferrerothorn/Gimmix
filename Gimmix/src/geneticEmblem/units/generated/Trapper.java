package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Trapper extends Unit { 

public Trapper() {

    this.setJob("Trapper");
    this.setWeapon(new HuntersGear());
    this.setHpBase(26);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(8);
    this.setSpeedBase(8);
    this.setLuckBase(4);
    this.setDefBase(6);
    this.setResBase(5);

    this.setHpGr(40);
    this.setStrGr(75);
    this.setSkillGr(55);
    this.setSpeedGr(45);
    this.setLuckGr(45);
    this.setDefGr(35);
    this.setResGr(25);

    this.setStrCap(25);
    this.setSkillCap(29);
    this.setSpeedCap(29);
    this.setDefCap(25);
    this.setResCap(21);
    }
}
