package deckMetagame.units.factory;

import java.util.ArrayList;
import deckMetagame.units.generated.*;

public class ListOfDecks {

	ArrayList<Deck> releasedClasses = new ArrayList<Deck>();

	public ListOfDecks() {

		releasedClasses.add(new Infect());
		releasedClasses.add(new Jund());
		releasedClasses.add(new Tron());
		releasedClasses.add(new Dredge());
		releasedClasses.add(new NayaBurn());
		releasedClasses.add(new Affinity());
		releasedClasses.add(new Merfolk());
		releasedClasses.add(new Abzan());
		releasedClasses.add(new WRPrison());
		releasedClasses.add(new ValakutBreach());
		releasedClasses.add(new GrixisControl());
		releasedClasses.add(new LanternControl());
		releasedClasses.add(new BantEldrazi());
		releasedClasses.add(new Infect());
		releasedClasses.add(new JeskaiControl());
	}

	public ArrayList<Deck> getReleasedUnits() {
		return releasedClasses;
	}

}
