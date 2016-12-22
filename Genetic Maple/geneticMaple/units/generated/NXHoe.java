package geneticMaple.units.generated;

import geneticMaple.units.factory.Unit;
import geneticMaple.weapons.*;

public class NXHoe extends Unit { 

public NXHoe() {
    this.setJob("NX Hoe");
    this.setWeapon(new Snowflake());
    this.setHpBase(26);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(4);
    this.setSpeedBase(7);
    this.setLuckBase(6);
    this.setDefBase(6);
    this.setResBase(6);

	this.setHpGr(35);
	this.setStrGr(40);
	this.setSkillGr(50);
	this.setSpeedGr(55);
	this.setLuckGr(55);
	this.setDefGr(35);
	this.setResGr(45);
    }
}
