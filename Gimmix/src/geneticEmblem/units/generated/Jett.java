package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Jett extends Unit { 

public Jett() {

    this.setJob("Jett");
    this.setWeapon(new RayGun());
    this.setHpBase(26);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(6);
    this.setSpeedBase(8);
    this.setLuckBase(7);
    this.setDefBase(7);
    this.setResBase(3);

    this.setHpGr(65);
    this.setStrGr(40);
    this.setSkillGr(55);
    this.setSpeedGr(40);
    this.setLuckGr(60);
    this.setDefGr(40);
    this.setResGr(20);

    this.setStrCap(23);
    this.setSkillCap(30);
    this.setSpeedCap(30);
    this.setDefCap(22);
    this.setResCap(22);
    }
}
