package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class NightWalker extends Unit { 

public NightWalker() {

    this.setJob("Night Walker");
    this.setWeapon(new IronClaw());
    this.setHpBase(21);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(10);
    this.setSkillBase(10);
    this.setSpeedBase(10);
    this.setLuckBase(6);
    this.setDefBase(3);
    this.setResBase(2);

    this.setHpGr(35);
    this.setStrGr(65);
    this.setSkillGr(65);
    this.setSpeedGr(65);
    this.setLuckGr(40);
    this.setDefGr(35);
    this.setResGr(25);
    }
}
