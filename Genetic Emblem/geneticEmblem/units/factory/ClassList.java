package geneticEmblem.units.factory;

import java.util.ArrayList;

import geneticEmblem.newfags.Garcia;
import geneticEmblem.units.generated.*;

public class ClassList {

	ArrayList<Unit> releasedClasses = new ArrayList<>();

	public ClassList() {
		releasedClasses.add(new Amelia());
		releasedClasses.add(new Eirika());
		releasedClasses.add(new Ross());
		}

	public ArrayList<Unit> getReleasedUnits() {
		return releasedClasses;
	}
}