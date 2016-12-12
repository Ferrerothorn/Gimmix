package geneticEmblem.units.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import geneticEmblem.weapons.Weapon;

public abstract class Unit {

	String name = "";
	String job = "";
	Weapon weapon;
	int lv = 1;
	int currentHp = 23;
	int baseCrit;

	int HpCap = 60;
	int StrCap = 30;
	int SkillCap = 30;
	int SpeedCap = 30;
	int LuckCap = 30;
	int DefCap = 30;
	int ResCap = 30;

	int HpGr;
	int StrGr;
	int SkillGr;
	int SpeedGr;
	int LuckGr;
	int DefGr;
	int ResGr;

	int HpBase = 0;
	int StrBase;
	int SkillBase;
	int SpeedBase;
	int LuckBase;
	int DefBase;
	int ResBase;

	public Unit() {
		generateName(name);
	}

	public String getName() {
		return name;
	}

	public void setBaseCrit(int n) {
		baseCrit = n;
	}

	public int getBaseCrit() {
		return baseCrit;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getHpCap() {
		return HpCap;
	}

	public int getStrCap() {
		return StrCap;
	}

	public void setStrCap(int strCap) {
		StrCap = strCap;
	}

	public int getSkillCap() {
		return SkillCap;
	}

	public void setSkillCap(int skillCap) {
		SkillCap = skillCap;
	}

	public int getSpeedCap() {
		return SpeedCap;
	}

	public void setSpeedCap(int speedCap) {
		SpeedCap = speedCap;
	}

	public int getLuckCap() {
		return LuckCap;
	}

	public void setLuckCap(int luckCap) {
		LuckCap = luckCap;
	}

	public int getDefCap() {
		return DefCap;
	}

	public void setDefCap(int defCap) {
		DefCap = defCap;
	}

	public int getResCap() {
		return ResCap;
	}

	public void setResCap(int resCap) {
		ResCap = resCap;
	}

	public int getHpGr() {
		return HpGr;
	}

	public void setHpGr(int hpGr) {
		HpGr = hpGr;
	}

	public int getStrGr() {
		return StrGr;
	}

	public void setStrGr(int strGr) {
		StrGr = strGr;
	}

	public int getSkillGr() {
		return SkillGr;
	}

	public void setSkillGr(int skillGr) {
		SkillGr = skillGr;
	}

	public int getSpeedGr() {
		return SpeedGr;
	}

	public void setSpeedGr(int speedGr) {
		SpeedGr = speedGr;
	}

	public int getLuckGr() {
		return LuckGr;
	}

	public void setLuckGr(int luckGr) {
		LuckGr = luckGr;
	}

	public int getDefGr() {
		return DefGr;
	}

	public void setDefGr(int defGr) {
		DefGr = defGr;
	}

	public int getResGr() {
		return ResGr;
	}

	public void setResGr(int resGr) {
		ResGr = resGr;
	}

	public int getHpBase() {
		return HpBase;
	}

	public void setHpBase(int hpBase) {
		HpBase = hpBase;
	}

	public int getStrBase() {
		return StrBase;
	}

	public void setStrBase(int strBase) {
		StrBase = strBase;
	}

	public int getSkillBase() {
		return SkillBase;
	}

	public void setSkillBase(int skillBase) {
		SkillBase = skillBase;
	}

	public int getSpeedBase() {
		return SpeedBase;
	}

	public void setSpeedBase(int speedBase) {
		SpeedBase = speedBase;
	}

	public int getLuckBase() {
		return LuckBase;
	}

	public void setLuckBase(int luckBase) {
		LuckBase = luckBase;
	}

	public int setCurrentHp() {
		return currentHp;
	}

	public void setCurrentHp(int newCHP) {
		currentHp = newCHP;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public int getDefBase() {
		return DefBase;
	}

	public void setDefBase(int defBase) {
		DefBase = defBase;
	}

	public int getResBase() {
		return ResBase;
	}

	public void setResBase(int resBase) {
		ResBase = resBase;
	}

	private void generateName(String name2) {
		ArrayList<String> cons = new ArrayList<String>();
		cons.addAll(Arrays.asList("b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "r", "s", "t", "v", "w",
				"z"));
		ArrayList<String> vow = new ArrayList<String>();
		vow.addAll(Arrays.asList("a", "e", "i", "o", "u", "y"));

		Random r = new Random();
		name += cons.get(r.nextInt(cons.size() - 1));
		name += vow.get(r.nextInt(vow.size() - 1));
		name += cons.get(r.nextInt(cons.size() - 1));
		name += cons.get(r.nextInt(cons.size() - 1));
		name += vow.get(r.nextInt(vow.size() - 1));
		int six = r.nextInt(2);
		if (six == 1) {
			name += cons.get(r.nextInt(cons.size() - 1));
		}
	}

	public String getJob() {
		return job;
	}

	public void setJob(String s) {
		job = s;
	}

	public void swingAt(Unit target) {
		Random r = new Random();
		int thisAccu = 2 * this.getSkillBase() + this.LuckBase + weapon.getAcc() + this.triangleAccuracyBonus(target);
		int thisPower = this.StrBase + weapon.getPow() + this.triangleDamageBonus(target);

		int thisCrit = this.SkillBase / 2 + this.getBaseCrit() + this.weapon.getCrit() - target.getLuckBase();
		int hitDamage;
		if (this.weapon.isPhys()) {
			hitDamage = thisPower - target.DefBase;
		} else {
			hitDamage = thisPower - target.ResBase;
		}

		if (this.weapon.getTraits().contains("Arrow") && target.getWeapon().getTraits().contains("Shield")) {
			hitDamage /= 1.5;
		}

		if (hitDamage < 0) {
			hitDamage = 0;
		}

		int theirAvo = 2 * target.SpeedBase + target.LuckBase;
		int overallHitRate = thisAccu - theirAvo;

		int hit = r.nextInt(100);

		if (hit < overallHitRate) {
			int isCrit = r.nextInt(100);
			if (isCrit <= thisCrit) {
				hitDamage *= 3;
			}
			target.currentHp -= hitDamage;
		}
	}

	private int triangleDamageBonus(Unit target) {
		int bonus = 0;
		if (this.weapon.getTrinity().contains("Melee") && target.weapon.getTrinity().contains("Stealth")) {
			bonus += 1;
		}
		if (this.weapon.getTrinity().contains("Melee") && target.weapon.getTrinity().contains("Seafare")) {
			bonus += 2;
		}
		if (this.weapon.getTrinity().contains("Magic") && target.weapon.getTrinity().contains("Melee")) {
			bonus += 2;
		}
		if (this.weapon.getTrinity().contains("Magic") && target.weapon.getTrinity().contains("Seafare")) {
			bonus += 1;
		}
		if (this.weapon.getTrinity().contains("Seafare") && target.weapon.getTrinity().contains("Bow")) {
			bonus += 1;
		}
		if (this.weapon.getTrinity().contains("Seafare") && target.weapon.getTrinity().contains("Stealth")) {
			bonus += 2;
		}
		if (this.weapon.getTrinity().contains("Bow") && target.weapon.getTrinity().contains("Melee")) {
			bonus += 1;
		}
		if (this.weapon.getTrinity().contains("Bow") && target.weapon.getTrinity().contains("Magic")) {
			bonus += 2;
		}
		if (this.weapon.getTrinity().contains("Stealth") && target.weapon.getTrinity().contains("Magic")) {
			bonus += 1;
		}
		if (this.weapon.getTrinity().contains("Stealth") && target.weapon.getTrinity().contains("Bow")) {
			bonus += 2;
		}		
		if (this.weapon.getTrinity().contains("Melee") && target.weapon.getTrinity().contains("Magic")) {
			bonus -= 2;
		}
		if (this.weapon.getTrinity().contains("Melee") && target.weapon.getTrinity().contains("Bow")) {
			bonus -= 1;
		}
		if (this.weapon.getTrinity().contains("Magic") && target.weapon.getTrinity().contains("Bow")) {
			bonus -= 2;
		}
		if (this.weapon.getTrinity().contains("Magic") && target.weapon.getTrinity().contains("Stealth")) {
			bonus -= 1;
		}
		if (this.weapon.getTrinity().contains("Stealth") && target.weapon.getTrinity().contains("Melee")) {
			bonus -= 1;
		}
		if (this.weapon.getTrinity().contains("Stealth") && target.weapon.getTrinity().contains("Seafare")) {
			bonus -= 2;
		}
		if (this.weapon.getTrinity().contains("Seafare") && target.weapon.getTrinity().contains("Melee")) {
			bonus -= 2;
		}
		if (this.weapon.getTrinity().contains("Seafare") && target.weapon.getTrinity().contains("Magic")) {
			bonus -= 1;
		}
		if (this.weapon.getTrinity().contains("Bow") && target.weapon.getTrinity().contains("Stealth")) {
			bonus -= 2;
		}
		if (this.weapon.getTrinity().contains("Bow") && target.weapon.getTrinity().contains("Seafare")) {
			bonus -= 1;
		}
		return bonus;
	}

	private int triangleAccuracyBonus(Unit target) {
		int bonus = 0;
		if (this.weapon.getTrinity().contains("Melee") && target.weapon.getTrinity().contains("Stealth")) {
			bonus += 10;
		}
		if (this.weapon.getTrinity().contains("Melee") && target.weapon.getTrinity().contains("Seafare")) {
			bonus += 20;
		}
		if (this.weapon.getTrinity().contains("Magic") && target.weapon.getTrinity().contains("Melee")) {
			bonus += 20;
		}
		if (this.weapon.getTrinity().contains("Magic") && target.weapon.getTrinity().contains("Seafare")) {
			bonus += 10;
		}
		if (this.weapon.getTrinity().contains("Seafare") && target.weapon.getTrinity().contains("Bow")) {
			bonus += 10;
		}
		if (this.weapon.getTrinity().contains("Seafare") && target.weapon.getTrinity().contains("Stealth")) {
			bonus += 20;
		}
		if (this.weapon.getTrinity().contains("Bow") && target.weapon.getTrinity().contains("Melee")) {
			bonus += 10;
		}
		if (this.weapon.getTrinity().contains("Bow") && target.weapon.getTrinity().contains("Magic")) {
			bonus += 20;
		}
		if (this.weapon.getTrinity().contains("Stealth") && target.weapon.getTrinity().contains("Bow")) {
			bonus += 20;
		}
		if (this.weapon.getTrinity().contains("Stealth") && target.weapon.getTrinity().contains("Magic")) {
			bonus += 10;
		}
		if (this.weapon.getTrinity().contains("Stealth") && target.weapon.getTrinity().contains("Melee")) {
			bonus -= 10;
		}
		if (this.weapon.getTrinity().contains("Seafare") && target.weapon.getTrinity().contains("Melee")) {
			bonus -= 20;
		}
		if (this.weapon.getTrinity().contains("Melee") && target.weapon.getTrinity().contains("Magic")) {
			bonus -= 20;
		}
		if (this.weapon.getTrinity().contains("Seafare") && target.weapon.getTrinity().contains("Magic")) {
			bonus -= 10;
		}
		if (this.weapon.getTrinity().contains("Melee") && target.weapon.getTrinity().contains("Bow")) {
			bonus -= 10;
		}
		if (this.weapon.getTrinity().contains("Magic") && target.weapon.getTrinity().contains("Bow")) {
			bonus -= 20;
		}
		if (this.weapon.getTrinity().contains("Magic") && target.weapon.getTrinity().contains("Stealth")) {
			bonus -= 10;
		}
		if (this.weapon.getTrinity().contains("Bow") && target.weapon.getTrinity().contains("Stealth")) {
			bonus -= 20;
		}
		if (this.weapon.getTrinity().contains("Bow") && target.weapon.getTrinity().contains("Seafare")) {
			bonus -= 10;
		}		
		if (this.weapon.getTrinity().contains("Stealth") && target.weapon.getTrinity().contains("Seafare")) {
			bonus -= 20;
		}
		return bonus;
	}
	
	public boolean greatlyOutspeeds(Unit target) {
		if (SpeedBase - 4 >= target.SpeedBase) {
			return true;
		}
		return false;
	}

	public Unit fight(Unit opponent) {

		Unit victor = null;

		if (this.getJob().equals(opponent.getJob())) {
			int thistotal = this.getHpBase() + this.getStrBase() + this.getSkillBase() + this.getLuckBase()
					+ this.getSpeedBase() + this.getDefBase() + this.getResBase();
			int unit2total = opponent.getHpBase() + opponent.getStrBase() + opponent.getSkillBase()
					+ opponent.getLuckBase() + opponent.getSpeedBase() + opponent.getDefBase() + opponent.getResBase();
			if (unit2total > thistotal) {
				victor = opponent;
			} else {
				victor = this;
			}
		} else {
			int turnCounter = 1;
			while (this.isAlive() && opponent.isAlive() && turnCounter < 51) {
				if (this.isAlive() && opponent.isAlive()) {
					this.swingAt(opponent);
				}
				if (this.isAlive() && opponent.isAlive()) {
					opponent.swingAt(this);
				}
				if (this.isAlive() && opponent.isAlive() && this.greatlyOutspeeds(opponent)
						&& !opponent.greatlyOutspeeds(this)) {
					this.swingAt(opponent);
				} else if (this.isAlive() && opponent.isAlive() && !this.greatlyOutspeeds(opponent)
						&& opponent.greatlyOutspeeds(this)) {
					opponent.swingAt(this);
				}
				turnCounter++;
			}

			if (this.isAlive() && !opponent.isAlive()) {
				victor = this;
			} else if (!this.isAlive() && opponent.isAlive()) {
				victor = opponent;
			} else {
				int thistotal = this.getHpBase() + this.getStrBase() + this.getSkillBase() + this.getLuckBase()
						+ this.getSpeedBase() + this.getDefBase() + this.getResBase();
				int unit2total = opponent.getHpBase() + opponent.getStrBase() + opponent.getSkillBase()
						+ opponent.getLuckBase() + opponent.getSpeedBase() + opponent.getDefBase()
						+ opponent.getResBase();
				if (unit2total > thistotal) {
					victor = opponent;
				} else {
					victor = this;
				}
			}
		}
		return victor;
	}

	public void levelUp() {
		if (lv < 40) {
			lv++;
			Random r = new Random();

			int growthPerc = r.nextInt(100);
			if (growthPerc < HpGr && HpBase < HpCap) {
				HpBase++;
			}
			growthPerc = r.nextInt(100);
			if (growthPerc < StrGr && StrBase < StrCap) {
				StrBase++;
			}
			growthPerc = r.nextInt(100);
			if (growthPerc < SkillGr && SkillBase < SkillCap) {
				SkillBase++;
			}
			growthPerc = r.nextInt(100);
			if (growthPerc < SpeedGr && SpeedBase < SpeedCap) {
				SpeedBase++;
			}
			growthPerc = r.nextInt(100);
			if (growthPerc < LuckGr && LuckBase < LuckCap) {
				LuckBase++;
			}
			growthPerc = r.nextInt(100);
			if (growthPerc < DefGr && DefBase < DefCap) {
				DefBase++;
			}
			growthPerc = r.nextInt(100);
			if (growthPerc < ResGr && ResBase < ResCap) {
				ResBase++;
			}
			this.currentHp = this.HpBase;
		}
	}

	public int getCurrentHp() {
		return this.currentHp;
	}

	public boolean isAlive() {
		if (this.getCurrentHp() > 0) {
			return true;
		}
		return false;
	}

	public void printDetailedUnitDescription(int i) {
		System.out.println("" + i + ": " + this.getName() + " the " + this.getJob() + ". " + "Lv: " + this.getLv()
				+ ", HP: " + this.getHpBase() + ", Str: " + this.getStrBase() + ", Skill: " + this.getSkillBase()
				+ ", Speed: " + this.getSpeedBase() + ", Luck: " + this.getLuckBase() + ", Def: " + this.getDefBase()
				+ ", Res: " + this.getResBase() + ".");
	}

}
