package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Viper extends Unit { 

public Viper() {

    this.setJob("Viper");
    this.setWeapon(new Knuckleduster());
    this.setHpBase(26);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(7);
    this.setSpeedBase(8);
    this.setLuckBase(4);
    this.setDefBase(8);
    this.setResBase(6);

    this.setHpGr(55);
    this.setStrGr(60);
    this.setSkillGr(50);
    this.setSpeedGr(45);
    this.setLuckGr(35);
    this.setDefGr(45);
    this.setResGr(40);
    }
}
