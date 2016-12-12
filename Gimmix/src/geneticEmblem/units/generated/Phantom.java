package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Phantom extends Unit { 

public Phantom() {

    this.setJob("Phantom");
    this.setWeapon(new Cane());
    this.setHpBase(24);
    this.setCurrentHp(this.getHpBase());
    
    this.setStrBase(7);
    this.setSkillBase(6);
    this.setSpeedBase(8);
    this.setLuckBase(8);
    this.setDefBase(8);
    this.setResBase(4);

    this.setHpGr(60);
    this.setStrGr(45);
    this.setSkillGr(55);
    this.setSpeedGr(65);
    this.setLuckGr(30);
    this.setDefGr(40);
    this.setResGr(35);
    }
}
