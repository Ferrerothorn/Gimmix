package geneticEmblem.units.factory;

import java.util.ArrayList;

import geneticEmblem.units.generated.*;

public class ClassList {

	ArrayList<Unit> releasedClasses = new ArrayList<>();

	public ClassList() {
		releasedClasses.add(new Amelia());
		releasedClasses.add(new Eirika());
		releasedClasses.add(new Forde());
		releasedClasses.add(new Ross());
		releasedClasses.add(new Duessel());
		releasedClasses.add(new Neimi());
	}

	public ArrayList<Unit> getReleasedUnits() {
		return releasedClasses;
	}
}