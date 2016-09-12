package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Woodcutter extends Unit { 

public Woodcutter() {

    this.setJob("Woodcutter");
    this.setWeapon(new Machete());
    this.setHpBase(25);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(7);
    this.setSpeedBase(8);
    this.setLuckBase(4);
    this.setDefBase(6);
    this.setResBase(5);

    this.setHpGr(45);
    this.setStrGr(45);
    this.setSkillGr(40);
    this.setSpeedGr(70);
    this.setLuckGr(40);
    this.setDefGr(40);
    this.setResGr(40);

    this.setStrCap(28);
    this.setSkillCap(26);
    this.setSpeedCap(29);
    this.setDefCap(23);
    this.setResCap(23);
    }
}
