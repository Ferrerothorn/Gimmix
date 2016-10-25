package geneticEmblem.units.factory;

import java.util.ArrayList;
import geneticEmblem.units.generated.*;

public class ClassList {

	ArrayList<Unit> releasedClasses = new ArrayList<Unit>();

	public ClassList() {
		
		releasedClasses.add(new Sandbag());

	}

	public ArrayList<Unit> getReleasedUnits() {
		return releasedClasses;
	}

}
