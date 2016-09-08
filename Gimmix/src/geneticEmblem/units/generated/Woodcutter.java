package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Woodcutter extends Unit { 

public Woodcutter() {

    this.setJob("Woodcutter");
    this.setWeapon(new HuntersGear());
    this.setHpBase(24);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(6);
    this.setSpeedBase(8);
    this.setLuckBase(3);
    this.setDefBase(7);
    this.setResBase(5);

    this.setHpGr(45);
    this.setStrGr(60);
    this.setSkillGr(25);
    this.setSpeedGr(70);
    this.setLuckGr(25);
    this.setDefGr(70);
    this.setResGr(25);

    this.setStrCap(29);
    this.setSkillCap(21);
    this.setSpeedCap(28);
    this.setDefCap(29);
    this.setResCap(20);
    }
}
