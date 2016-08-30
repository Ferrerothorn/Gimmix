package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class PortalMage extends Unit { 

public PortalMage() {

    this.setJob("Portal Mage");
    this.setWeapon(new Portal());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(6);
    this.setSpeedBase(7);
    this.setLuckBase(4);
    this.setDefBase(7);
    this.setResBase(5);

    this.setHpGr(55);
    this.setStrGr(45);
    this.setSkillGr(35);
    this.setSpeedGr(35);
    this.setLuckGr(60);
    this.setDefGr(70);
    this.setResGr(20);

    this.setStrCap(30);
    this.setSkillCap(24);
    this.setSpeedCap(29);
    this.setDefCap(27);
    this.setResCap(20);
    }
}
