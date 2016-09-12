package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Hoodlum extends Unit { 

public Hoodlum() {

    this.setJob("Hoodlum");
    this.setWeapon(new MeleeGear());
    this.setHpBase(20);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(7);
    this.setSpeedBase(6);
    this.setLuckBase(7);
    this.setDefBase(5);
    this.setResBase(6);

    this.setHpGr(55);
    this.setStrGr(40);
    this.setSkillGr(55);
    this.setSpeedGr(25);
    this.setLuckGr(65);
    this.setDefGr(25);
    this.setResGr(55);

    this.setStrCap(28);
    this.setSkillCap(29);
    this.setSpeedCap(25);
    this.setDefCap(23);
    this.setResCap(24);
    }
}
