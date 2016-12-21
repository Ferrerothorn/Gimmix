package deckMetagame.units.factory;

import java.util.ArrayList;
import deckMetagame.units.generated.*;

public class ListOfDecks {

	ArrayList<Deck> releasedClasses = new ArrayList<Deck>();

	public ListOfDecks() {

		releasedClasses.add(new Reanimator());
		releasedClasses.add(new Abzan());
		releasedClasses.add(new Burn());
		releasedClasses.add(new EsperControl());
		releasedClasses.add(new Dredge());
		releasedClasses.add(new Miracles());
		releasedClasses.add(new DrawGo());
		releasedClasses.add(new ShardlessBug());
		releasedClasses.add(new ANT());
	}

	public ArrayList<Deck> getReleasedUnits() {
		return releasedClasses;
	}

}
