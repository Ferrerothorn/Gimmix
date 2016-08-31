package geneticEmblem.units.generated;

import geneticEmblem.units.factory.Unit;
import geneticEmblem.weapons.*;

public class FlameWizard extends Unit { 

public FlameWizard() {

    this.setJob("Flame Wizard");
    this.setWeapon(new Fire());
    this.setHpBase(21);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(7);
    this.setSkillBase(9);
    this.setSpeedBase(9);
    this.setLuckBase(2);
    this.setDefBase(5);
    this.setResBase(5);

    this.setHpGr(40);
    this.setStrGr(65);
    this.setSkillGr(30);
    this.setSpeedGr(65);
    this.setLuckGr(25);
    this.setDefGr(45);
    this.setResGr(50);

    this.setStrCap(24);
    this.setSkillCap(25);
    this.setSpeedCap(29);
    this.setDefCap(22);
    this.setResCap(27);
    }
}
