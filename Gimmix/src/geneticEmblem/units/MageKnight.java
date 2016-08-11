package geneticEmblem.units;
import geneticEmblem.weapons.*;


public class MageKnight extends Unit {

	public MageKnight() {
		this.setJob("Mage Knight");
		this.setWeapon(new Thunder());
		this.setHpBase(20);
		this.setCurrentHp(this.getHpBase());
		this.setBaseCrit(0);

		this.setStrBase(6);
		this.setSkillBase(7);
		this.setSpeedBase(8);
		this.setLuckBase(7);
		this.setDefBase(4);
		this.setResBase(7);

		this.setHpGr(45);
		this.setStrGr(50);
		this.setSkillGr(45);
		this.setSpeedGr(45);
		this.setLuckGr(65);
		this.setDefGr(15);
		this.setResGr(50);

		this.setStrCap(25);
		this.setSkillCap(24);
		this.setSpeedCap(25);
		this.setDefCap(24);
		this.setResCap(28);
	}

}
