package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Aran extends Unit { 

public Aran() {

    this.setJob("Aran");
    this.setWeapon(new ShadowBlade());
    this.setHpBase(25);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(8);
    this.setSpeedBase(7);
    this.setLuckBase(5);
    this.setDefBase(6);
    this.setResBase(2);

    this.setHpGr(50);
    this.setStrGr(50);
    this.setSkillGr(45);
    this.setSpeedGr(40);
    this.setLuckGr(60);
    this.setDefGr(40);
    this.setResGr(35);

    this.setStrCap(30);
    this.setSkillCap(27);
    this.setSpeedCap(26);
    this.setDefCap(27);
    this.setResCap(20);
    }
}
