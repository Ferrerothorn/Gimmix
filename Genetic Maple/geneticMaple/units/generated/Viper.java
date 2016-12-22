package geneticMaple.units.generated;

import geneticMaple.units.factory.Unit;
import geneticMaple.weapons.*;

public class Viper extends Unit { 

public Viper() {

    this.setJob("Viper");
    this.setWeapon(new Knuckleduster());
    this.setHpBase(27);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(7);
    this.setSpeedBase(6);
    this.setLuckBase(4);
    this.setDefBase(6);
    this.setResBase(4);

	this.setHpGr(55);
	this.setStrGr(60);
	this.setSkillGr(50);
	this.setSpeedGr(40);
	this.setLuckGr(30);
	this.setDefGr(50);
	this.setResGr(30);
    }
}
