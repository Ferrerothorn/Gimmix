package geneticMaple.units.factory;

import java.util.ArrayList;

import geneticMaple.units.factory.Unit;
import geneticMaple.units.generated.*;

public class ClassList {

	ArrayList<Unit> releasedClasses = new ArrayList<>();

	public ClassList() {

		releasedClasses.add(new Assassin());
		releasedClasses.add(new Bandit());
		releasedClasses.add(new Captain());
		releasedClasses.add(new Cleric());
		releasedClasses.add(new Crossbowman());
		releasedClasses.add(new Fighter());
		releasedClasses.add(new FirePoison());
		releasedClasses.add(new Gunslinger());
		releasedClasses.add(new Hunter());
		releasedClasses.add(new IceLightning());
		releasedClasses.add(new Page());
		releasedClasses.add(new Spearman());
		releasedClasses.add(new Viper());
	}

	public ArrayList<Unit> getReleasedUnits() {
		return releasedClasses;
	}

}
