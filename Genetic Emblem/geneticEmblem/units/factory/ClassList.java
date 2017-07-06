package geneticEmblem.units.factory;

import java.util.ArrayList;

import geneticEmblem.units.generated.*;

public class ClassList {

	ArrayList<Unit> releasedClasses = new ArrayList<>();

	public ClassList() {
		releasedClasses.add(new Amelia());
	}

	public ArrayList<Unit> getReleasedUnits() {
		return releasedClasses;
	}
}