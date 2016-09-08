package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Marksman extends Unit { 

public Marksman() {

    this.setJob("Marksman");
    this.setWeapon(new SteelBow());
    this.setHpBase(21);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(8);
    this.setSpeedBase(7);
    this.setLuckBase(2);
    this.setDefBase(5);
    this.setResBase(6);

    this.setHpGr(25);
    this.setStrGr(70);
    this.setSkillGr(50);
    this.setSpeedGr(70);
    this.setLuckGr(40);
    this.setDefGr(20);
    this.setResGr(45);

    this.setStrCap(26);
    this.setSkillCap(20);
    this.setSpeedCap(30);
    this.setDefCap(26);
    this.setResCap(26);
    }
}
