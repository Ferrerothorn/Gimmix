package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class BlisterLancer extends Unit { 

public BlisterLancer() {

    this.setJob("Blister Lancer");
    this.setWeapon(new ArcaneLance());
    this.setHpBase(20);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(7);
    this.setSpeedBase(5);
    this.setLuckBase(5);
    this.setDefBase(7);
    this.setResBase(6);

    this.setHpGr(40);
    this.setStrGr(35);
    this.setSkillGr(55);
    this.setSpeedGr(20);
    this.setLuckGr(75);
    this.setDefGr(55);
    this.setResGr(40);

    this.setStrCap(23);
    this.setSkillCap(29);
    this.setSpeedCap(27);
    this.setDefCap(29);
    this.setResCap(21);
    }
}
