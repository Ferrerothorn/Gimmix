package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Phantom extends Unit { 

public Phantom() {

    this.setJob("Phantom");
    this.setWeapon(new Cane());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    
    this.setStrBase(7);
    this.setSkillBase(5);
    this.setSpeedBase(7);
    this.setLuckBase(7);
    this.setDefBase(7);
    this.setResBase(4);

    this.setHpGr(60);
    this.setStrGr(45);
    this.setSkillGr(55);
    this.setSpeedGr(70);
    this.setLuckGr(30);
    this.setDefGr(35);
    this.setResGr(25);

    this.setStrCap(25);
    this.setSkillCap(28);
    this.setSpeedCap(29);
    this.setDefCap(24);
    this.setResCap(24);
    }
}
