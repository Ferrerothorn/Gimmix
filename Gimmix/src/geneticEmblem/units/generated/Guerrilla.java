package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class Guerrilla extends Unit { 

public Guerrilla() {

    this.setJob("Guerrilla");

    this.setWeapon(new Bayonet());
    this.setHpBase(21);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(9);
    this.setSkillBase(6);
    this.setSpeedBase(6);
    this.setLuckBase(3);
    this.setDefBase(7);
    this.setResBase(6);

    this.setHpGr(65);
    this.setStrGr(50);
    this.setSkillGr(20);
    this.setSpeedGr(20);
    this.setLuckGr(60);
    this.setDefGr(75);
    this.setResGr(30);

    this.setStrCap(22);
    this.setSkillCap(21);
    this.setSpeedCap(25);
    this.setDefCap(30);
    this.setResCap(30);
    }
}