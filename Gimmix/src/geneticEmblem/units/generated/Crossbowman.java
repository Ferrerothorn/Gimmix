package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Crossbowman extends Unit { 

public Crossbowman() {

    this.setJob("Crossbowman");
    this.setWeapon(new SteelBow());
    this.setHpBase(27);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(7);
    this.setSpeedBase(5);
    this.setLuckBase(3);
    this.setDefBase(7);
    this.setResBase(6);

    this.setHpGr(50);
    this.setStrGr(75);
    this.setSkillGr(70);
    this.setSpeedGr(45);
    this.setLuckGr(30);
    this.setDefGr(35);
    this.setResGr(25);
    }
}
