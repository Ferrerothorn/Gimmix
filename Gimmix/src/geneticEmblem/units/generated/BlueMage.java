package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class BlueMage extends Unit { 

public BlueMage() {

    this.setJob("Blue Mage");
    this.setWeapon(new AquaSaber());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(8);
    this.setSpeedBase(9);
    this.setLuckBase(2);
    this.setDefBase(7);
    this.setResBase(4);

    this.setHpGr(60);
    this.setStrGr(35);
    this.setSkillGr(25);
    this.setSpeedGr(75);
    this.setLuckGr(20);
    this.setDefGr(70);
    this.setResGr(35);

    this.setStrCap(26);
    this.setSkillCap(27);
    this.setSpeedCap(28);
    this.setDefCap(24);
    this.setResCap(23);
    }
}
