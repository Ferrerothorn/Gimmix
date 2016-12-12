package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Aran extends Unit { 

public Aran() {

    this.setJob("Aran");
    this.setWeapon(new IronLance());
    this.setHpBase(23);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(10);
    this.setSkillBase(6);
    this.setSpeedBase(6);
    this.setLuckBase(6);
    this.setDefBase(5);
    this.setResBase(8);

    this.setHpGr(60);
    this.setStrGr(65);
    this.setSkillGr(20);
    this.setSpeedGr(40);
    this.setLuckGr(75);
    this.setDefGr(20);
    this.setResGr(50);

    }
}
