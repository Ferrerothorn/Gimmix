package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Merchant extends Unit { 

public Merchant() {

    this.setJob("Merchant");
    this.setWeapon(new IronRake());
    this.setHpBase(26);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(9);
    this.setSpeedBase(7);
    this.setLuckBase(3);
    this.setDefBase(3);
    this.setResBase(6);

    this.setHpGr(75);
    this.setStrGr(60);
    this.setSkillGr(30);
    this.setSpeedGr(30);
    this.setLuckGr(75);
    this.setDefGr(20);
    this.setResGr(30);

    this.setStrCap(26);
    this.setSkillCap(26);
    this.setSpeedCap(29);
    this.setDefCap(22);
    this.setResCap(24);
    }
}
