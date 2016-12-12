package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class NXHoe extends Unit { 

public NXHoe() {
    this.setJob("NXHoe");
    this.setWeapon(new Snowflake());
    this.setHpBase(26);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(8);
    this.setSpeedBase(8);
    this.setLuckBase(5);
    this.setDefBase(6);
    this.setResBase(7);

    this.setHpGr(50);
    this.setStrGr(55);
    this.setSkillGr(55);
    this.setSpeedGr(60);
    this.setLuckGr(35);
    this.setDefGr(40);
    this.setResGr(35);
    }
}
