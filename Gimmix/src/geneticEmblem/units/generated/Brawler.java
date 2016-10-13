package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Brawler extends Unit { 

public Brawler() {

    this.setJob("Brawler");
    this.setWeapon(new MeleeGear());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(8);
    this.setSpeedBase(9);
    this.setLuckBase(3);
    this.setDefBase(5);
    this.setResBase(4);

    this.setHpGr(30);
    this.setStrGr(65);
    this.setSkillGr(70);
    this.setSpeedGr(50);
    this.setLuckGr(50);
    this.setDefGr(30);
    this.setResGr(25);

    this.setStrCap(26);
    this.setSkillCap(29);
    this.setSpeedCap(28);
    this.setDefCap(25);
    this.setResCap(23);
    }
}
