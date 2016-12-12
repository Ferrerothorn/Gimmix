package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Aran extends Unit { 

public Aran() {

    this.setJob("Aran");
    this.setWeapon(new IronLance());
    this.setHpBase(28);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(7);
    this.setSpeedBase(6);
    this.setLuckBase(4);
    this.setDefBase(7);
    this.setResBase(4);

    this.setHpGr(60);
    this.setStrGr(65);
    this.setSkillGr(20);
    this.setSpeedGr(40);
    this.setLuckGr(75);
    this.setDefGr(20);
    this.setResGr(50);

    }
}
