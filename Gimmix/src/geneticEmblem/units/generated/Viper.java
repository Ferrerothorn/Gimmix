package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Viper extends Unit { 

public Viper() {

    this.setJob("Viper");
    this.setWeapon(new Knuckleduster());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(9);
    this.setSpeedBase(9);
    this.setLuckBase(6);
    this.setDefBase(3);
    this.setResBase(4);

    this.setHpGr(20);
    this.setStrGr(45);
    this.setSkillGr(45);
    this.setSpeedGr(60);
    this.setLuckGr(70);
    this.setDefGr(40);
    this.setResGr(40);

    this.setStrCap(28);
    this.setSkillCap(29);
    this.setSpeedCap(29);
    this.setDefCap(21);
    this.setResCap(23);
    }
}
