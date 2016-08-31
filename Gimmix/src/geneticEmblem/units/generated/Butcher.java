package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Butcher extends Unit { 

public Butcher() {

    this.setJob("Butcher");
    this.setWeapon(new Machete());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(9);
    this.setSpeedBase(7);
    this.setLuckBase(3);
    this.setDefBase(7);
    this.setResBase(4);

    this.setHpGr(75);
    this.setStrGr(35);
    this.setSkillGr(50);
    this.setSpeedGr(40);
    this.setLuckGr(30);
    this.setDefGr(65);
    this.setResGr(25);

    this.setStrCap(28);
    this.setSkillCap(28);
    this.setSpeedCap(28);
    this.setDefCap(23);
    this.setResCap(21);
    }
}
