package geneticEmblem.units.generated;

import geneticEmblem.units.ootb.Unit;
import geneticEmblem.weapons.*;

public class Entombed extends Unit { 

public Entombed() { 
    this.setJob("Entombed");
    this.setWeapon(new SharpClaw());
    this.setBaseCrit(10);
    this.setHpBase(23);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(4);
    this.setSpeedBase(8);
    this.setLuckBase(7);
    this.setDefBase(5);
    this.setResBase(4);

    this.setHpGr(45);
    this.setStrGr(70);
    this.setSkillGr(40);
    this.setSpeedGr(45);
    this.setLuckGr(25);
    this.setDefGr(55);
    this.setResGr(30);

    this.setStrCap(29);
    this.setSkillCap(24);
    this.setSpeedCap(26);
    this.setDefCap(28);
    this.setResCap(24);
    }
}