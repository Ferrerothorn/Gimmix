package geneticEmblem.units.factory;

import java.util.ArrayList;

import geneticEmblem.units.generated.*;

public class ClassList {

	ArrayList<Unit> releasedClasses = new ArrayList<Unit>();

	public ClassList() {
		releasedClasses.add(new Eirika());
		releasedClasses.add(new Franz());
		releasedClasses.add(new Gilliam());
		releasedClasses.add(new Ross());
	}

	public ArrayList<Unit> getReleasedUnits() {
		return releasedClasses;
	}

}
