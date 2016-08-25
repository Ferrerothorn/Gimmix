package geneticEmblem.units.ootb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import geneticEmblem.weapons.Weapon;

public abstract class Unit {

	String name = "";
	String job = "";
	ArrayList<String> traits = new ArrayList<String>();
	Weapon weapon;
	int lv = 1;
	int currentHp;
	int baseCrit;

	int HpCap = 60;
	int StrCap;
	int SkillCap;
	int SpeedCap;
	int LuckCap = 30;
	int DefCap;
	int ResCap;

	int HpGr;
	int StrGr;
	int SkillGr;
	int SpeedGr;
	int LuckGr;
	int DefGr;
	int ResGr;

	int HpBase;
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

	public void addTrait(String trait) {
		traits.add(trait);
	}

	public void swingAt(Unit target) {
		Random r = new Random();
		int thisAccu = 2 * this.getSkillBase() + this.LuckBase + weapon.getAcc() + this.triangleAccuracyBonus(target);
		int thisPower = this.StrBase + weapon.getPow() + this.triangleDamageBonus(target);

		if (this.weapon.getTraits().contains("Luna")) {
			thisPower += target.getResBase();
		}

		if (this.weapon.getTraits().contains("Arrow") && (target.getTraits().contains("Flying"))) {
			thisPower += 2 * weapon.getPow();
		}

		int thisCrit = this.SkillBase / 2 + this.getBaseCrit() + this.weapon.getCrit() - target.getLuckBase();
		int hitDamage;
		if (this.weapon.isPhys()) {
			hitDamage = thisPower - target.DefBase;
		} else {
			hitDamage = thisPower - target.ResBase;
		}

		if (this.weapon.getTraits().contains("Arrow") && target.getWeapon().getTraits().contains("Shield")) {
			hitDamage /= 1.6;
		}

		if (hitDamage < 0) {
			hitDamage = 0;
		}

		int theirAvo = 2 * target.SpeedBase + target.LuckBase;
		int overallHitRate = thisAccu - theirAvo;

		int hit = r.nextInt(100);

		if (this.getJob().equals("Sniper")) {
			int sureStrike = r.nextInt(100);
			if (sureStrike <= this.getSkillBase()) {
				// System.out.println("SURE STRIKE");
				overallHitRate = 999;
			}
		}

		if (hit < overallHitRate) {
			// System.out.println("And hits, for " + hitDamage + " damage! " +
			// "[" + target.getName() + ": "
			// + target.getCurrentHp() + "/" + target.getHpBase() + "]");

			int isCrit = r.nextInt(100);
			if (isCrit <= thisCrit) {
				// System.out.println("CRITICAL!");
				hitDamage *= 3;
			}
			if (target.getJob().contains("General")) {
				int greatShield = r.nextInt(100);
				if (greatShield <= target.getSkillBase()) {
					// System.out.println("GREAT SHIELD!");
					hitDamage = 0;
				}
			}

			if (this.getJob().equals("Assassin")) {
				int instaKill = r.nextInt(100);
				if (instaKill <= this.getSkillBase()) {
					// System.out.println("KILLING BLOW!");
					hitDamage = target.getCurrentHp();
				}
			}

			target.currentHp -= hitDamage;
			if (this.weapon.getTraits().contains("Lifelink")) {
				this.currentHp += hitDamage;
			}
			if (this.currentHp > this.HpBase) {
				currentHp = this.getHpBase();
			}
		} else {
			// System.out.println("But misses...");
		}
	}

	private ArrayList<String> getTraits() {
		return traits;
	}

	private int triangleDamageBonus(Unit target) {

		if (this.weapon.getTrinity().equals("Gun")
				&& (target.weapon.getTrinity().equals("Axe") || target.weapon.getTrinity().equals("Lance") || target.weapon.getTrinity().equals("Dark"))) {
			return 1;
		}
		if (this.weapon.getTrinity().equals("Bow") && target.weapon.getTrinity().equals("Claw")) {
			return 1;
		}
		if (this.weapon.getTrinity().equals("Claw") && target.weapon.getTrinity().equals("Shield")) {
			return 1;
		}
		if (this.weapon.getTrinity().equals("Shield") && target.weapon.getTrinity().equals("Bow")) {
			return 1;
		}
		if (this.weapon.getTrinity().equals("Lance") && target.weapon.getTrinity().equals("Sword")) {
			return 1;
		}
		if (this.weapon.getTrinity().equals("Sword") && target.weapon.getTrinity().equals("Axe")) {
			return 1;
		}
		if (this.weapon.getTrinity().equals("Axe") && target.weapon.getTrinity().equals("Lance")) {
			return 1;
		}
		if (this.weapon.getTrinity().equals("Anima") && target.weapon.getTrinity().equals("Light")) {
			return 1;
		}
		if (this.weapon.getTrinity().equals("Light") && target.weapon.getTrinity().equals("Dark")) {
			return 1;
		}
		if (this.weapon.getTrinity().equals("Dark") && target.weapon.getTrinity().equals("Anima")) {
			return 1;
		}
		if (this.weapon.getTrinity().equals("Sword") && target.weapon.getTrinity().equals("Lance")) {
			return -1;
		}
		if (this.weapon.getTrinity().equals("Lance") && target.weapon.getTrinity().equals("Axe")) {
			return -1;
		}
		if (this.weapon.getTrinity().equals("Axe") && target.weapon.getTrinity().equals("Sword")) {
			return -1;
		}
		if (this.weapon.getTrinity().equals("Dark") && target.weapon.getTrinity().equals("Light")) {
			return -1;
		}
		if (this.weapon.getTrinity().equals("Light") && target.weapon.getTrinity().equals("Anima")) {
			return -1;
		}
		if (this.weapon.getTrinity().equals("Anima") && target.weapon.getTrinity().equals("Dark")) {
			return -1;
		}
		if (this.weapon.getTrinity().equals("Claw") && target.weapon.getTrinity().equals("Bow")) {
			return -1;
		}
		if (this.weapon.getTrinity().equals("Shield") && target.weapon.getTrinity().equals("Claw")) {
			return -1;
		}
		if (this.weapon.getTrinity().equals("Bow") && target.weapon.getTrinity().equals("Shield")) {
			return -1;
		}
		if (this.weapon.getTrinity().equals("Gun")
				&& (target.weapon.getTrinity().equals("Anima") || target.weapon.getTrinity().equals("Light")
						|| target.weapon.getTrinity().equals("Shield"))) {
			return -1;
		}
		return 0;
	}

