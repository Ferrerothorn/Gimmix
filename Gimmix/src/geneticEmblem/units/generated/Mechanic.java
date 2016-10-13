package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Mechanic extends Unit { 

public Mechanic() {

    this.setJob("Mechanic");
    this.setWeapon(new SharpClaw());
    this.setHpBase(25);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(8);
    this.setSpeedBase(8);
    this.setLuckBase(5);
    this.setDefBase(7);
    this.setResBase(2);

    this.setHpGr(75);
    this.setStrGr(50);
    this.setSkillGr(45);
    this.setSpeedGr(45);
    this.setLuckGr(50);
    this.setDefGr(30);
    this.setResGr(25);

    this.setStrCap(29);
    this.setSkillCap(30);
    this.setSpeedCap(26);
    this.setDefCap(23);
    this.setResCap(21);
    }
}
