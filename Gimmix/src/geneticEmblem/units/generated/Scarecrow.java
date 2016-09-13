package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Scarecrow extends Unit { 

public Scarecrow() {

    this.setJob("Scarecrow");
    this.setWeapon(new WallOfSwords());
    this.setHpBase(20);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(7);
    this.setSpeedBase(9);
    this.setLuckBase(2);
    this.setDefBase(5);
    this.setResBase(6);

    this.setHpGr(55);
    this.setStrGr(60);
    this.setSkillGr(35);
    this.setSpeedGr(75);
    this.setLuckGr(45);
    this.setDefGr(20);
    this.setResGr(30);

    this.setStrCap(30);
    this.setSkillCap(25);
    this.setSpeedCap(27);
    this.setDefCap(22);
    this.setResCap(25);
    }
}
