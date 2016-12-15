package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class NXHoe extends Unit { 

public NXHoe() {
    this.setJob("NXHoe");
    this.setWeapon(new Snowflake());
    this.setHpBase(26);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(4);
    this.setSpeedBase(7);
    this.setLuckBase(6);
    this.setDefBase(6);
    this.setResBase(6);

	this.setHpGr(40);
	this.setStrGr(40);
	this.setSkillGr(50);
	this.setSpeedGr(55);
	this.setLuckGr(55);
	this.setDefGr(40);
	this.setResGr(50);
    }
}
