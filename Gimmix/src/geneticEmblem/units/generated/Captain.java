package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Captain extends Unit { 

public Captain() {

    this.setJob("Captain");
    this.setWeapon(new IronGun());
    this.setHpBase(25);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(7);
    this.setSpeedBase(7);
    this.setLuckBase(4);
    this.setDefBase(7);
    this.setResBase(4);

    this.setHpGr(55);
    this.setStrGr(35);
    this.setSkillGr(75);
    this.setSpeedGr(40);
    this.setLuckGr(30);
    this.setDefGr(50);
    this.setResGr(45);

    }
}
