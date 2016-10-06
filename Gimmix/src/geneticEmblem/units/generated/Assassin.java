package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Assassin extends Unit { 

public Assassin() {

    this.setJob("Assassin");
    this.setWeapon(new KillerClaw());
    this.setHpBase(25);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(8);
    this.setSpeedBase(5);
    this.setLuckBase(3);
    this.setDefBase(6);
    this.setResBase(6);

    this.setHpGr(65);
    this.setStrGr(45);
    this.setSkillGr(45);
    this.setSpeedGr(40);
    this.setLuckGr(75);
    this.setDefGr(30);
    this.setResGr(20);

    this.setStrCap(30);
    this.setSkillCap(27);
    this.setSpeedCap(26);
    this.setDefCap(23);
    this.setResCap(23);
    }
}
