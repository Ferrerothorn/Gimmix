
import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class 0.0 extends Unit { 

public 0.0() {

    this.setJob("0.0");
    this.setWeapon(new Halberd());
    this.setHpBase(20);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(9);
    this.setSpeedBase(5);
    this.setLuckBase(6);
    this.setDefBase(5);
    this.setResBase(5);

    this.setHpGr(55);
    this.setStrGr(50);
    this.setSkillGr(55);
    this.setSpeedGr(35);
    this.setLuckGr(60);
    this.setDefGr(35);
    this.setResGr(30);

    this.setStrCap(26);
    this.setSkillCap(29);
    this.setSpeedCap(26);
    this.setDefCap(26);
    this.setResCap(24);
    }
}
