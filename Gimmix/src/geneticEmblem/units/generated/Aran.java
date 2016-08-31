package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Aran extends Unit { 

public Aran() {

    this.setJob("Aran");
    this.setWeapon(new PoleAxe());
    this.setHpBase(21);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(6);
    this.setSpeedBase(8);
    this.setLuckBase(7);
    this.setDefBase(4);
    this.setResBase(4);

    this.setHpGr(25);
    this.setStrGr(60);
    this.setSkillGr(25);
    this.setSpeedGr(80);
    this.setLuckGr(80);
    this.setDefGr(20);
    this.setResGr(30);

    this.setStrCap(29);
    this.setSkillCap(20);
    this.setSpeedCap(29);
    this.setDefCap(23);
    this.setResCap(26);
    }
}
