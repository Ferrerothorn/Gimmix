package deckMetagame.units.factory;

import java.util.ArrayList;
import deckMetagame.units.generated.*;

public class ClassList {

	ArrayList<Deck> releasedClasses = new ArrayList<Deck>();

	public ClassList() {

		releasedClasses.add(new Reanimator());
		releasedClasses.add(new Burn());
		releasedClasses.add(new EsperControl());
	}

	public ArrayList<Deck> getReleasedUnits() {
		return releasedClasses;
	}

}