	private int triangleAccuracyBonus(Unit target) {

		if (this.weapon.getTrinity().equals("Gun")
				&& (target.weapon.getTrinity().equals("Lance") || target.weapon.getTrinity().equals("Axe")
						|| target.weapon.getTrinity().equals("Dark"))) {
			return 15;
		}
		if (this.weapon.getTrinity().equals("Bow") && target.weapon.getTrinity().equals("Claw")) {
			return 15;
		}
		if (this.weapon.getTrinity().equals("Claw") && target.weapon.getTrinity().equals("Shield")) {
			return 15;
		}
		if (this.weapon.getTrinity().equals("Shield") && target.weapon.getTrinity().equals("Bow")) {
			return 15;
		}
		if (this.weapon.getTrinity().equals("Lance") && target.weapon.getTrinity().equals("Sword")) {
			return 15;
		}
		if (this.weapon.getTrinity().equals("Sword") && target.weapon.getTrinity().equals("Axe")) {
			return 15;
		}
		if (this.weapon.getTrinity().equals("Axe") && target.weapon.getTrinity().equals("Lance")) {
			return 15;
		}
		if (this.weapon.getTrinity().equals("Anima") && target.weapon.getTrinity().equals("Light")) {
			return 15;
		}
		if (this.weapon.getTrinity().equals("Light") && target.weapon.getTrinity().equals("Dark")) {
			return 15;
		}
		if (this.weapon.getTrinity().equals("Dark") && target.weapon.getTrinity().equals("Anima")) {
			return 15;
		}
		if (this.weapon.getTrinity().equals("Gun")
				&& (target.weapon.getTrinity().equals("Anima") || target.weapon.getTrinity().equals("Light")
					 || target.weapon.getTrinity().equals("Shield"))) {
			return -15;
		}
		if (this.weapon.getTrinity().equals("Sword") && target.weapon.getTrinity().equals("Lance")) {
			return -15;
		}
		if (this.weapon.getTrinity().equals("Lance") && target.weapon.getTrinity().equals("Axe")) {
			return -15;
		}
		if (this.weapon.getTrinity().equals("Axe") && target.weapon.getTrinity().equals("Sword")) {
			return -15;
		}
		if (this.weapon.getTrinity().equals("Dark") && target.weapon.getTrinity().equals("Light")) {
			return -15;
		}
		if (this.weapon.getTrinity().equals("Light") && target.weapon.getTrinity().equals("Anima")) {
			return -15;
		}
		if (this.weapon.getTrinity().equals("Anima") && target.weapon.getTrinity().equals("Dark")) {
			return -15;
		}
		if (this.weapon.getTrinity().equals("Claw") && target.weapon.getTrinity().equals("Bow")) {
			return -15;
		}
		if (this.weapon.getTrinity().equals("Shield") && target.weapon.getTrinity().equals("Claw")) {
			return -15;
		}
		if (this.weapon.getTrinity().equals("Bow") && target.weapon.getTrinity().equals("Shield")) {
			return -15;
		}
		return 0;
	}

	public boolean greatlyOutspeeds(Unit target) {
		if (SpeedBase - 4 >= target.SpeedBase) {
			return true;
		}
		return false;
	}

	public Unit fight(Unit opponent) {

		// System.out.println("Behold, " + this.getName() + " the Lv" +
		// this.getLv() + " " + this.getJob() + "!");
		// System.out.println("Versus " + unit2.getName() + " the Lv" +
		// unit2.getLv() + " " + unit2.getJob() + "!");
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
					// System.out.println(this.getName() + " swings at " +
					// unit2.getName() + "!");
					this.swingAt(opponent);
				}
				if (this.isAlive() && opponent.isAlive()) {
					// System.out.println(unit2.getName() + " swings at " +
					// this.getName() + "!");
					opponent.swingAt(this);
				}
				if (this.isAlive() && opponent.isAlive() && this.greatlyOutspeeds(opponent)
						&& !opponent.greatlyOutspeeds(this)) {
					// System.out.println(this.getName() + " swings at " +
					// unit2.getName() + "!");
					this.swingAt(opponent);
				} else if (this.isAlive() && opponent.isAlive() && !this.greatlyOutspeeds(opponent)
						&& opponent.greatlyOutspeeds(this)) {
					// System.out.println(unit2.getName() + " swings at " +
					// this.getName() + "!");
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
