package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Brawler extends Unit { 

public Brawler() {

    this.setJob("Brawler");
    this.setWeapon(new Knuckleduster());
    this.setHpBase(23);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(7);
    this.setSpeedBase(7);
    this.setLuckBase(6);
    this.setDefBase(4);
    this.setResBase(4);

    this.setHpGr(40);
    this.setStrGr(60);
    this.setSkillGr(25);
    this.setSpeedGr(50);
    this.setLuckGr(70);
    this.setDefGr(30);
    this.setResGr(45);

    this.setStrCap(29);
    this.setSkillCap(24);
    this.setSpeedCap(28);
    this.setDefCap(24);
    this.setResCap(25);
    }
}
