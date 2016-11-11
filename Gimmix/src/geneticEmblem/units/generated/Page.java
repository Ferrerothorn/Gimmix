package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Page extends Unit { 

public Page() {

    this.setJob("Page");
    this.setWeapon(new FireSword());
	this.setHpBase(24);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(7);
    this.setSpeedBase(6);
    this.setLuckBase(4);
    this.setDefBase(9);
    this.setResBase(5);

    this.setHpGr(60);
    this.setStrGr(35);
    this.setSkillGr(45);
    this.setSpeedGr(40);
    this.setLuckGr(35);
    this.setDefGr(65);
    this.setResGr(40);

    this.setStrCap(25);
    this.setSkillCap(24);
    this.setSpeedCap(24);
    this.setDefCap(30);
    this.setResCap(27);
    }
}
