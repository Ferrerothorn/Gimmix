package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Monk extends Unit { 

public Monk() {

    this.setJob("Monk");
    this.setWeapon(new HolyClaw());
    this.setHpBase(22);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(9);
    this.setSpeedBase(9);
    this.setLuckBase(3);
    this.setDefBase(5);
    this.setResBase(5);

    this.setHpGr(20);
    this.setStrGr(65);
    this.setSkillGr(50);
    this.setSpeedGr(70);
    this.setLuckGr(40);
    this.setDefGr(35);
    this.setResGr(40);

    this.setStrCap(25);
    this.setSkillCap(27);
    this.setSpeedCap(29);
    this.setDefCap(22);
    this.setResCap(28);
    }
}
