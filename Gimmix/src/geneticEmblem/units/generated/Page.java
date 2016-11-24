package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Page extends Unit { 

public Page() {

    this.setJob("Page");
    this.setWeapon(new IronSword());
	this.setHpBase(25);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(7);
    this.setSpeedBase(6);
    this.setLuckBase(4);
    this.setDefBase(8);
    this.setResBase(5);

    this.setHpGr(60);
    this.setStrGr(45);
    this.setSkillGr(35);
    this.setSpeedGr(40);
    this.setLuckGr(25);
    this.setDefGr(70);
    this.setResGr(45);

    this.setStrCap(25);
    this.setSkillCap(24);
    this.setSpeedCap(24);
    this.setDefCap(30);
    this.setResCap(27);
    }
}
