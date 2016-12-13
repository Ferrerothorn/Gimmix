package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Viper extends Unit { 

public Viper() {

    this.setJob("Viper");
    this.setWeapon(new Knuckleduster());
    this.setHpBase(27);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(7);
    this.setSpeedBase(6);
    this.setLuckBase(4);
    this.setDefBase(6);
    this.setResBase(4);

    this.setHpGr(55);
    this.setStrGr(60);
    this.setSkillGr(50);
    this.setSpeedGr(45);
    this.setLuckGr(35);
    this.setDefGr(45);
    this.setResGr(40);
    }
}
