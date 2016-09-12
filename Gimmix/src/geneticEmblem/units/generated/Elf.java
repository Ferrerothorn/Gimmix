package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Elf extends Unit { 

public Elf() {

    this.setJob("Elf");
    this.setWeapon(new Oathbow());
    this.setHpBase(20);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(9);
    this.setSpeedBase(7);
    this.setLuckBase(3);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(45);
    this.setStrGr(45);
    this.setSkillGr(65);
    this.setSpeedGr(50);
    this.setLuckGr(50);
    this.setDefGr(25);
    this.setResGr(40);

    this.setStrCap(27);
    this.setSkillCap(29);
    this.setSpeedCap(28);
    this.setDefCap(20);
    this.setResCap(23);
    }
}
