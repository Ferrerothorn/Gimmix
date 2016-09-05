package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Brawler extends Unit { 

public Brawler() {

    this.setJob("Brawler");
    this.setWeapon(new Knuckleduster());
    this.setHpBase(25);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(7);
    this.setSpeedBase(9);
    this.setLuckBase(5);
    this.setDefBase(6);
    this.setResBase(4);

    this.setHpGr(60);
    this.setStrGr(55);
    this.setSkillGr(20);
    this.setSpeedGr(55);
    this.setLuckGr(55);
    this.setDefGr(50);
    this.setResGr(25);

    this.setStrCap(26);
    this.setSkillCap(27);
    this.setSpeedCap(30);
    this.setDefCap(25);
    this.setResCap(20);
    }
}
