package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Shiva extends Unit { 

public Shiva() {

    this.setJob("Shiva");
    this.setWeapon(new AquaSaber());
    this.setHpBase(25);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(9);
    this.setSpeedBase(6);
    this.setLuckBase(2);
    this.setDefBase(7);
    this.setResBase(6);

    this.setHpGr(45);
    this.setStrGr(40);
    this.setSkillGr(55);
    this.setSpeedGr(20);
    this.setLuckGr(55);
    this.setDefGr(70);
    this.setResGr(35);

    this.setStrCap(24);
    this.setSkillCap(27);
    this.setSpeedCap(21);
    this.setDefCap(30);
    this.setResCap(25);
    }
}
