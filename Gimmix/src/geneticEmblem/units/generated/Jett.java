package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Jett extends Unit { 

public Jett() {

    this.setJob("Jett");
    this.setWeapon(new RayGun());
    this.setHpBase(21);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(8);
    this.setSpeedBase(5);
    this.setLuckBase(4);
    this.setDefBase(7);
    this.setResBase(5);

    this.setHpGr(60);
    this.setStrGr(35);
    this.setSkillGr(45);
    this.setSpeedGr(30);
    this.setLuckGr(30);
    this.setDefGr(70);
    this.setResGr(50);

    this.setStrCap(26);
    this.setSkillCap(26);
    this.setSpeedCap(24);
    this.setDefCap(30);
    this.setResCap(23);
    }
}
