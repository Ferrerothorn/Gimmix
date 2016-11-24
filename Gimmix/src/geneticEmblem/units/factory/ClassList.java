package geneticEmblem.units.factory;

import java.util.ArrayList;
import geneticEmblem.units.generated.*;

public class ClassList {

	ArrayList<Unit> releasedClasses = new ArrayList<Unit>();

	public ClassList() {

		releasedClasses.add(new Assassin());
		releasedClasses.add(new Bandit());
		releasedClasses.add(new BattleMage());
		releasedClasses.add(new Beginner());
		releasedClasses.add(new Cleric());
		releasedClasses.add(new Crossbowman());
		releasedClasses.add(new DemonSlayer());
		releasedClasses.add(new DualBlade());
		releasedClasses.add(new Fighter());
		releasedClasses.add(new FirePoison());
		releasedClasses.add(new FlameWizard());
		releasedClasses.add(new Gunslinger());
		releasedClasses.add(new Henehoe());
		releasedClasses.add(new Hunter());
		releasedClasses.add(new IceLightning());
		releasedClasses.add(new Kaiser());
		releasedClasses.add(new Mechanic());
		releasedClasses.add(new Mercedes());
		releasedClasses.add(new Merchant());
		releasedClasses.add(new NightWalker());
		releasedClasses.add(new Nobless());
		releasedClasses.add(new NXHoe());
		releasedClasses.add(new Page());
		releasedClasses.add(new Spearman());
		releasedClasses.add(new Viper());
		releasedClasses.add(new WildHunter());
		releasedClasses.add(new WindBreaker());
	}

	public ArrayList<Unit> getReleasedUnits() {
		return releasedClasses;
	}

}
