package geneticMaple.units.factory;

import java.util.ArrayList;

import geneticMaple.units.factory.Unit;
import geneticMaple.units.generated.*;

public class ClassList {

	ArrayList<Unit> releasedClasses = new ArrayList<Unit>();

	public ClassList() {

		releasedClasses.add(new AngelicBuster());
		releasedClasses.add(new Aran());
		releasedClasses.add(new Assassin());
		releasedClasses.add(new Bandit());
		releasedClasses.add(new BattleMage());
		releasedClasses.add(new Beggar());
		releasedClasses.add(new Beginner());
		releasedClasses.add(new Cannoneer());
		releasedClasses.add(new Captain());
		releasedClasses.add(new Cleric());
		releasedClasses.add(new Crossbowman());
		releasedClasses.add(new DemonSlayer());
		releasedClasses.add(new DualBlade());
		releasedClasses.add(new Evan());
		releasedClasses.add(new Fighter());
		releasedClasses.add(new FirePoison());
		releasedClasses.add(new FlameWizard());
		releasedClasses.add(new Gunslinger());
		releasedClasses.add(new Hunter());
		releasedClasses.add(new IceLightning());
		releasedClasses.add(new Jett());
		releasedClasses.add(new Kaiser());
		releasedClasses.add(new Kanna());
		releasedClasses.add(new Luminous());
		releasedClasses.add(new Mechanic());
		releasedClasses.add(new Mercedes());
		releasedClasses.add(new Merchant());
		releasedClasses.add(new NightWalker());
		releasedClasses.add(new NXHoe());
		releasedClasses.add(new Page());
		releasedClasses.add(new Phantom());
		releasedClasses.add(new Spearman());
		releasedClasses.add(new Viper());
		releasedClasses.add(new WildHunter());
		releasedClasses.add(new WindBreaker());
		releasedClasses.add(new Xenon());
	}

	public ArrayList<Unit> getReleasedUnits() {
		return releasedClasses;
	}

}
