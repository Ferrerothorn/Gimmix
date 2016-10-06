package geneticEmblem.units.factory;

import java.util.ArrayList;

import geneticEmblem.units.generated.*;

public class ClassList {

	ArrayList<Unit> releasedClasses = new ArrayList<Unit>();

	public ClassList() {

		releasedClasses.add(new Assassin());
		releasedClasses.add(new Bandit());
		releasedClasses.add(new Cleric());
		releasedClasses.add(new FirePoison());
		releasedClasses.add(new Hunter());
		releasedClasses.add(new IceLightning());
		releasedClasses.add(new Page());
		releasedClasses.add(new Spearman());
		
		releasedClasses.add(new Tarmogoyf());
		releasedClasses.add(new Beginner());
	}

	public ArrayList<Unit> getReleasedUnits() {
		return releasedClasses;
	}

}
