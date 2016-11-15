package geneticEmblem.units.factory;

import java.util.ArrayList;
import geneticEmblem.units.generated.*;

public class ClassList {

	ArrayList<Unit> releasedClasses = new ArrayList<Unit>();

	public ClassList() {

		releasedClasses.add(new Kaiser());
		releasedClasses.add(new Mercedes());

		releasedClasses.add(new Fighter());
		releasedClasses.add(new Spearman());
		releasedClasses.add(new Page());

		releasedClasses.add(new IceLightning());
		releasedClasses.add(new FlameWizard());
		releasedClasses.add(new FirePoison());
		releasedClasses.add(new Cleric());

		releasedClasses.add(new Hunter());
		releasedClasses.add(new WildHunter());
		releasedClasses.add(new WindBreaker());
		releasedClasses.add(new Crossbowman());

		releasedClasses.add(new Bandit());
		releasedClasses.add(new NightWalker());
		releasedClasses.add(new Assassin());

		releasedClasses.add(new Brawler());
		releasedClasses.add(new Striker());

		releasedClasses.add(new Mechanic());
		releasedClasses.add(new DemonSlayer());
		releasedClasses.add(new Beginner());

		releasedClasses.add(new DemonAvenger());
		releasedClasses.add(new Henehoe());
		releasedClasses.add(new EvilEye());
		releasedClasses.add(new Mihile());
		releasedClasses.add(new Merchant());

	}

	public ArrayList<Unit> getReleasedUnits() {
		return releasedClasses;
	}

}
