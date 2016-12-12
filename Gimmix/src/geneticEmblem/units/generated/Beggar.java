package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Beggar extends Unit { 

public Beggar() {

    this.setJob("Beggar");
    this.setWeapon(new IronRake());
    this.setHpBase(21);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(10);
    this.setSkillBase(6);
    this.setSpeedBase(6);
    this.setLuckBase(2);
    this.setDefBase(10);
    this.setResBase(7);

    this.setHpGr(70);
    this.setStrGr(30);
    this.setSkillGr(50);
    this.setSpeedGr(45);
    this.setLuckGr(30);
    this.setDefGr(70);
    this.setResGr(35);

    }
}
