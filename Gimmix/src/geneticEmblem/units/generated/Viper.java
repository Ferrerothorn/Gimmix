package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Viper extends Unit { 

public Viper() {

    this.setJob("Viper");
    this.setWeapon(new Knuckleduster());
    this.setHpBase(25);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(5);
    this.setSpeedBase(9);
    this.setLuckBase(4);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(35);
    this.setStrGr(55);
    this.setSkillGr(45);
    this.setSpeedGr(75);
    this.setLuckGr(35);
    this.setDefGr(30);
    this.setResGr(45);

    this.setStrCap(30);
    this.setSkillCap(23);
    this.setSpeedCap(29);
    this.setDefCap(23);
    this.setResCap(25);
    }
}
