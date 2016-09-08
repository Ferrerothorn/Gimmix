package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Viera extends Unit { 

public Viera() {

    this.setJob("Viera");
    this.setWeapon(new Oathbow());
    this.setHpBase(21);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(5);
    this.setSpeedBase(7);
    this.setLuckBase(6);
    this.setDefBase(5);
    this.setResBase(5);

    this.setHpGr(70);
    this.setStrGr(50);
    this.setSkillGr(20);
    this.setSpeedGr(50);
    this.setLuckGr(65);
    this.setDefGr(45);
    this.setResGr(20);

    this.setStrCap(29);
    this.setSkillCap(25);
    this.setSpeedCap(27);
    this.setDefCap(23);
    this.setResCap(23);
    }
}
