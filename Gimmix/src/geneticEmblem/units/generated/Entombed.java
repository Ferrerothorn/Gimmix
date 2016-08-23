package geneticEmblem.units.generated;

import geneticEmblem.units.ootb.Unit;
import geneticEmblem.weapons.*;

public class Entombed extends Unit { 

public Entombed() { 
    this.setJob("Entombed");
    this.setWeapon(new SharpClaw());
    this.setHpBase(23);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(5);
    this.setSkillBase(4);
    this.setSpeedBase(8);
    this.setLuckBase(7);
    this.setDefBase(5);
    this.setResBase(5);

    this.setHpGr(45);
    this.setStrGr(70);
    this.setSkillGr(45);
    this.setSpeedGr(40);
    this.setLuckGr(25);
    this.setDefGr(30);
    this.setResGr(55);

    this.setStrCap(26);
    this.setSkillCap(29);
    this.setSpeedCap(24);
    this.setDefCap(28);
    this.setResCap(24);
    }
}