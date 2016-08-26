package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class MagnetMage extends Unit { 

public MagnetMage() {

    this.setJob("Magnet Mage");

    this.setWeapon(new WallOfSwords());
    this.setHpBase(20);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(9);
    this.setSpeedBase(8);
    this.setLuckBase(2);
    this.setDefBase(5);
    this.setResBase(4);

    this.setHpGr(65);
    this.setStrGr(75);
    this.setSkillGr(35);
    this.setSpeedGr(60);
    this.setLuckGr(35);
    this.setDefGr(25);
    this.setResGr(25);

    this.setStrCap(30);
    this.setSkillCap(20);
    this.setSpeedCap(27);
    this.setDefCap(27);
    this.setResCap(26);
    }
}