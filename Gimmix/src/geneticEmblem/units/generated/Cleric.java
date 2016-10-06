package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Cleric extends Unit { 

public Cleric() {

    this.setJob("Cleric");
    this.setWeapon(new Regenerate());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(6);
    this.setSpeedBase(9);
    this.setLuckBase(4);
    this.setDefBase(5);
    this.setResBase(5);

    this.setHpGr(45);
    this.setStrGr(75);
    this.setSkillGr(35);
    this.setSpeedGr(65);
    this.setLuckGr(30);
    this.setDefGr(45);
    this.setResGr(25);

    this.setStrCap(30);
    this.setSkillCap(22);
    this.setSpeedCap(28);
    this.setDefCap(28);
    this.setResCap(21);
    }
}
